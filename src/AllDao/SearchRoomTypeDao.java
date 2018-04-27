package AllDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.BookRoomModel;
import model.RoomTypeModel;
import util.DbUtils;
import util.StringUtil;

public class SearchRoomTypeDao {
	DbUtils dbUtils = new DbUtils();
	Connection con = null;
	public List<RoomTypeModel> list(RoomTypeModel romtype) {
		List<RoomTypeModel> listRoomType = new ArrayList<RoomTypeModel>();
		try {
			con = dbUtils.getCon();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = "select KId,KCompute,KPrice,RAre,REmptyCount from KInformation,RoomType where KState='0'  and RoomType.RId= KInformation.RId ";
			if(romtype.getRName()!= null){
				sql += "and RName='"+ romtype.getRName() + "'";
			}
			if(romtype.getRName()== "«Î—°‘Ò..."){
				sql = "select  KId,KCompute,KPrice,RAre,REmptyCount from KInformation,RoomType,REmptyCount where KState='0'  and RoomType.RId= KInformation.RId ";
			}

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			RoomTypeModel romtp = null;
			while (rs.next()) {
				romtp = new RoomTypeModel();
				romtp.setKId(rs.getString("KId"));
				romtp.setKComputer(rs.getString("KCompute"));
				romtp.setKPrice(rs.getString("KPrice"));
				romtp.setREmptyCount(rs.getString("REmptyCount"));
				romtp.setRAre(rs.getString("RAre"));
				listRoomType.add(romtp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbUtils.closeCon(con);
		}
		return listRoomType;
	}
}
