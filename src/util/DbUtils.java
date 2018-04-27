package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtils {
	private String dbUrl = "jdbc:sqlserver://localhost;DatabaseName=Hotel"; // ���ݿ����ӵ�ַ
	private String dbUserName = "sa"; // �û���
	private String dbPassword = "123456"; // ����
	private String jdbcName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	Connection con = null;

	/**
	 * ��ȡ���ݿ�����
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
			System.out.println("���ݿ����ӳɹ���");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��");
		}
	}
}
