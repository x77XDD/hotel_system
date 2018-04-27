package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtils {
	private String dbUrl = "jdbc:sqlserver://localhost;DatabaseName=Hotel"; // 数据库连接地址
	private String dbUserName = "sa"; // 用户名
	private String dbPassword = "123456"; // 密码
	private String jdbcName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	Connection con = null;

	/**
	 * 获取数据库连接
	 * 
	 * @return
	 * @throws Exception
	 */
	public Connection getCon() {
		try {
			Class.forName(jdbcName);
			con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			return con;

		}
	}

	public void closeCon(Connection con) {
		try {
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		DbUtils dbUtil=new DbUtils();
		try {
			dbUtil.getCon();
			System.out.println("数据库连接成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库连接失败");
		}
	}
}
