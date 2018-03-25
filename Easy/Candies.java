//Given an integer array with even length, where different numbers 
//in this array represent different kinds of candies. Each number means 
//one candy of the corresponding kind. You need to distribute these candies 
//equally in number to brother and sister. Return the maximum number of kinds 
//of candies the sister could gain.

//Example 1:
//Input: candies = [1,1,2,2,3,3]
//Output: 3
//Explanation:
//There are three different kinds of candies (1, 2 and 3), and two candies for each kind.
//Optimal distribution: The sister has candies [1,2,3] and the brother has candies [1,2,3], too. 
//The sister has three different kinds of candies. 

//Example 2:
//Input: candies = [1,1,2,3]
//Output: 2
//Explanation: For example, the sister has candies [2,3] and the brother has candies [1,1]. 
//The sister has two different kinds of candies, the brother has only one kind of candies. 

//Note:
//The length of the given array is in range [2, 10,000], and will be even.
//The number in given array is in range [-100,000, 100,000].

import java.util.*;
import java.io.*;

public class Candies {
	 public static int distributeCandies(int[] candies) {
	        Arrays.sort(candies);
	        int a = candies[0];
	        int count = 1;
	        for(int i = 1; i < candies.length; i++) {
	            if(candies[i] != a) {
	                a = candies[i];
	                count++;
	            }
	        }
	        a = candies.length / 2;
	        return (count < a ? count : a);
	    }
	 
	 public static void main(String[] args) {
		 int[] test = {1, 1, 2, 3, 4, 2, 4, 4, 2 , 5};
		 System.out.println(distributeCandies(test));
	 }
}
