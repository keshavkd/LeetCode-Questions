// You're given strings J representing the types of stones that are 
// jewels, and S representing the stones you have.  Each character in 
// S is a type of stone you have.  You want to know how many of the 
// stones you have are also jewels.

// The letters in J are guaranteed distinct, and all characters in J 
// and S are letters. Letters are case sensitive, so "a" is considered a 
// different type of stone from "A".

// Example 1:
// Input: J = "aA", S = "aAAbbbb"
// Output: 3

// Example 2:
// Input: J = "z", S = "ZZ"
// Output: 0

// Note:
// S and J will consist of letters and have length at most 50.
// The characters in J are distinct.

import java.util.*;
import java.io.*;

public class JewelsAndStones {
    public static int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(int i = 0; i < J.length(); i++)
            hm.put(J.charAt(i), 0); 
        for(int i = 0; i < S.length(); i++) {
            if(hm.containsKey(S.charAt(i)))
                hm.put(S.charAt(i), hm.get(S.charAt(i))+1);
        }
        int sum = 0;
        for(Character c : hm.keySet())
            sum += hm.get(c);
        return sum;
    }

    public static int numJiS(String J, String S) {
        return S.replaceAll("[^" + J + "]", "").length();
    }

    public static void main(String[] args) {
        String J = "aA";
        String S = "aaABBbBBc";
        System.out.println("My Solution: " + numJewelsInStones(J, S));
        System.out.println("Easier Solution: " + numJiS(J, S));
    }
}