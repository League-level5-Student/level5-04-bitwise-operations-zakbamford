package PracticeExam;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class PracticeExam {
	public static void main(String[] args) {
		//1. Write a segment of Java code that takes a message from the user and appends that message to a file that already exists.
		try {
			FileWriter f = new FileWriter("example.txt");
			f.write(JOptionPane.showInputDialog("Enter a message."));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//2. What does the readLine() method in Java's BufferedReader class return when it has reached the end of the file?
		
		
		/*3. Create a Java Thread that makes a robot draw a square and start the thread.
		4. Create an object of the FileReader class that will open a file named "dictionary.txt"
		 5. Use the following Stack to create a Stream object. Stack<Integer> nums = new Stack<Integer>();
		6. Create a Stream object out of the following array and sort it.
		double[] list = new double[1000]; // numbers are added to list here
		7. Add an ActionListener to the following button using a lambda. Make it so the button exits the program when clicked.
		8. Create an example of a functional interface.
		9. What is the value of zed after the following code executes? int zed = 4 << 2;

		 10. Convert the following binary numbers to decimal:
		a) 101 = _____
		b) 1001 = _____
		c) 1011101 = _____
		d) 110110 = _____
		11. Convert the following decimal numbers to binary:
		a) 4 = _____
		b) 15 = _____
		c) 100 = _____
		d) 132 = _____
		12. Answer the following:
		a) 2|3=_____
		b) 3&7=_____
		c) 6|5=_____
		d) 9&9=_____
		e) 13^10=_____
		13. Create a ServerSocket object that will open at port 8080.

		14. Consider the following interface and method.
		interface Module {
		void modulate(int amt, float val);
		}
		public void organize(Module m){ //code
		}
		Call the organize method using a lambda to define the Module parameter.
		15. Use the forEach method in the following Stream object to print the square root of each double in the stream.
		Stream<Double> dubStream = //initialized here;
		*/
	}
}
