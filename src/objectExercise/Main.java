package objectExercise;

public class Main {

	public static void main(String[] args) {
		Apartment apartment = new Apartment("いい感じのデパート","山田 マンション太郎","マンション",50000000,"3LDK");
		apartment.layoutList();
		Land land = new Land("いい感じの土地","山田　土地太郎","土地",8000000,105.2);
		land.breathList();
	}
}
