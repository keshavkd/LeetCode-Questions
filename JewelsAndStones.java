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