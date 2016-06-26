package strings;

import java.io.*;
import java.util.*;

public class Anagrams {
    static boolean isAnagram(String a, String b)
    {
        char[] aChars = a.toLowerCase().toCharArray();
        char[] bChars = b.toLowerCase().toCharArray();

        Arrays.sort(aChars);
        Arrays.sort(bChars);
        return Arrays.equals(aChars, bChars);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
