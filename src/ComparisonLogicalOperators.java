
public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		int b = 5;
		System.out.println(a > b);

		String suuny = "晴れ";
		String warm ="暖かい";
		boolean isSuuny = (suuny == "晴れ" );
		boolean isWarm = (warm == "暖かい");
		boolean isWerher = (isSuuny == true && isWarm == true);
		System.out.println(isWerher);

		int x = 20;
		int y = 18;
		int z = y % 2;
		boolean isMath = (x > 0 && z == 0);
		System.out.println(isMath);

		int d = 5;
		int f = 10;
		boolean hasPermission = !(d > f);
		System.out.println(hasPermission);

	}

}
