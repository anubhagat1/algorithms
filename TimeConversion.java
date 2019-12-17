package algorithms;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

	public static void main(String[] args) throws ParseException {

		String input = "12/11/2019 10:12:13 PM";
		DateFormat df = new SimpleDateFormat("DD/MM/YYYY hh:mm:ss aa");
		DateFormat op = new SimpleDateFormat("HH:mm:ss");
		
		Date date = df.parse(input);
		
		System.out.println(op.format(date));
	
	}

}
