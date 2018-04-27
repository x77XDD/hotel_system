package AllDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.BookRoomModel;
import model.OuthotelModel;
import util.DbUtils;
import util.StringUtil;

public class IspreDao {
	DbUtils dbUtils = new DbUtils();
	Connection con = null;
	
	public List<BookRoomModel> list(BookRoomModel bkrom) {
		List<BookRoomModel> bokrm= new ArrayList<BookRoomModel>();
		try {
			con = dbUtils.getCon();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = "select * from Predetermined,QLogin where Predetermined.QId=QLogin.QId";
			if(bkrom.getKId()!= null){
				sql += " and Predetermined.KId='"+ bkrom.getKId() + "'";
			}
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			BookRoomModel bk = null;
			while (rs.next()){
				bk = new BookRoomModel();
				bk.setKId(rs.getString("KId"));	
				bokrm.add(bk);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbUtils.closeCon(con);
		}
		return bokrm;
	}
}
