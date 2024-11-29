package hust.soict.dsai.lab01;
import java.util.Scanner;
public class AddMatrices {
	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[i].length; j++) {
		        System.out.print(matrix[i][j] + " ");
		    }
		    System.out.println();
		}
	}
	
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Do you want to enter your own matrices? (yes/no)");
		String choice = keyboard.nextLine().trim().toLowerCase();
		
		int rows, cols;
		int[][] m1, m2, sum;
		
		while (!(choice.equals("yes") || choice.equals("no"))) {
			System.out.println("Do you want to enter your own matrices? (yes/no)");
			choice = keyboard.nextLine().trim().toLowerCase();
		}
		if (choice.equals("yes")) {
			System.out.println("Enter the number of rows: ");
			rows = keyboard.nextInt();
			System.out.println("Enter the number of columns: ");
			cols = keyboard.nextInt();
            
			m1 = new int[rows][cols];
			m2 = new int[rows][cols];
			sum = new int[rows][cols];
            
            System.out.println("Enter the values for the first matrix: ");
            for (int i = 0; i < rows; i++) {
            	for (int j = 0; j < cols; j++) {
                    m1[i][j] = keyboard.nextInt();
            	}
            }
            
            System.out.println("Enter values for the second matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    m2[i][j] = keyboard.nextInt();
                }
            }
            keyboard.close();

		} else {
			m1 = new int[][]
					{{1, 2, 3},
					{4, 5, 6},
					{7, 8, 9}};
			
			m2 = new int[][]
					{{1, 4, 7},
					{2, 5, 8},
					{3, 6, 9}};
			
			rows = 3;
			cols = 3;
			sum = new int[3][3];
			
			System.out.println("Using constant matrices: ");
			printMatrix(m1);
			System.out.println();
			printMatrix(m2);
		}
		
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }
		
		System.out.println("Sum of the two matrices:");
        printMatrix(sum);
	}
}
