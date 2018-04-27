package model;

import java.sql.Date;

public class CheckinhotelModel {
	private int CId;
	private String QId; 
	private String KId;
	private String ZId;
	private String ZName; 
	private String ZSid;
	private Date ZDate;
	private Date ZDate2;
	private String ZMember;
	private String RName;
	
	
	public CheckinhotelModel(String qId, String kId, String zId) {
		super();
		QId = qId;
		KId = kId;
		ZId = zId;
	}
	
	
	
	public CheckinhotelModel(String kId, String zName, Date zDate, Date zDate2) {
		super();
		KId = kId;
		ZName = zName;
		ZDate = zDate;
		ZDate2 = zDate2;
	}



	public CheckinhotelModel() {
		super();
	}



	public Date getZDate2() {
		return ZDate2;
	}



	public void setZDate2(Date zDate2) {
		ZDate2 = zDate2;
	}



	public String getZName() {
		return ZName;
	}



	public void setZName(String zName) {
		ZName = zName;
	}



	public String getZSid() {
		return ZSid;
	}



	public void setZSid(String zSid) {
		ZSid = zSid;
	}



	public Date getZDate() {
		return ZDate;
	}



	public void setZDate(Date zDate) {
		ZDate = zDate;
	}



	public String getZMember() {
		return ZMember;
	}



	public void setZMember(String zMember) {
		ZMember = zMember;
	}



	public String getRName() {
		return RName;
	}



	public void setRName(String rName) {
		RName = rName;
	}



	public int getCId() {
		return CId;
	}

	public void setCId(int id) {
		this.CId = id;
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
	public String getZId() {
		return ZId;
	}
	public void setZId(String zId) {
		ZId = zId;
	}
	
	
	
	
}
