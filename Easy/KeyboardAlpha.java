//Example 1:
//Input: ["Hello", "Alaska", "Dad", "Peace"]
//Output: ["Alaska", "Dad"]
//Note:
//You may use one character in the keyboard more than once.
//You may assume the input string will only contain letters of alphabet.

import java.util.*;
import java.io.*;

public class KeyboardAlpha {
	
	public static String[] findWords(String[] words) {
        String[] a = {"QWERTYUIOPqwertyuiop", "ASDFGHJKLasdfghjkl", "ZXCVBNMzxcvbnm"};
        ArrayList<String> b = new ArrayList<String>();
        int flag = 0;
        boolean c;
        for(int i = 0; i < words.length; i++) {
            c = true;
            for(int j = 0; j < words[i].length(); j++) {
                if(c) {
                    if(a[0].contains(String.valueOf(words[i].charAt(0)))) {
                        flag = 0;
                        c = false;
                    }
                    else if(a[1].contains(String.valueOf(words[i].charAt(0)))) {
                        flag = 1;
                        c = false;
                    }
                    else {
                        flag = 2;
                        c = false;
                    }
                }
                if(!a[flag].contains(String.valueOf(words[i].charAt(j))))
                    break;
                if(j == words[i].length() - 1)
                    b.add(words[i]);
            }
        }
        return b.toArray(new String[0]);
    }
	
	public static void main(String[] args) {
		String[] words = {"Hello", "Alaska", "Dad", "Peace"};
		words = findWords(words);
		for(int i = 0; i < words.length; i++)
			System.out.print(words[i] + " ");
	}
}
