package Lab001;

import javax.swing.JOptionPane;
public class lab226 {
	
	public static void main(String[] args) {
		String strOpt;


		strOpt=JOptionPane.showInputDialog(null, "Chọn công cụ:\n1. Giải phương trình bậc nhất 1 ẩn\n"
				+ "2. Giải phương trình bậc nhất 2 ẩn\n"
				+ "3. Giải phương trình bậc 2 1 ẩn",
				"Equation solver",
				JOptionPane.INFORMATION_MESSAGE);
		int Opt=Integer.parseInt(strOpt);
		
		switch(Opt) {
		case 1:
			String strNuma, strNumb;
			strNuma=JOptionPane.showInputDialog(null, "Điền vào hệ số a: ",
					"Enter first component",
					JOptionPane.INFORMATION_MESSAGE);
			strNumb=JOptionPane.showInputDialog(null, "Điền vào hệ số a: ",
					"Enter first component",
					JOptionPane.INFORMATION_MESSAGE);
			Double Numa,Numb;
			Numa=Double.parseDouble(strNuma);
			Numb=Double.parseDouble(strNumb);
			if(Numa==0) {
				if(Numb==0) JOptionPane.showMessageDialog(null, "Phương trình vô số nghiệm");
				else JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm");
		
			} else {
				JOptionPane.showMessageDialog(null, "Nghiệm là: "+ ( ( (-Numb) /Numa)) );
				}
			break;
		case 2:
			String strNumx1, strNumy1, strNum1, strNumx2, strNumy2, strNum2;
			strNumx1=JOptionPane.showInputDialog(null, "Điền vào hệ số ax1: ",
					"Enter first component",
					JOptionPane.INFORMATION_MESSAGE);
			strNumy1=JOptionPane.showInputDialog(null, "Điền vào hệ số by1: ",
					"Enter first component",
					JOptionPane.INFORMATION_MESSAGE);
			strNum1=JOptionPane.showInputDialog(null, "Điền vào hệ số c1: ",
					"Enter first component",
					JOptionPane.INFORMATION_MESSAGE);
			strNumx2=JOptionPane.showInputDialog(null, "Điền vào hệ số ax2: ",
					"Enter first component",
					JOptionPane.INFORMATION_MESSAGE);
			strNumy2=JOptionPane.showInputDialog(null, "Điền vào hệ số by2: ",
					"Enter first component",
					JOptionPane.INFORMATION_MESSAGE);
			strNum2=JOptionPane.showInputDialog(null, "Điền vào hệ số c2: ",
					"Enter first component",
					JOptionPane.INFORMATION_MESSAGE);
			Double Numx1, Numy1, Num1, Numx2, Numy2, Num2;
			Numx1=Double.parseDouble(strNumx1);
			Numy1=Double.parseDouble(strNumy1);
			Num1=Double.parseDouble(strNum1);
			Numx2=Double.parseDouble(strNumx2);
			Numy2=Double.parseDouble(strNumy2);
			Num2=Double.parseDouble(strNum2);
			Double D, Dx, Dy, x, y;
			D = (Numx1 * Numy2) - (Numx2 * Numy1);
			Dx=(Num1*Numy2)-(Num2*Numy1);
			Dy=(Numx1*Num2)-(Numx2*Num1);
			if(D==0) {
				if( (Dx+Dy) ==0) JOptionPane.showMessageDialog(null, "Hệ phương trình vô số nghiệm");
				else JOptionPane.showMessageDialog(null, "Hệ phương trình vô nghiệm");
			} else {
				x=Dx/D;
				y=Dy/D;
				JOptionPane.showMessageDialog(null, "Hệ có nghiệm x "+ x + "\n y: "+ y);
			}
			break;
		case 3:
			String stra, strb, strc;
			stra=JOptionPane.showInputDialog(null, "Nhập vào hệ số a: ");
			strb=JOptionPane.showInputDialog(null, "Nhập vào hệ số b: ");
			strc=JOptionPane.showInputDialog(null, "Nhập vào hệ số c: ");
			Double a,b,c,x1,x2;
			a=Double.parseDouble(stra);
			b=Double.parseDouble(strb);
			c=Double.parseDouble(strc);
			Double Delta=b*b -4*a*c;
			x1 = (-b + Math.sqrt(Delta)) / (2 * a);
			x2 = (-b - Math.sqrt(Delta)) / (2 * a);
			if(a==0) {
				JOptionPane.showMessageDialog(null, "Phương trình không phải phương trình bậc 2 1 ẩn ");
			} else if(Delta<0) {
				JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm");
			} else {
				JOptionPane.showMessageDialog(null, "Nghiệm x1: " + x1 +"\nNghiệm x2: " + x2);
			}
			break;
		}
	}
}
