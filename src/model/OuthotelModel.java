package model;

import java.sql.Date;

public class OuthotelModel {
	private int Tid;
	private String KId;
	private String ZSid;
	private Date ZDate;
	private String ZMember;
	private String RName;
	private String KPrice;
	private String ZName;
	private Date Tdate;
	private String TPrince;
	
	public OuthotelModel() {
		super();
	}

	
	public OuthotelModel(String kId, String zSid, Date zDate, String zName,
			Date tdate) {
		super();
		KId = kId;
		ZSid = zSid;
		ZDate = zDate;
		ZName = zName;
		Tdate = tdate;
	}


	public OuthotelModel(String kId) {
		super();
		KId = kId;
	}


	public String getTPrince() {
		return TPrince;
	}

	public void setTPrince(String tPrince) {
		TPrince = tPrince;
	}

	public int getTid() {
		return Tid;
	}

	public void setTid(int tid) {
		Tid = tid;
	}

	public Date getTdate() {
		return Tdate;
	}

	public void setTdate(Date tdate) {
		Tdate = tdate;
	}

	public OuthotelModel(String zSid, Date zDate, String zMember, String rName,
			String kPrice, String zName) {
		super();
		ZSid = zSid;
		ZDate = zDate;
		ZMember = zMember;
		RName = rName;
		KPrice = kPrice;
		ZName = zName;
	}

	public OuthotelModel(String zSid, Date zDate, String zMember, String rName,
			String kPrice) {
		super();
		ZSid = zSid;
		ZDate = zDate;
		ZMember = zMember;
		RName = rName;
		KPrice = kPrice;
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

	public String getKPrice() {
		return KPrice;
	}

	public void setKPrice(String kPrice) {
		KPrice = kPrice;
	}

	public String getKId() {
		return KId;
	}

	public void setKId(String kId) {
		KId = kId;
	} 
	
	
}
