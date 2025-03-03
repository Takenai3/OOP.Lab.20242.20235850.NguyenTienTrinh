package Lab001;

import javax.swing.JOptionPane;

public class lab61_ChoosingOption {
	public static void main(String[] args) {
		int option=JOptionPane.showConfirmDialog(null, "Do you want to change the first class ticker?");
		JOptionPane.showMessageDialog(null, "You've chosen: "+ (option==JOptionPane.YES_OPTION?"I do":"I don't"));
		System.exit(0);
	}
}
