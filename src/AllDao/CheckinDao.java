package AllDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.BookRoomModel;
import model.CheckinhotelModel;
import util.DbUtils;
import util.StringUtil;

public class CheckinDao {
	DbUtils dbUtils = new DbUtils();
	Connection con = null;

	public int add(CheckinhotelModel checkin){
		con = dbUtils.getCon();
		String sql = "insert into CheckIn values(?,?,?)";
		PreparedStatement pstmt = null;
		int p = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, checkin.getQId());
			pstmt.setString(2, checkin.getKId());
			pstmt.setString(3, checkin.getZId());
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
	
	public List<CheckinhotelModel> list(CheckinhotelModel checkin) {
		List<CheckinhotelModel> listchekin = new ArrayList<CheckinhotelModel>();
		try {
			con = dbUtils.getCon();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = "select * from KInformation,Checkin,ZInformation where ZInformation.ZId=Checkin.ZId and KInformation.KId=CheckIn.KId";
			if(StringUtil.isNotEmpty(checkin.getKId())){
				sql += " and CheckIn.KId like '%"+ checkin.getKId()+ "%'";
			}
			System.out.println(sql);
			if(StringUtil.isNotEmpty(checkin.getZName())){
				sql += " and ZName like '%"+ checkin.getZName()+ "%'";
			}
			System.out.println(sql);
			if(checkin.getZDate()!=null && checkin.getZDate2()!=null) {
				sql += " and Zdate BETWEEN '"+checkin.getZDate()+"' and '"+checkin.getZDate2()+"'";
			}
			System.out.println(sql);
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			CheckinhotelModel checkin2 = null;
			while (rs.next()) {
				checkin2 = new CheckinhotelModel();
				checkin2.setCId(rs.getInt("Cid"));
				checkin2.setQId(rs.getString("QId"));
				checkin2.setKId(rs.getString("kId"));
				checkin2.setZId(rs.getString("ZId"));
				checkin2.setZName(rs.getString("Zname"));
				checkin2.setZDate(rs.getDate("Zdate"));
				checkin2.setZSid(rs.getString("Zsid"));
				checkin2.setZMember(rs.getString("ZMember"));
				listchekin.add(checkin2);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbUtils.closeCon(con);
		}
		return listchekin;
	}
}
