// The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

// Given two integers x and y, calculate the Hamming distance.

// Note:
// 0 ≤ x, y < 231.

// Example:
// Input: x = 1, y = 4
// Output: 2
// Explanation:
// 1   (0 0 0 1)
// 4   (0 1 0 0)

import java.util.*;
import java.io.*;

class HammingDistance {

    public static int hammingDistance(int x, int y) {
        String a = Integer.toBinaryString(x);
        String b = Integer.toBinaryString(y);
        int max = -1;
        boolean flag;
        if(a.length() > b.length()) {
            max = a.length();
            flag = true;
        }
        else {
            max = b.length();
            flag = false;
        }
        String temp = "";
        if(flag == true) {
            for(int i = 0; i < a.length() - b.length(); i++)
                temp += "0";
            b = temp + b;
        }
        else {
            for(int i = 0; i < b.length() - a.length(); i++)
                temp += "0";
            a = temp + a;
        }
        int count = 0;
        for(int i = 0; i < max; i++)
            if(a.charAt(i) != b.charAt(i))
                count++;
        return count;
    }

    public static int hammingD(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        System.out.println("My solution: " + hammingDistance(2,8));
        System.out.println("Easier solution: " + hammingD(2, 8));
    }
}