package duplicateTasks;


import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DBCPUtils {
	
    private static DataSource dataSource;
    static {
 
        try {
            InputStream in = DBCPUtils.class.getClassLoader().getResourceAsStream("dbcpconfig.properties");
            Properties props = new Properties();
            props.load(in);
            dataSource = BasicDataSourceFactory.createDataSource(props);
  
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError(e);
        }
    }
    /**
     * 获取DataSource对象
     * @return
     */
    public static DataSource getDataSource() {
        return dataSource;
    }
}