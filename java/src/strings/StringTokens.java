package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        if(!s.isEmpty() && s.length() <= 400000)
        {
            String validString = s.trim();
            if(validString.isEmpty())
            {
                System.out.println(0);
            }
            else
            {
                Pattern p1 = Pattern.compile("[A-Za-z !,?._'@]+");
                Matcher m = p1.matcher(validString);
                if(m.matches())
                {
                    Pattern p = Pattern.compile("[ !,?._'@]+");

                    String[] tokens = p.split(validString.subSequence(0, validString.length()));
                    System.out.println(tokens.length);

                    for(String token : tokens)
                    {
                        System.out.println(token);
                    }
                }
            }
        }

    }
}


