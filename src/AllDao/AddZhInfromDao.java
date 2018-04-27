package AllDao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.CheckinhotelModel;
import model.ZhinforModel;
import util.DbUtils;

public class AddZhInfromDao {
	DbUtils dbUtils = new DbUtils();
	Connection con = null;

	public int add(ZhinforModel zhxx){
		con = dbUtils.getCon();
		String sql = "insert into ZInformation values(?,?,?,?,?)";
		PreparedStatement pstmt = null;
		int p = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, zhxx.getZId());
			pstmt.setString(2, zhxx.getZName());
			pstmt.setString(3, zhxx.getZSid());
			pstmt.setDate(4, zhxx.getZDate());
			pstmt.setString(5, zhxx.getZMember());
			p = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				dbUtils.closeCon(con);
				return p;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}
}
