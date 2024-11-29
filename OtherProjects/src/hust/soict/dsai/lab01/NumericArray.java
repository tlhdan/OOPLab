package hust.soict.dsai.lab01;
import java.util.Scanner;
import java.util.Arrays;
public class NumericArray {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Do you want to enter your own array? (yes/no)");
		String choice = keyboard.nextLine().trim().toLowerCase();
		
		int[] arr;
		
		while (!(choice.equals("yes") || choice.equals("no"))) {
			System.out.println("Do you want to enter your own array? (yes/no)");
			choice = keyboard.nextLine().trim().toLowerCase();
		}
		if (choice.equals("yes")) {
			System.out.println("Enter the number of elements in the array: ");
			int n = keyboard.nextInt();
            arr = new int[n];
            
            System.out.println("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = keyboard.nextInt();
            }
            keyboard.close();
            
		} else {
			arr = new int[] {1789, 2035, 1899, 1456, 2013};
			System.out.println("Using constant array: " + Arrays.toString(arr));
		}
		
		Arrays.sort(arr);
		
		int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        double average = sum / arr.length;
		
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
	}
}
