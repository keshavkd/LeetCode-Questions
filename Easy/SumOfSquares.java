//Given a non-negative integer c, your task is to decide 
//whether there're two integers a and b such that a2 + b2 = c.
//
//Example 1:
//Input: 5
//Output: True
//Explanation: 1 * 1 + 2 * 2 = 5
//Example 2:
//Input: 3
//Output: False
//Difficulty: Easy

import java.util.*;
import java.io.*;

public class SumOfSquares {
	
	public static boolean judgeSquareSum(int c) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i <= Math.sqrt(c); i++) {
            hs.add(i * i);
            if(hs.contains(c - i * i))
                return true;
        }
        return false;
    }
	
	public static void main(String[] args) {
		System.out.println(judgeSquareSum(5));
		System.out.println(judgeSquareSum(11));
	}
}
