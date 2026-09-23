package Practices.day23092026.leetcodeProblems;

import java.util.Scanner;

public class LengthofLastWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input = scan.nextLine();
        int result = lengthOfLastWord(input);
        System.out.println("Output: "+ result);
    }
    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        int wordcount = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            wordcount++;
            i--;
        }
        return wordcount;
    }
}
