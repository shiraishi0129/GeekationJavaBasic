package objectExercise;

public class Land extends Property{
	
	private double breath;

	Land(String buildName,String ownerName, String kindName,int Price, double breath){
		super(buildName, ownerName, kindName, Price);
		this.breath = breath;
	}
	
	public double getBreath() {
		return breath;
	}
	public  void setLayout(double breath) {
		this.breath = breath;
	}
	
		
	public void breathList() {
		super.list();
		System.out.println("広さ:" + getBreath() + "㎡");
		System.out.println("==========================");
	}

}
