import java.util.Scanner;

public class TimeConversion_2 {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in); // create new scanner
			System.out.print("Enter a time in decimal format to print out hours and minutes ");
			double time = input.nextDouble(); // store user input 
			int h = (int) time;
			int m = (int) (time * 60) % 60;
			int s = (int) (time * (60*60)) % 60;

			System.out.println(String.format("%s(hours) %s(minutes) %s(seconds)", h, m, s)); // format variables to hours minutes and seconds 
	} 
}