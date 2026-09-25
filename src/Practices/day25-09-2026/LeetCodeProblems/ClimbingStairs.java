package Practices.day25092026.LeetCodeProblems;

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = scan.nextInt();
        int result = climbStairs(num);
        System.out.println("Result : " + result);

    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int stepOne = 1;
        int stepTwo = 2;
        for (int i = 3; i <= n; i++) {
            int stepThree = stepOne + stepTwo;
            stepOne = stepTwo;
            stepTwo = stepThree;

        }
        return stepTwo;
    }
}
