package basicSyntax;

public class GeekIntroduction {
		// TODO 自動生成されたメソッド・スタブ
	
	public static void greeting(int age,double height){
        System.out.println("こんにちは！私はGeekくんでごわす。");
        System.out.println("年は" + age + "でごわす。");
        System.out.println("身長は" + height + "でごわす。");
    }


    public static void specialSkill(int num1,int num2){
            for(int i = 0;i < 310;i++){
                int renum1 = num1 + i;
                int renum2 = num2 + i;
                if (num1 < 0 || num2 < 0) {
                    System.out.println("num1とnum2は0より大きい値にしてください。");
                    break;
                }
                else if (num1 < num2) {
                    System.out.println("num1はnum2より大きい値にしてください。");
                    break;
                }
                else if (300 < num1 || 300 < num2) {
                    System.out.println("num1とnum2は300より小さい値にしてください。");
                    break;
                }
                else{
                    int mod3num1 = renum1 % 3;
                    int mod3num2 = renum2 % 3;
                    int mod5num1 = renum1 % 5;
                    int mod5num2 = renum2 % 5;
                    if (mod3num1 == 0 && mod5num1 == 0) {
                        System.out.println(renum1 + "は3の倍数かつ5の倍数です。");
                        continue;
                    }
                    else if (mod3num1 == 0 && mod5num1 != 0) {
                        System.out.println(renum1 + "は3の倍数です。");
                        continue;
                    }
                    else if (mod3num1 != 0 && mod5num1 == 0) {
                        System.out.println(renum1 + "は5の倍数です。");
                        continue;
                    }

                    if (mod3num2 == 0 && mod5num2 == 0) {
                        System.out.println(renum2 + "は3の倍数かつ5の倍数です。");
                        continue;
                    }
                    else if (mod3num2 == 0 && mod5num2 != 0) {
                        System.out.println(renum2 + "は3の倍数です。");
                        continue;
                    }
                    else if (mod3num2 != 0 && mod5num2 == 0) {
                        System.out.println(renum2 + "は5の倍数です。");
                        continue;
                    }
                }
            }
        }
}


