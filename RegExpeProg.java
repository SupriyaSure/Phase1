package assistedPractice;
import java.util.regex.*;

public class RegExpeProg {

public static void main(String[] args) {

	String input = "[a-z]+";
	String given = "supriya suresh";
	Pattern p = Pattern.compile(input);
	Matcher c = p.matcher(given);
	
	while (c.find())
      	System.out.println( given.substring( c.start(), c.end() ) );
	}
}