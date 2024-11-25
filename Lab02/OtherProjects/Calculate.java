import javax.swing.JOptionPane;
public class Calculate {
	public static void main(String[] args){
		String strNum1, strNum2;
		String strNotification = "Sum: ";

		strNum1 = JOptionPane.showInputDialog(null,
			"Please input the first number: ", "Input the first number",
			JOptionPane.INFORMATION_MESSAGE);

		strNum2 = JOptionPane.showInputDialog(null,
			"Please input the second number: ", "Input the second number",
			JOptionPane.INFORMATION_MESSAGE);

		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		
		double sum = num1 + num2;
		strNotification += sum + "\nDifference: ";

		double difference = num1 - num2;
		strNotification += difference + "\nProduct: ";

		double product = num1 * num2;
		strNotification += product + "\nQuotient: ";

		if (num2 == 0) {
			strNotification += "Can't divide by 0!";
		} else {
			double quotient = num1 / num2;
			strNotification += quotient;
		}

		JOptionPane.showMessageDialog(null,strNotification,
			"Results", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
