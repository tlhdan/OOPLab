import javax.swing.*;
import java.awt.GridLayout;
public class SolveEquations {
	public static void main(String[] args){
		Object[] possibilities = {"Linear equation with one variable",
				"Linear system with two variables",
				"Quadratic equation"};
		String s = (String)JOptionPane.showInputDialog(null, "What do you want to solve?", "Equation type",
				JOptionPane.PLAIN_MESSAGE, null, possibilities, "Linear equation with one variable");
		
		if (s.equals("Linear equation with one variable")) {
	        JPanel panel = new JPanel();
	        
	        JTextField textField1, textField2;
	        textField1 = new JTextField(3);
	        textField2 = new JTextField(3);
	        
	        panel.add(textField1);
	        panel.add(new JLabel("x + "));
	        panel.add(textField2);
	        panel.add(new JLabel(" = 0"));

	        int result = JOptionPane.showOptionDialog(null, panel, "Enter the equation",
	                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
	                null, null, null);
	        
	        if (result == JOptionPane.YES_OPTION){
		        String stra, strb;
		        stra = textField1.getText();
		        strb = textField2.getText();
		        
		        double a, b;
		        a = Double.parseDouble(stra);
				b = Double.parseDouble(strb);
				
				if (a == 0) {
					if (b == 0) {
						JOptionPane.showConfirmDialog(null, "The equation has infinitely many roots.", "Solution", JOptionPane.DEFAULT_OPTION);
					} else {
						JOptionPane.showConfirmDialog(null, "The equation has no root.", "Solution", JOptionPane.DEFAULT_OPTION);
					}
				} else {
					double x = - b / a;
					JOptionPane.showConfirmDialog(null, "The equation has one root: x = " + x + ".", "Solution", JOptionPane.DEFAULT_OPTION);
				}
	        }
	    } else if (s.equals("Linear system with two variables")) {
	    	JPanel panel = new JPanel();
	    	
	    	panel.setLayout(new GridLayout(2, 1));
	    	
	    	JTextField textField1, textField2, textField3, textField4, textField5, textField6;
	        textField1 = new JTextField(3);
	        textField2 = new JTextField(3);
	        textField3 = new JTextField(3);
	        textField4 = new JTextField(3);
	        textField5 = new JTextField(3);
	        textField6 = new JTextField(3);
	        
	        panel.add(textField1);
	        panel.add(new JLabel("x + "));
	        panel.add(textField2);
	        panel.add(new JLabel("y = "));
	        panel.add(textField3);
	        
	        panel.add(textField4);
	        panel.add(new JLabel("x + "));
	        panel.add(textField5);
	        panel.add(new JLabel("y = "));
	        panel.add(textField6);
	        
	        int result = JOptionPane.showOptionDialog(null, panel, "Enter the equation",
	                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
	                null, null, null);
	        
	        if (result == JOptionPane.YES_OPTION){
	        	String stra11, stra12, strb1, stra21, stra22, strb2;
		        stra11 = textField1.getText();
		        stra12 = textField2.getText();
		        strb1 = textField3.getText();
		        stra21 = textField4.getText();
		        stra22 = textField5.getText();
		        strb2 = textField6.getText();
		        
		        double a11, a12, b1, a21, a22, b2;
		        a11 = Double.parseDouble(stra11);
		        a12 = Double.parseDouble(stra12);
				b1 = Double.parseDouble(strb1);
				a21 = Double.parseDouble(stra21);
				a22 = Double.parseDouble(stra22);
				b2 = Double.parseDouble(strb2);
				
				double d, dx, dy;
				d = a11 * a22 - a12 * a21;
				dx = b1 * a22 - a12 * b2;
				dy = a11 * b2 - b1 * a21;
				
				if (d == 0) {
					if (dx == 0) {
						JOptionPane.showConfirmDialog(null, "The equation has infinitely many roots.", "Solution", JOptionPane.DEFAULT_OPTION);
					} else {
						JOptionPane.showConfirmDialog(null, "The equation has no root.", "Solution", JOptionPane.DEFAULT_OPTION);
					}
				} else {
					double x = dx / d;
					double y = dy / d;
					JOptionPane.showConfirmDialog(null, "The equation has one root: x = " + x + ", y = " + y + ".", "Solution", JOptionPane.DEFAULT_OPTION);
				}
	        }
	    } else if (s.equals("Quadratic equation")) {
	    	JPanel panel = new JPanel();
	    	
	    	JTextField textField1, textField2, textField3;
	        textField1 = new JTextField(3);
	        textField2 = new JTextField(3);
	        textField3 = new JTextField(3);
	        
	        panel.add(textField1);
	        panel.add(new JLabel("x² + "));
	        panel.add(textField2);
	        panel.add(new JLabel("x + "));
	        panel.add(textField3);
	        panel.add(new JLabel(" = 0"));

	        int result = JOptionPane.showOptionDialog(null, panel, "Enter the equation",
	                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
	                null, null, null);
	        
	        if (result == JOptionPane.YES_OPTION){
		        String stra, strb, strc;
		        stra = textField1.getText();
		        strb = textField2.getText();
		        strc = textField3.getText();
		        
		        double a, b, c;
		        a = Double.parseDouble(stra);
				b = Double.parseDouble(strb);
				c = Double.parseDouble(strc);
				
				if (a == 0) {
					if (b == 0) {
						if (c == 0) {
							JOptionPane.showConfirmDialog(null, "The equation has infinitely many roots.", "Solution", JOptionPane.DEFAULT_OPTION);
						} else {
							JOptionPane.showConfirmDialog(null, "The equation has no root.", "Solution", JOptionPane.DEFAULT_OPTION);
						}
					} else {
						double x = - c / b;
						JOptionPane.showConfirmDialog(null, "The equation has one root: x = " + x + ".", "Solution", JOptionPane.DEFAULT_OPTION);
					}
				} else {
					double delta = b * b - 4 * a * c;
					if (delta < 0) {
						JOptionPane.showConfirmDialog(null, "The equation has no root.", "Solution", JOptionPane.DEFAULT_OPTION);
					} else if (delta == 0) {
						double x = - b / a / 2;
						JOptionPane.showConfirmDialog(null, "The equation has one root: x = " + x + ".", "Solution", JOptionPane.DEFAULT_OPTION);
					} else {
						double x1 = (- b - Math.sqrt(delta)) / a / 2;
						double x2 = (- b + Math.sqrt(delta)) / a / 2;
						JOptionPane.showConfirmDialog(null, "The equation has two roots: x₁ = " + x1 + ", x₂ = " + x2 + ".", "Solution", JOptionPane.DEFAULT_OPTION);
					}
				}
	        }
	    }
	}
}