import java.util.Scanner;
public class TriangleStars {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter triangle's height:");
		int n = keyboard.nextInt();
		
		for (int iLine = 1; iLine <= n; iLine++) {
			System.out.println(" ".repeat(n - iLine) + "*".repeat(iLine * 2 - 1) + "\n");
		}
	}
}