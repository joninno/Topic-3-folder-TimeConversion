import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TimeConversion_1 {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in an hr in 24 time format to convert it to 12hr format");
		String time24 = input.next(); // store user input 
		int x = Integer.parseInt(time24);
		    final SimpleDateFormat sdf = new SimpleDateFormat("H"); // create new SimpleDateFormat of H
		    final Date dateObj = sdf.parse(time24); // parse user input into constructed SimpleDateFormat
		    if (x >= 12) {
		    	System.out.println(new SimpleDateFormat("K").format(dateObj) + "pm"); // Display 12hr time 
		    } else {
		    	System.out.println(new SimpleDateFormat("K").format(dateObj) + "am");
		    }
		 } 
}