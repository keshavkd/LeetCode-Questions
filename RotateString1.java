// We are given two strings, A and B.
// A shift on A consists of taking string A and moving 
// the leftmost character to the rightmost position. For example, 
// if A = 'abcde', then it will be 'bcdea' after one shift on A. 
// Return True if and only if A can become B after some number of shifts on A.

// Example 1:
// Input: A = 'abcde', B = 'cdeab'
// Output: true

// Example 2:
// Input: A = 'abcde', B = 'abced'
// Output: false

// Note:
// A and B will have length at most 100.

//Difficulty : Easy

import java.util.*;
import java.io.*;
    
class RotateString {

    //Took  26ms
    public static boolean rotateString(String A, String B) {
        if(A.equals("") && B.equals(""))
            return true;
        for(int i = 0; i < A.length(); i++) {
            char a = A.charAt(0);
            A = A.replaceFirst(Character.toString(a), "");
            A = A + a;
            if(A.equals(B)) {
                //System.out.println(i+1);
                return true;
            }
        }
        return false;
    }

    //Took 31ms
    public static boolean rotateStr (String A, String B) {
        if(A.equals("") && B.equals(""))
            return true;
        for(int i = 0; i < A.length(); i++) {
            char a = A.charAt(0);
            A = A + a;
            A = A.substring(1);
            System.out.println(A);
            if(A.equals(B)) {
                //System.out.println(i+1);
                return true;
            }
        }
        return false;
    }

    //Took 4ms
    public boolean rotateS(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }

    public static void main(String[] args) {
        String A = new String("abcde");
        String B = new String("cdeab");
        System.out.println("My Solution 1: " + rotateString(A, B));
        System.out.println("My Solution 2: " + rotateStr(A, B));
        System.out.println("Optimal Solution: " + rotateS(A, B));
    }
}