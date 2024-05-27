package basicSyntax;

public class Calculation {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 5;
        int y = 10;
        int z = 5 + 10;
        System.out.println("変数Zの値は" + z + "です。");
        
        double a = 5.25;
        a = a + 2.5;
        a = a * 3.0;
        int b = (int)a;
        b = b + 10;
        System.out.println("変数aの値は" + a + "です。");
        System.out.println("変数bの値は" + b + "です。");
	}

}
