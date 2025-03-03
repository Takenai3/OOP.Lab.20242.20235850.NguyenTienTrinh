package Lab001;


import javax.swing.JOptionPane;

public class lab225 {
	public static void main(String[] args) {
		String strNum1, strNum2;
		
	strNum1=JOptionPane.showInputDialog(null, "Please enter first number",
			"First number",
			JOptionPane.INFORMATION_MESSAGE);
	strNum2=JOptionPane.showInputDialog(null, "Please enter second number",
			"Second number",
			JOptionPane.INFORMATION_MESSAGE);
	String strOpt;
	strOpt=JOptionPane.showInputDialog(null, "1. Sum\n2. Difference\n3. Product\n4. Quotient",
			"Please enter option",
			JOptionPane.INFORMATION_MESSAGE);
	int Opt=Integer.parseInt(strOpt);
	Double Num1=Double.parseDouble(strNum1);
	Double Num2=Double.parseDouble(strNum2);
	switch(Opt) {
	case 1:
		JOptionPane.showMessageDialog(null, "Sum = "+(Num1+Num2));
		break;
	case 2:
		JOptionPane.showMessageDialog(null, "Difference = "+ Math.abs(Num1-Num2));
		break;
	case 3:
		JOptionPane.showMessageDialog(null, "Product = "+ (Num1*Num2));
		break;
	case 4:
		JOptionPane.showMessageDialog(null, "Quotient = "+ (Num1/Num2));
		break;
	}
	}
}