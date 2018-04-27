package AllDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import model.BookRoomModel;
import util.DbUtils;
import util.StringUtil;

public class BookRoomDao {

	DbUtils dbUtils = new DbUtils();
	Connection con = null;

	public int add(BookRoomModel bookroom){
		con = dbUtils.getCon();
		String sql = "insert into Predetermined values(?,?,?,?,?)";
		PreparedStatement pstmt = null;
		int p = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bookroom.getQId());
			pstmt.setString(2, bookroom.getKId());
			pstmt.setString(3, bookroom.getPName());
			pstmt.setString(4, bookroom.getPtel());
			pstmt.setDate(5, bookroom.getPdate());
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
	
	
	public List<BookRoomModel> list(BookRoomModel bokrom) {
		List<BookRoomModel> listBookroom = new ArrayList<BookRoomModel>();
		try {
			con = dbUtils.getCon();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = "select * from Predetermined,QLogin where QLogin.QId=Predetermined.QId";
			System.out.println(bokrom.getQId());
			if(bokrom.getQId()!= null){
				sql += " and Predetermined.QId='"+ bokrom.getQId() + "'";
			}
			if(bokrom.getQId()== "«Î—°‘Ò..."){
				sql = "select * from Predetermined,QLogin where QLogin.QId=Predetermined.QId";
			}
			if(StringUtil.isNotEmpty(bokrom.getPName())) {
				sql += " and PName like '%"+ bokrom.getPName() + "%'";
			}
			if(StringUtil.isNotEmpty(bokrom.getPtel())) {
				sql += " and Ptel like '%"+ bokrom.getPtel() + "%'";
			}
			if(bokrom.getPdate()!=null && bokrom.getFrontdate()!=null) {
				sql += " and Pdate BETWEEN '"+bokrom.getFrontdate()+"' and '"+bokrom.getPdate()+"'";
			}
			System.out.println(bokrom.getQId()+ bokrom.getPName()+sql);
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			BookRoomModel bookroom = null;
			while (rs.next()) {
				bookroom = new BookRoomModel();
				bookroom.setQId(rs.getString("QId"));
				bookroom.setKId(rs.getString("kId"));
				bookroom.setPName(rs.getString("pName"));
				bookroom.setPtel(rs.getString("ptel"));
				bookroom.setPdate(rs.getDate("pdate"));
				bookroom.setPId(rs.getInt("pId"));
				
				listBookroom.add(bookroom);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbUtils.closeCon(con);
		}
		return listBookroom;
	}
	
	public int update(BookRoomModel bkrom) {
		con = dbUtils.getCon();
		int p = 0;
		con = dbUtils.getCon();
		try {
			String sql = "update Predetermined set Pdate=?,KId=?,Ptel=?,PName=? where PId=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setDate(1, bkrom.getPdate());
			pstmt.setString(2, bkrom.getKId());
			pstmt.setInt(5, bkrom.getPId());
			pstmt.setString(3, bkrom.getPtel());
			pstmt.setString(4, bkrom.getPName());
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
	
	public int delete(BookRoomModel bookrom) {
		con = dbUtils.getCon();
		int p = 0;
		try {
			String sql = "delete from Predetermined where PId=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookrom.getPId());
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
