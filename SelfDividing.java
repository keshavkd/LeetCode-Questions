// A self-dividing number is a number that is divisible by every digit it contains.
// For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
// Also, a self-dividing number is not allowed to contain the digit zero.
// Given a lower and upper number bound, output a list of every possible self dividing number, 
// including the bounds if possible.

// Example 1:
// Input: 
// left = 1, right = 22
// Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]

// Note:
// The boundaries of each input argument are 1 <= left <= right <= 10000.

//Difficulty : Easy

import java.util.*;
import java.io.*;

class SelfDividing {

	public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<Integer>();
        for(int i = left; i <= right; i++) {
            boolean flag = true;
            int j = i;
            if(j == 0)
                flag = false;
            while(j != 0) {
                if (j % 10 == 0) {
                    flag = false;
                    break;
                }
                else {
                    if (i % (j % 10) != 0) {
                        flag = false;
                        break;
                    }
                    j /= 10;
                }
            }
            if (flag == true)
                l.add(i);
        }
        return l;
    }
	
    public static List<Integer> selfDivClean (int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left, n = 0; i <= right; i++) {
            for (n = i; n > 0; n /= 10)
                if (n % 10 == 0 || i % (n % 10) != 0) break;
            if (n == 0) res.add(i);
        }
        return res;
    }

	public static void main(String[] args) {
		System.out.println("My Solution: " + selfDividingNumbers(7, 35));
		System.out.println("Simpler Solution: " + selfDivClean(7, 35));
	}
}