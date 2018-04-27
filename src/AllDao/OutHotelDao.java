package AllDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.BookRoomModel;
import model.CheckinhotelModel;
import model.OuthotelModel;
import util.DbUtils;
import util.StringUtil;

public class OutHotelDao {

	DbUtils dbUtils = new DbUtils();
	Connection con = null;
	
	public List<OuthotelModel> list(OuthotelModel outhotel) {
		List<OuthotelModel> listouthotel= new ArrayList<OuthotelModel>();
		try {
			con = dbUtils.getCon();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = "select ZName,ZSid,ZDate,ZMember,KPrice,RName from " +
					"ZInformation,KInformation,CheckIn,RoomType " +
					"WHERE ZInformation.ZId=CheckIn.ZId and CheckIn.KId=KInformation.KId " +
					"and RoomType.RId=KInformation.RId";
			
			if(StringUtil.isNotEmpty(outhotel.getKId())) {
				sql += " and  CheckIn.KId like '%"+ outhotel.getKId() +"%'";
			}
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			OuthotelModel out = null;
			while (rs.next()){
				out = new OuthotelModel();
				out.setZSid(rs.getString("ZSid"));
				out.setZDate(rs.getDate("ZDate"));
				out.setZMember(rs.getString("ZMember"));
				out.setRName(rs.getString("RName"));
				out.setKPrice(rs.getString("KPrice"));	
				out.setZName(rs.getString("ZName"));	
				listouthotel.add(out);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbUtils.closeCon(con);
		}
		return listouthotel;
	}
	
	public List<OuthotelModel> list2(OuthotelModel outhotel) {
		List<OuthotelModel> listouthotel= new ArrayList<OuthotelModel>();
		try {
			con = dbUtils.getCon();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = "select * from checkout,ZInformation where  checkout.zid=ZInformation.zid";
			
			if(StringUtil.isNotEmpty(outhotel.getKId())) {
				sql += " and  Checkout.KId like '%"+ outhotel.getKId() +"%'";
			}
			if(StringUtil.isNotEmpty(outhotel.getZName())) {
				sql += " and  Zname like '%"+ outhotel.getZName() +"%'";
			}
			if(StringUtil.isNotEmpty(outhotel.getZSid())) {
				sql += " and  Zsid like '%"+ outhotel.getZSid() +"%'";
			}
			if(outhotel.getZDate()!=null&&outhotel.getTdate()!=null){
				sql += " and  Zdate like '%"+ outhotel.getZDate() +"%' and Tdate like '%"+ outhotel.getTdate() +"%'";
			}
			if(outhotel.getTdate()==null&&outhotel.getZDate()!=null) {
				sql += " and  Zdate like '%"+ outhotel.getZDate() +"%'";
			}
			if(outhotel.getTdate()!=null&&outhotel.getZDate()==null) {
				sql += " and  Tdate like '%"+ outhotel.getTdate() +"%'";
			}
			if(outhotel.getTdate()==null&&outhotel.getZDate()==null) {
				sql += " and zdate BETWEEN '1900-01-01' and '2099-12-31'";
			}
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			OuthotelModel out = null;
			while (rs.next()){
				out = new OuthotelModel();
				out.setTid(rs.getInt("Tid"));
				out.setKId(rs.getString("KId"));
				out.setZName(rs.getString("ZName"));
				out.setZDate(rs.getDate("Zdate"));
				out.setTdate(rs.getDate("Tdate"));
				out.setZSid(rs.getString("Zsid"));
				out.setTPrince(rs.getString("TPrice"));	
	
				listouthotel.add(out);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbUtils.closeCon(con);
		}
		return listouthotel;
	}

}
