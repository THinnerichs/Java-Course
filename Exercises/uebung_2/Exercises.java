public class Exercises {
	public static void main(String[] args) {
		
		System.out.println("\nExercise 1:");
		oddNumbers(10);
		
		System.out.println("\nExercise 2:");
		getSumAndAverage(6, 4, 3);
		
		System.out.println("\nExercise 3:");
		System.out.println("Min = " + getMin(6, 4, 3));
		
		System.out.println("\nExercise 4:");
		printDiamond();
		
		System.out.println("\nExercise 5:");
		getPrimes(11);
	}
	
	//exercise 1
	public static void oddNumbers(int n) {
		for(int i = 0; i < n; i++){
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
	
	//exercise 2
	public static void getSumAndAverage(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("Sum   = " + sum);
		System.out.println("Avrg. = " + sum / 3.0f);
	}
	
	//exercise 3
	public static int getMin(int a, int b, int c) {
		int min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		return min;
	}
	
	//exercise 4
	public static void printDiamond() {
		int size = 3;
		int max = 2 * size + 1;
		
		for(int i = 0; i < size; i++){
			int length = i * 2 + 1;
			String line = fillSymbol((max - length) / 2, " ") + fillSymbol(length, "*");
			System.out.println(line);
		}
		
		for(int i = size; i >= 0; i--){
			int length = i * 2 + 1;
			String line = fillSymbol((max - length) / 2, " ") + fillSymbol(length, "*");
			System.out.println(line);
		}
		
	}
	
	//return a string with n symbols
	public static String fillSymbol(int n, String symbol) {
		String symbols = "";
		for(int i = 0; i < n; i++) {
			symbols += symbol;
		}
		
		return symbols;
	}
	
	//exercise 5
	public static void getPrimes(int n) {
		for(int i = 2; i <= n; i++){
			//check if number i is a prime
			boolean is_prime = true;
			//check if any number j (j < i and j > 1) is a divider of i
			for(int j = i-1; j > 1 && is_prime; j--) {
				if(i % j == 0) {
					is_prime = false;
				}
			}
			if(is_prime) {
				System.out.println(i);
			}
		}
	}
	
}