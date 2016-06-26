package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams2 {
    static boolean isAnagram(String a, String b)
    {
        //Utilize the fact that we will have english characters
        char[] aChars = a.toLowerCase().toCharArray();
        char[] bChars = b.toLowerCase().toCharArray();
        int[] aFrequencies = new int[26];
        int[] bFrequencies = new int[26];
        calculateFrequencies(aChars, aFrequencies);
        calculateFrequencies(bChars, bFrequencies);
        return Arrays.equals(aFrequencies, bFrequencies);
    }

    //Function assumes that character array is in all lowercase
    static void calculateFrequencies(char[] characters, int[] frequencyArray)
    {
       for(char c : characters)
       {
           frequencyArray[c - 'a'] += 1;
       }
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
