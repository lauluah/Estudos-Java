package Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";
        String texto = "abababa";

        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(texto);
        while (matcher.find()) {
            System.out.println(matcher.start() + " ");
        }
    }

}
