package Lab001;

import java.util.Scanner;

public class lab62_Input {
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		System.out.println("What's your name? ");
		String strName= keyboard.nextLine();
		System.out.println("How old are you?" );
		int iAge= keyboard.nextInt();
		System.out.println("Could you write in your favorite LCK team?");
		String favTeam=keyboard.next();
		
		System.out.println("Name: "+ strName + " Age: "+ iAge + " Favorite LCK team: " + favTeam);
	}
}
