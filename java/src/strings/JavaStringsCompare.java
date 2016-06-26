package strings;

import java.util.Scanner;

public class JavaStringsCompare {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mainString = scan.next();
        int substringLength = scan.nextInt();
        String min = "";
        String max = "";
        if(substringLength <= mainString.length())
        {
          //List<String> allSubStrings = new ArrayList<String>(mainString.length() - substringLength + 1);
            for(int i=0 ; i < (mainString.length() - substringLength + 1) ; i++)
            {
               String readString = mainString.substring(i, i+substringLength);
               if(min.isEmpty() || max.isEmpty())
               {
                   min = readString;
                   max = readString;
               }
               if(min.compareTo(readString) > 0)
               {
                  min = readString;
               }
               else if(max.compareTo(readString) < 0)
                {
                    max = readString;
                }
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}
