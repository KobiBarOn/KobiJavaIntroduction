package d.loops.doWhileDemo;

public class Demo1doWhile1 {

	public static void main(String[] args) {

		{// while
			int i = 1;
			while (i <= 10) {
				System.out.println(i++);
			}
		}

		{ // do while
			int i = 1;
			do {
				System.out.println(i++);
			} while (i <= 10);
		}
	}

}
