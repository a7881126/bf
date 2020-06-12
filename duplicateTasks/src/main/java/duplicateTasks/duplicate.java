package duplicateTasks;


import java.io.File;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;

public class duplicate {
	
	public static final String PATH = "C:/EBAP/Plugins/EBAP.SalesOrderManagementPlugin/Upload/Orderfile/";
	public static final Float LMP_0018_24_PRICE = 308F;
	public static final Float LMP_0018_27_PRICE = 336F;
	public static final Float LZQ01_2400_PRICE = 168F;
	public static final Float LZQ01_2700_PRICE = 196F;
	public static final String LMP_0018_24 = "LMP_0018_24";
	public static final String LMP_0018_27 = "LMP_0018_27";
	public static final String LZQ01_2400  = "LZQ01_2400";
	public static final String LZQ01_2700  = "LZQ01_2700";
	
	
	public static DataSource dataSource = DBCPUtils.getDataSource();
	public static QueryRunner qr = new QueryRunner(dataSource);
	
	
	
	
	public static void main(String[] args) throws SQLException {

		SimpleDateFormat sdf = new SimpleDateFormat();// ��ʽ��ʱ��
		SimpleDateFormat sdf2 = new SimpleDateFormat();// ��ʽ��ʱ��
		SimpleDateFormat sdf3 = new SimpleDateFormat();// ��ʽ��ʱ��
		sdf.applyPattern("yyyy");
		sdf2.applyPattern("MM");
		sdf3.applyPattern("yyMMdd");
		String year = null;
		String month = null;
		Integer numberId = 0;
		String order = null;
		String time = null;
		String newOrder = null;
		
		
		while (true) {
			Calendar calendar = Calendar.getInstance();
			Date date = calendar.getTime();// ��ȡ��ǰʱ��
			time = "F" + sdf3.format(date);
			Timestamp nousedate = new Timestamp(date.getTime());
			year = sdf.format(date);
			month = null;
			if ("0".equals(sdf2.format(date).substring(0, 1))) {
				month = sdf2.format(date).substring(1, 2);
			} else {
				month = sdf2.format(date);
			}
			try {
				// �ж��Ƿ���������
				T_MYWaterNumber mYWaterNumber = qr.query("select * from T_MYWaterNumber where Yare = ? and  Month = ? ",
						new BeanHandler<T_MYWaterNumber>(T_MYWaterNumber.class), year, month);
				if (mYWaterNumber == null) {
					qr.update("insert into T_MYWaterNumber (Yare,Month,NumberId,CreatedTime) values(?,?,?,?)", year,
							month, numberId, nousedate);
				}
				// ��ȡ��ǰ��ˮ��
				// ���÷���queryִ�в�ѯ,�������Ӷ���,SQL���,�����������ʽ��ʵ����
				// ���ض�������
				Object[] res = qr.query("SELECT NumberId FROM T_MYWaterNumber WHERE  Yare = ? and Month = ?",
						new ArrayHandler(), year, month);
				for (Object obj : res) {
					numberId = Integer.parseInt(obj.toString());
				}

				// ����query����,����������Ĳ�����,����ʵ����ArrayListHandler
				// ��������ֵ ÿ����һ����������,�洢��List
				List<Object[]> result = qr.query(
						"SELECT SalesOrderId FROM  T_SalesOrder WHERE OrderType_Id = ? and SalesOrderId like ?",
						new ArrayListHandler(), 2007, "WT%");
				// �鵽һ���������޸�һ�������ţ��Ͷ�Ӧ��·���ļ�������
				// ���ϵı���
				for (Object[] objs : result) {
					// ������������ �ж���ΪNull ��ô��
					for (Object obj : objs) {
						order = String.valueOf(obj);
						System.out.println(order);
					}
					// ������϶���ֵ��ûֵ�Ͳ���ѭ���´β��ˡ�
					if (numberId < 10) {
						newOrder = time + "00" + numberId;
						qr.update(
								"update T_SalesOrder  set SalesOrderId = ? from  T_SalesOrder  WHERE  SalesOrderId = ?",
								newOrder, order);
					} else if (numberId > 9) {
						newOrder = time + "0" + numberId;
						qr.update(
								"update T_SalesOrder  set SalesOrderId = ? from  T_SalesOrder  WHERE  SalesOrderId = ?",
								newOrder, order);
					} else if (numberId > 99) {
						newOrder = time + numberId;
						qr.update(
								"update T_SalesOrder  set SalesOrderId = ? from  T_SalesOrder  WHERE  SalesOrderId = ?",
								newOrder, order);
					}
					qr.update(
							"update T_MYWaterNumber  set NumberId = ?  from  T_MYWaterNumber WHERE Yare = ? and Month = ?",
							++numberId, year, month);
					new File(PATH + order).renameTo(new File(PATH + newOrder));

				}
				
				
				List<Object[]> result_LMP_0018_24 = getId(LMP_0018_24);
				updatePrice(result_LMP_0018_24,LMP_0018_24_PRICE);


				List<Object[]> result_LMP_0018_27 = getId(LMP_0018_27);
				updatePrice(result_LMP_0018_27,LMP_0018_27_PRICE);

				
				List<Object[]> result_LZQ01_2400  = getId(LZQ01_2400);
				updatePrice(result_LZQ01_2400,LZQ01_2400_PRICE);

				
				List<Object[]> result_LZQ01_2700  =	getId(LZQ01_2700);	
				updatePrice(result_LZQ01_2700,LZQ01_2700_PRICE);
				
				
				
				
				
				
				
				//����5��
				Thread.sleep (5000);
				
	
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
	}
	
	/**
	 * ��ȡID �������޸�
	 * @param str
	 * @return
	 */
	public static List<Object[]> getId(String str){
		List<Object[]> result = null;
		try {
			result = qr.query("SELECT Id FROM  T_BOM_ItemDetail WHERE DetailPrice = 0 and Cpid = ?",
					new ArrayListHandler(), str);		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;	
	}
	
	/**
	 * 
	 * @param result
	 * @param price
	 */
	public static void updatePrice(List<Object[]> result,Float price){
		for (Object[] objs : result) {
			for (Object obj : objs) {
				try {
					qr.update("update T_BOM_ItemDetail  set DetailPrice = ?  from  T_BOM_ItemDetail WHERE Id = ?",price,String.valueOf(obj));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}	
	}
	
}