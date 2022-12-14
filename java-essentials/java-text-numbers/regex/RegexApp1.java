import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp1 {

    public static void main(String[] args) {

        String text = "abcabc";
        String regex = "ab";

        //Creating regex to represent what you are searching
        Pattern p = Pattern.compile(regex);

        //Searching for the pattern
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.format("%d -> '%s'\n", m.start(), m.group());
        }
    }
}
