package reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularexpression {

   public static void main( String args[] ) {
     
	 //  String line = "Hello this is louie";
	 // String pattern = "(d)(e)(f)";
    Pattern pattern = Pattern.compile("\\d");
    
    Matcher m = pattern.matcher("Ap98ple,pe3ar,bann4ana,raisin,ora3nge,le2mon");
    
    while(m.find()){
    	System.out.println("Match Text " + m.group());
    	System.out.println("Starting index " + m.start());
    	System.out.println("Ending index " + m.end() + "\n");
    }
}
}