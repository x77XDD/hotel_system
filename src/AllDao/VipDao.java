package AllDao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;


import model.Vip;

import util.DbUtils;

public class VipDao {
	DbUtils dbUtils = new DbUtils();
	Connection con=null;
	
	public int add(Vip vip){
		con = dbUtils.getCon();
		String sql = "insert into Vip values(?,?,?,?,?)";
		PreparedStatement pstmt = null;
		int p = 0;
	
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, vip.getVName());
			pstmt.setString(2, vip.getQid());
			pstmt.setString(3, vip.getVStateTime());
			pstmt.setString(4, vip.getVEndTime());
			pstmt.setString(5, vip.getVtel());
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
	
	
public List<Vip> list(Vip vip) {
	List<Vip> listVip = new ArrayList<Vip>();
	con = dbUtils.getCon();
	try {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from Vip where vid='"+vip.getVId()+"'";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		Vip v = null;
		while (rs.next()) {
			v = new Vip();
			v.setVStateTime(rs.getString("VStateTime"));
			v.setVEndTime(rs.getString("VEndTime"));
			v.setVName(rs.getString("VName"));
			v.setVtel(rs.getString("Vtel"));
			listVip.add(v);
		}
		return listVip;
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	} finally {
		dbUtils.closeCon(con);
	}
	return listVip;
}


public int update(Vip vip) {

	con = dbUtils.getCon();
	int p = 0;
	try {
		String sql = "update Vip set vendtime=?,vname=?,vtel=?,qid=? where Vid=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vip.getVEndTime());
		pstmt.setString(2, vip.getVName());
		pstmt.setString(3, vip.getVtel());
		pstmt.setString(4, vip.getQid());
		pstmt.setInt(5, vip.getVId());
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


public int delete(Vip vip) {
	con = dbUtils.getCon();
	int p = 0;
	try {
		String sql = "delete from vip where Vid=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, vip.getVId());
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

