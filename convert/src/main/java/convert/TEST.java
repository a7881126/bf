package convert;

import java.sql.*;

public class TEST {




	public static void main(String[] args)

	{

		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

		String dbURL = "jdbc:sqlserver://192.168.10.252:1433;databaseName=EBAP";
		

		String userName = "sa";

		String userPwd = "Aa123";

		Connection dbConn = null;

		try

		{

			Class.forName(driverName);

			dbConn = DriverManager.getConnection(dbURL, userName, userPwd);

			System.out.println("�������ݿ�ɹ�");

		}

		catch (Exception e)

		{

			e.printStackTrace();

			System.out.print("����ʧ��");

		}

	}

}
