package model;

public class RoomTypeModel {
	private String RId;
	private String RName;
	private String RAre;
	private String KPrice;
	private String KId;
	private String KComputer;
	private String REmptyCount;
	
	public RoomTypeModel() {
		super();
	}
	public RoomTypeModel(String rName) {
		super();
		RName = rName;
	}
	public RoomTypeModel(String rId, String rName, String rAre, String kPrice) {
		super();
		RId = rId;
		RName = rName;
		RAre = rAre;
		KPrice = kPrice;
	}
	
	
	
	
	public String getREmptyCount() {
		return REmptyCount;
	}
	public void setREmptyCount(String rEmptyCount) {
		REmptyCount = rEmptyCount;
	}
	public String getKComputer() {
		return KComputer;
	}
	public void setKComputer(String kComputer) {
		KComputer = kComputer;
	}
	public String getKId() {
		return KId;
	}
	public void setKId(String kId) {
		KId = kId;
	}
	public String getKPrice() {
		return KPrice;
	}
	public void setKPrice(String kPrice) {
		KPrice = kPrice;
	}
	public String getRId() {
		return RId;
	}
	public void setRId(String rId) {
		RId = rId;
	}
	public String getRName() {
		return RName;
	}
	public void setRName(String rName) {
		RName = rName;
	}
	public String getRAre() {
		return RAre;
	}
	public void setRAre(String rAre) {
		RAre = rAre;
	}
	@Override
	public String toString() {
		return RName;
	}
	
	
	
}
