package AllDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import util.StringUtil;

import util.DbUtils;

import model.User;

public class UserDao {
	DbUtils dbUtils = new DbUtils();
	Connection con=null;
	public  User login(User user) {
		User resultUser = null;
		try {
			con = dbUtils.getCon();	
			String sql = "select * from QLogin where QId=? and QPwd=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getQId());
			pstmt.setString(2, user.getQPwd());
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				resultUser = new User();
				resultUser.setQId(rs.getString("QId"));
				resultUser.setQPwd(rs.getString("QPwd"));
			}			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbUtils.closeCon(con);
		}
        return resultUser;
	}
	
	public List<User> list(User bookType) {
		List<User> username = new ArrayList<User>();
		try {
			con = dbUtils.getCon();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = "select * from QLogin";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			User use = null;
			while (rs.next()) {
				use = new User();
				use.setQId(rs.getString("QId"));
				username.add(use);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbUtils.closeCon(con);
		}
		return username;
	}
}
