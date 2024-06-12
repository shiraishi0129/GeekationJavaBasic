package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int a = 1;a <= 100;a++){
			if (a % 3 == 0 && a % 5 == 0) {
				System.out.print(a);
				System.out.println(":FizzBuzz");
			}
			else if (a % 3 == 0) {
				System.out.print(a);
				System.out.println(":Fizz");
			}
			else if (a % 5 == 0) {
				System.out.print(a);
				System.out.println(":Buzz");
			}
		}

		
			String[] pg= {"Ruby", "Golang", "Java", "Python", "TypeScript", "HTML", "Javascript"};
			for(String prg:pg){
				if (prg == "Java") {
					System.out.println("現在学習中の言語はJavaです。");
					continue;
				}
				else if (prg == "HTML") {
					System.out.println("HTMLはプログラミング言語ではありません。");
					break;
				}
				System.out.println(prg);
			}
	}
}
