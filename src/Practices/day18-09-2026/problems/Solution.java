package Practices.day18;

import java.util.Scanner;

//leetcode problem
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        Solution solution = new Solution();
         boolean result = solution.isPalindrome(num);
        System.out.println(result);

    }
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        String reverse = "";
        boolean input = false;
        for(int i=num.length()-1;i>=0;i--){
            reverse = reverse+num.charAt(i);
            if(reverse.equals(num)){
                input = true;
            }
        }

        return input;

    }

}
