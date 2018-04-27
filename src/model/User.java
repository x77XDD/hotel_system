package model;

public class User {
	private String QId; 
	private String QName;
	private String QPwd; 
	private String QTel;

	
	public User() {
		super();
	}
	public User(String qId, String qPwd) {
		super();
		QId = qId;
		QPwd = qPwd;
	}
	public String getQId() {
		return QId;
	}
	public void setQId(String qId) {
		QId = qId;
	}
	public String getQName() {
		return QName;
	}
	public void setQName(String qName) {
		QName = qName;
	}
	public String getQPwd() {
		return QPwd;
	}
	public void setQPwd(String qPwd) {
		QPwd = qPwd;
	}
	public String getQTel() {
		return QTel;
	}
	public void setQTel(String qTel) {
		QTel = qTel;
	}
	
	@Override
	public String toString() {
		return QId ;
	}
		
}
