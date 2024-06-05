package objectExercise;

public class Apartment extends Property{

	private String layout;
	
	public String getLayout() {
		return layout;
	}
	
	public  void setLayout(String layout) {
		this.layout = layout;
	}
		
	Apartment(String buildName,String ownerName, String kindName,int Price, String layout){
		super(buildName, ownerName, kindName, Price);
		this.layout = layout;
	}

	
	public void layoutList() {
		super.list();
		System.out.println("間取り:" + getLayout());
		System.out.println("==========================");
	}
}
