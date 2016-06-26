package strings;

import java.io.*;
import java.util.*;
public class JavaStringsReverse {

    //palindrome can be optimized further
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char characters[] = A.toCharArray();
        char reverseCharacters[] = new char[A.length()];

        for(int i=0; i < characters.length; i++)
        {
           reverseCharacters[i] = A.charAt(characters.length -1 -i);
        }
        String result = Arrays.equals(characters, reverseCharacters)? "Yes" : "No";
        System.out.println(result);

    }
}


