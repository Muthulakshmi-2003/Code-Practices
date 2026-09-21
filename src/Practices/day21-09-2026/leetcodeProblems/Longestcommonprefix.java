package Practices.day21092026.leetcodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Longestcommonprefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the  elements of Array : ");
        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = scan.nextLine();
        String[] strs = {a,b,c};
        System.out.println("Your Arrays are : "+ Arrays.toString(strs));
        String result = longestCommonPrefix(strs);
        System.out.println(result);
        scan.close();

    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i< strs[0].length();i++){
            char current = strs[0].charAt(i);
            for(int j =1;j < strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i) != current){
                    return result.toString();
                }
            }
            result.append(current);
        }
        return result.toString();
    }
}
