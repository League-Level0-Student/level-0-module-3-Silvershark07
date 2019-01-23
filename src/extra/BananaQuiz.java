//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String a = JOptionPane.showInputDialog(null, "Do you like bannanas");
		
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if(a.equals("no")){
		System.out.println("You are a crazy person!");
	System.exit(0);
		}
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
if(a.equals("yes")) {
		String hobby = JOptionPane.showInputDialog(null, "What is your favorite hobby");
		JOptionPane.showMessageDialog(null, hobby + " is much better with bananas");
}
		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
		else {
JOptionPane.showMessageDialog(null, "You ARE BANANAS!!!");
		}

}
}