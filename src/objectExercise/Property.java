package objectExercise;

public class Property {
	private String buildName;
	private String ownerName;
	private String kindName;
	private int Price;
	
	
	public String getBuildName() {
		return buildName;
	}
	public  void setBuildName(String buildName) {
		this.buildName = buildName;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	public  void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public String getKindName() {
		return kindName;
	}
	public  void setKindName(String kindName) {
		this.kindName = kindName;
	}
	
	public int getPrice() {
		return Price;
	}
	public  void setPrice(int Price) {
		this.Price = Price;
	}
	
	Property(String buildName,String ownerName,String kindName,int Price){

		this.buildName = buildName;
		this.ownerName = ownerName;
		this.kindName = kindName;
		this.Price = Price;
	}
	
	public void list() {
		System.out.println("==========================");
		System.out.println("物件名:" + getBuildName());
		System.out.println("物件所有者名:" + getOwnerName());
		System.out.println("物件種別:" + getKindName());
		System.out.println("物件価格:" + getPrice() + "円");
	}
}
