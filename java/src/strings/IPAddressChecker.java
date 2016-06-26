package strings;

import java.util.Scanner;

/**
 * Code to validate if inputs are valid IP address
 */
public class IPAddressChecker {
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }

    }
}

class myRegex {
    String number = "([0-9]|[0-9][0-9]|[01][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])";
    String pattern = number + "." + number + "." + number + "." + number;
}
