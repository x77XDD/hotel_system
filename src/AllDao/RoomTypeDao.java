package AllDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DbUtils;
import util.StringUtil;

import model.BookRoomModel;
import model.RoomTypeModel;

public class RoomTypeDao {
	DbUtils dbUtils = new DbUtils();
	Connection con=null;
	
	public List<RoomTypeModel> list(RoomTypeModel RoomType) {
		List<RoomTypeModel> roomtype = new ArrayList<RoomTypeModel>();
		try {
			con = dbUtils.getCon();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = "select * from RoomType";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			RoomTypeModel romtp = null;
			while (rs.next()) {
				romtp = new RoomTypeModel();
				romtp.setRName(rs.getString("RName"));
				System.out.println(rs.getString("RName"));
				roomtype.add(romtp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbUtils.closeCon(con);
		}
		return roomtype;
	}
	
}
