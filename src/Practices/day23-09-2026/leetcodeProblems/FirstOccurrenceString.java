package Practices.day23092026.leetcodeProblems;

import java.util.Scanner;

public class FirstOccurrenceString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String haystack = scan.nextLine();
        System.out.println("Enter the above word to get index from the word: ");
        String needle = scan.nextLine();
        int result = strStr(haystack,needle);
        System.out.println("Result : "+ result);

    }
    public static int strStr(String haystack, String needle) {
        for(int i = 0 ; i< haystack.length() - needle.length() ;i++){
            int j ;
            for(j =0 ; j<needle.length();j++){
                if(haystack.charAt(i+j) !=needle.charAt(j)){
                    break;
                }
            }
            if(j == needle.length()){
                return i;
            }
        }
        return -1;
    }
}
