import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RegexNameValidation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String username = in.nextLine();
            //Pattern to validate names which can have any alphanumeric character including undersoce; min length 8 max length 30

            Pattern r = Pattern.compile("(^[a-zA-Z])(\\w{7,29})$");
            Matcher m = r.matcher(username);

            if (m.find( )) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
