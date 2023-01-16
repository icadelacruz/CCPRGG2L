
package RegEx;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternMatcher {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".s");
        Matcher matcher = pattern.matcher("as");
        boolean match = matcher.matches();
        
        System.out.println("Start index: "+matcher.start());
        System.out.println("End index: "+matcher.end());
        System.out.println(match);
    }
}
