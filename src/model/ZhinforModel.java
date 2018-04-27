package model;

import java.sql.Date;

public class ZhinforModel {
	private String ZName; 
	private String ZSid;
	private String ZId;
	private Date ZDate;
	private String ZMember;
	

	
	public ZhinforModel() {
		super();
	}
	
	
	
	public ZhinforModel(String zName) {
		super();
		ZName = zName;
	}



	public ZhinforModel(String zName, String zId) {
		super();
		ZName = zName;
		ZId = zId;
	}
	public ZhinforModel(String zName, String zSid, String zId, Date date,
			String zMember) {
		super();
		ZName = zName;
		ZSid = zSid;
		ZId = zId;
		ZDate = date;
		ZMember = zMember;
	}
	public Date getZDate() {
		return ZDate;
	}
	public void setZDate(Date zDate) {
		ZDate = zDate;
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
	public String getZId() {
		return ZId;
	}
	public void setZId(String zId) {
		ZId = zId;
	}
	
	public String getZMember() {
		return ZMember;
	}
	public void setZMember(String zMember) {
		ZMember = zMember;
	}
	
	
	
}
