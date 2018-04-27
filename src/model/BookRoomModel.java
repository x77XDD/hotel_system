package model;

import java.sql.Date;


public class BookRoomModel {
	private String QId; 
	private String KId;
	private String PName; 
	private String Ptel;
	private Date Pdate;
	private Date frontdate;
	private int PId;
	
	public BookRoomModel() {
		super();
	}
	
	
	
	public BookRoomModel(String kId) {
		super();
		KId = kId;
	}



	public BookRoomModel(String qid2, String name, String tel,Date bdate,Date fdate) {
		super();
		QId = qid2;
		PName = name;
		Ptel = tel;
		Pdate = bdate;
		frontdate = fdate;
	}

	public BookRoomModel(String qId, String kId, String pName, String ptel,Date pdate) {
		super();
		QId = qId;
		KId = kId;
		PName = pName;
		Ptel = ptel;
		Pdate = pdate;
	}

//	public BookRoomModel(String qId, String pName, String ptel, Date pdate,Date frontdate) {
//		super();
//		
//	}



	public BookRoomModel(String qId, String kId, String pName, String ptel,Date pdate, Date frontdate) {
		super();
		QId = qId;
		KId = kId;
		PName = pName;
		Ptel = ptel;
		Pdate = pdate;
		this.frontdate = frontdate;
	}

	
	
	public BookRoomModel(String kId, String pName, String ptel, Date pdate,
			int pId) {
		super();
		KId = kId;
		PName = pName;
		Ptel = ptel;
		Pdate = pdate;
		PId = pId;
	}

	public BookRoomModel(String kId, Date pdate, int pId) {
		super();
		KId = kId;
		Pdate = pdate;
		PId = pId;
	}

	public int getPId() {
		return PId;
	}

	public void setPId(int pId) {
		PId = pId;
	}

	public Date getFrontdate() {
		return frontdate;
	}

	public void setFrontdate(Date frontdate) {
		this.frontdate = frontdate;
	}

	public String getQId() {
		return QId;
	}

	public void setQId(String qId) {
		QId = qId;
	}

	public String getKId() {
		return KId;
	}

	public void setKId(String kId) {
		KId = kId;
	}

	public String getPName() {
		return PName;
	}

	public void setPName(String pName) {
		PName = pName;
	}

	public String getPtel() {
		return Ptel;
	}

	public void setPtel(String ptel) {
		Ptel = ptel;
	}


	public Date getPdate() {
		return Pdate;
	}


	public void setPdate(Date pdate) {
		Pdate = pdate;
	}

	
}
