
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "October 27th";
		String dadsBirthday = "April 10th";
		String myBirthday = "April 4th";

		// 2. Find out which birthday the user wants and and store their response in a
		// variable
		String b = JOptionPane.showInputDialog(null, "What birthday would you like to see?");
		// 3. Print out what the user typed
		System.out.println(b);
		// 4. if user asked for "mom"
		// print mom's birthday
		if (b.equals("mom")) {
			System.out.println(momsBirthday);
		}

		// 5. if user asked for "dad"
		// print dad's birthday
		if (b.equals("dad")) {
			System.out.println(dadsBirthday);
		}

		// 6. if user asked for your name
		// print myBirthday
		if (b.equals("me")) {
			System.out.println(myBirthday);
		}

		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}
