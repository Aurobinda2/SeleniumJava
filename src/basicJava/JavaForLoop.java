package basicJava;

public class JavaForLoop {

	public static void main(String[] args) { // Simple for loop
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
		// Nested for loop
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// For each loop
		int arr1[] = { 1, 2, 3, 4, 5 };
		for (int i : arr1) {
			System.out.println(i);
		}
		// For loop with label

		aa: for (int i = 0; i < 5; i++) {
			bb: for (int j = 0; j < 5; j++) {
				System.out.println(j);
				if (j == 2) {
					break bb;
				}
			}
		}
	}

}
