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

    public static void main(String[] args) {
        System.out.println("My solution: " + hammingDistance(2,8));
    }
}