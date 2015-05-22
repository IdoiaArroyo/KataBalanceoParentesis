import java.lang.String;

public class Main {

	public static void main(String[] args) {
		String input = "((0.0))";
		System.out.println(
				new BalanceableString(input).isBalanced()
		);
	}

}
