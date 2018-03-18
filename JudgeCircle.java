// Initially, there is a Robot at position (0, 0). Given a sequence of its moves, 
// judge if this robot makes a circle, which means it moves back to the original place.

// The move sequence is represented by a string. And each move is represent by a character. 
// The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

// Example 1:
// Input: "UD"
// Output: true

// Example 2:
// Input: "LL"
// Output: false

//Difficulty : Easy

import java.io.*;
import java.util.*;

class JudgeCircle {

    public static boolean judgeCircle (String moves) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U' :
                    y++;
                    break;
                case 'D' :
                    y--;
                    break;
                case 'R' :
                    x++;
                    break;
                case 'L' :
                    x--;
                    break;
                default :
            }
        }
        if (x == 0 && y == 0)
            return true;
        else
            return false;
    }

    public static void main (String[] args) {
        String a = "UDDLRU";
        String b = "LLRUD";
        System.out.println(judgeCircle(a));
        System.out.println(judgeCircle(b));
    }
}