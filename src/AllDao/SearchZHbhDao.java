package AllDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.BookRoomModel;
import model.CheckoutModel;
import model.OuthotelModel;
import model.ZhinforModel;
import util.DbUtils;
import util.StringUtil;

public class SearchZHbhDao {
	DbUtils dbUtils = new DbUtils();
	Connection con = null;
	public List<ZhinforModel> list(ZhinforModel zhinfor) {
		List<ZhinforModel> zhss= new ArrayList<ZhinforModel>();
		try {
			con = dbUtils.getCon();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql ="select ZInformation.ZId from ZInformation,CheckIn where ZInformation.ZId=CheckIn.ZId ";
			if(StringUtil.isNotEmpty(zhinfor.getZName())) {
				sql += " and ZInformation.ZName  like '%"+ zhinfor.getZName () +"%'";
			}
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			ZhinforModel zh = null;
			while (rs.next()){
				zh = new ZhinforModel();
				zh.setZId(rs.getString("ZId"));
				zhss.add(zh);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbUtils.closeCon(con);
		}
		return zhss;
	}
	
	
	public int add(CheckoutModel chekout){
		con = dbUtils.getCon();
		String sql = "insert into Checkout values(?,?,?,?)";
		PreparedStatement pstmt = null;
		int p = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, chekout.getKId());
			pstmt.setString(2, chekout.getZId());
			pstmt.setDate(3, chekout.getTdate());
			pstmt.setString(4, chekout.getTprice());
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
	
	public int delete(String Zid) {
		con = dbUtils.getCon();
		int p = 0;
		try {
			String sql = "delete from CheckIn where ZId=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, Zid);
			p = pstmt.executeUpdate();
			return p;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbUtils.closeCon(con);
		}
		return p;
	}
	
	
}
