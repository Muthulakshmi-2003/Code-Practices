package Practices.day21092026.leetcodeProblems;

import java.util.Scanner;

public class RomanNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a roman letter: ");
        String input = scan.nextLine();
         int result = romanToInt(input);
        System.out.println("Output: "+ result);
    }
    public static int romanToInt(String s) {
        int result = 0;
        for(int i = 0; i<s.length();i++){
            int current = getValue(s.charAt(i));

            if(i+1 < s.length()){
                int next = getValue(s.charAt(i+1));
                if(current < next){
                    result = result - current;
                }
                else{
                    result = result + current;
                }
            }
            else{
                result = result + current;
            }
        }
        return result;
    }
    public static  int getValue(char c){
        switch(c){
            case 'I':
                return  1;

            case 'V':
                return 5;

            case 'X':
                return 10;

            case 'L':
                return 50;

            case 'C':
                return 100;

            case 'D':
                return 500;

            case 'M':
                return 1000;
        }
        return 0;
    }
}
