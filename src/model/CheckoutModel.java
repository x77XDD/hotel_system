package model;

import java.sql.Date;

public class CheckoutModel {
	private String KId; 
	private String ZId;
	private Date Tdate;	
	private String Tprice;
	
	
	
	
	public CheckoutModel(String kId, String zId, Date tdate, String tprice) {
		super();
		KId = kId;
		ZId = zId;
		Tdate = tdate;
		Tprice = tprice;
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
	public Date getTdate() {
		return Tdate;
	}
	public void setTdate(Date tdate) {
		Tdate = tdate;
	}
	public String getTprice() {
		return Tprice;
	}
	public void setTprice(String tprice) {
		Tprice = tprice;
	}
	
	
	
	
}
