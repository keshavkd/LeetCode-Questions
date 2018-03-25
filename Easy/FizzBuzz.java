// Write a program that outputs the string representation of numbers from 1 to n.

// But for multiples of three it should output “Fizz” instead of the number and 
// for the multiples of five output “Buzz”. For numbers which are multiples of both 
// three and five output “FizzBuzz”.

// Example:
// n = 15,
// Return:
// [
//     "1",
//     "2",
//     "Fizz",
//     "4",
//     "Buzz",
//     "Fizz",
//     "7",
//     "8",
//     "Fizz",
//     "Buzz",
//     "11",
//     "Fizz",
//     "13",
//     "14",
//     "FizzBuzz"
// ]

// Difficulty : Easy

import java.util.*;
import java.io.*;

class FizzBuzz {
	private List<String> l = new ArrayList<String>();
    private int i = 1;
    public List<String> fizzBuzz(int n) {
        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) 
                l.add("FizzBuzz");
            else if(i % 3 == 0)
                l.add("Fizz");
            else if(i % 5 == 0)
                l.add("Buzz");
            else
                l.add(Integer.toString(i));
        }
        return l;
    }

    public static void main(String[] args) {
    	System.out.println(fizzBuzz(15));
    }
}