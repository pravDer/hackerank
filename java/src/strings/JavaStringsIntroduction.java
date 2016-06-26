package strings;

import java.util.Scanner;

public class JavaStringsIntroduction
{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        System.out.println(((A.compareTo(B) > 0) ? "Yes" : "No"));
        if(!A.isEmpty() && !B.isEmpty())
        {
           System.out.println(firstLetterUpperCase(A) + " " + firstLetterUpperCase(B));
        }

    }

    private static String firstLetterUpperCase(String s)
    {
       return s.substring(0,1).toUpperCase().concat(s.substring(1,s.length()));
    }

}


