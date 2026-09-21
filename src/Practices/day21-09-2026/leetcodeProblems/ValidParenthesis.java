package Practices.day21092026.leetcodeProblems;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a parenthesis : ");
        String output = scan.nextLine();
        boolean result = isValid(output);
         if(result == false){
             System.out.println("Is there any parenthesis is not to closed properly..");
         }
         else{
             System.out.println("All given parethesis is closed properly");
         }
    }

    public  static boolean isValid(String s) {
        Stack<Character> stack = new Stack <>();
        for(int i =0;i < s.length();i++){
            char current = s.charAt(i);
            if(current == '(' || current == '[' || current == '{')
            {
                stack.push(current);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(current == ')' && top!= '('){
                    return false;
                }
                if(current == ']' && top!= '['){
                    return false;
                }
                if(current == '}' && top!= '{'){
                    return false;
                }
            }

        }
        return stack.isEmpty();

    }
}
