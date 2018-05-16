public class Hello {
	public static void main(String[] args) {
		System.out.println("Task 1:");
		int n = 10;
		oddNumbers(n);

		System.out.println("\nTask 2:");
		int x = 6;
		int y = 4;
		int z = 3;

		System.out.println( sum_of_three(x,y,z));

		System.out.println( average(x,y,z));
	}

	public static void oddNumbers(int n) {
		for(int i = 0; i < n; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

	public static int sum_of_three(int a, int b, int c) {

		return a + b + c;
	}

	public static float average(int a, int b, int c) {
		return (float)(a+b+c)/3.0f;
	}
}
