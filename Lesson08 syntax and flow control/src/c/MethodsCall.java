package c;

public class MethodsCall {

	public static void main(String[] args) {

		int a = 4;
		int b = 9;

		int sum = addNumers(a, b);

		System.out.println(sum);

	}

	public static int addNumers(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
