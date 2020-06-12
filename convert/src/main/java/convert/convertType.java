package convert;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import org.apache.commons.dbutils.handlers.MapListHandler;

public class convertType {

	
	

	public static void main(String[] args) throws SQLException {
		
		
		
		DataSource dataSource = DBCPUtils.getDataSource();
		

		Map<String, String > map1 = new HashMap<String, String >();
		map1.put("int", "Integer");
		map1.put("varchar", "String");
		map1.put("char", "String");
		map1.put("nchar", "String");
		map1.put("nvarchar", "String");
		map1.put("text", "String");
		map1.put("ntext", "String");
		map1.put("tinyint", "Integer");
		map1.put("smallint", "Integer");
		map1.put("bit", "Boolean");
		map1.put("float", "Double");
		map1.put("decimal", "BigDecimal");
		map1.put("money", "BigDecimal");
		map1.put("smallmoney", "BigDecimal");
		map1.put("numeric", "BigDecimal");
		map1.put("real", "Float");
		map1.put("uniqueidentifier", "String");
		map1.put("smalldatetime", "Timestamp");
		map1.put("datetime", "Timestamp");
		map1.put("timestamp", "byte[]");
		map1.put("binary", "byte[]");
		map1.put("varbinary", "byte[]");
		map1.put("image", "byte[]");
		map1.put("sql_variant", "String");

		QueryRunner qr = new QueryRunner(dataSource);
		String sql = " SELECT      \r\n" + 
				"  字段名=a.name,   \r\n" + 
				"  类型=b.name\r\n" + 
				"  FROM   syscolumns   a   \r\n" + 
				"  left   join   systypes   b   on   a.xtype=b.xusertype   \r\n" + 
				"  inner   join   sysobjects   d   on   a.id=d.id     and   d.xtype='U'   and     d.name<>'dtproperties'   \r\n" + 
				"  left   join   syscomments   e   on   a.cdefault=e.id   \r\n" + 
				"  left   join   sys.extended_properties g   on   a.id=g.major_id   and   a.colid=g.minor_id          \r\n" + 
				"  left   join   sys.extended_properties f   on   d.id=f.major_id   and   f.minor_id   =0   \r\n" + 
				"  where   d.name='T_BOM_ItemDetail'";
		//调用方法query,传递结果集实现类MapListHandler
		//返回值List集合, 存储的是Map集合
		List<Map<String,Object>> list = qr.query(sql, new MapListHandler());
		//遍历集合list
		
		for( Map<String,Object> map : list ){
			String str = "";
			String str2 = "";
			for(String key : map.keySet()){
				if("类型".equals(key)) {
					System.out.println("public "+map1.get(map.get(key))+" "+str+";");		
				}else if("字段名".equals(key)){
					str = (String)map.get(key);		
					str2 = str.substring(0,1).toLowerCase();
					str = str2+str.substring(1,str.length());
				}

			}
			System.out.println();
		}
		
		

	
	}	
}
