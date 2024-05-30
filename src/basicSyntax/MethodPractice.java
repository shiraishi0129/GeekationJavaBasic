package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		int b = 8;
		int sumrezult = sumNumbers(a,b);
		//System.out.println(sumrezult);
		int minurezult = minuNumbers(a, b);
		//System.out.println(minurezult);
		int multrezult = multNumbers(a, b);
		//System.out.println(multrezult);
		int divirezult = diviNumbers(a, b);
		//System.out.println(divirezult);	
		int[] math = {sumrezult,minurezult,multrezult,divirezult}; 
		console(math);
	    }

	public static int sumNumbers(int a, int b) {
	        int sum =a + b;
	        return sum;
		}

	public static int minuNumbers(int a, int b) {
	        int minu =a - b;
	        return minu;
		}

	public static int multNumbers(int a,int b){
	        int mult = a * b;
	        return mult;
		}

	public static int diviNumbers(int a,int b){
	        int divi = a / b;
	        return divi;
		}

	public static void console(int math[]) {
	        for(int maths:math){
	        System.out.println("計算結果は" + maths + "です。");
	        }
		}
}
