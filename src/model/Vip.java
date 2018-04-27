package model;

public class Vip {
  private int VId;
  private String VName;
  private String Qid;
  private String VStateTime;
  private String VEndTime;
  private String Vtel;
  
  
  
  
public Vip() {
	super();
}



public Vip(String vEndTime,String vName, String vtel,String qid, int vId) {
	super();
	VId = vId;
	VName = vName;
	Qid = qid;
	VEndTime = vEndTime;
	Vtel = vtel;
}



public Vip(String vName, String qid, String vStateTime, String vEndTime,
		String vtel) {
	super();
	VName = vName;
	Qid = qid;
	VStateTime = vStateTime;
	VEndTime = vEndTime;
	Vtel = vtel;
}
public Vip(int vid) {
	// TODO Auto-generated constructor stub
	VId=vid;
}
public int getVId() {
	return VId;
}
public void setVId(int vId) {
	VId = vId;
}
public String getVName() {
	return VName;
}
public void setVName(String vName) {
	VName = vName;
}
public String getQid() {
	return Qid;
}
public void setQid(String qid) {
	Qid = qid;
}
public String getVStateTime() {
	return VStateTime;
}
public void setVStateTime(String vStateTime) {
	VStateTime = vStateTime;
}
public String getVEndTime() {
	return VEndTime;
}
public void setVEndTime(String vEndTime) {
	VEndTime = vEndTime;
}
public String getVtel() {
	return Vtel;
}
public void setVtel(String vtel) {
	Vtel = vtel;
}
  
  
}
