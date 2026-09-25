package Practices.day25092026.LeetCodeProblems;

import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = scan.nextInt();
        int result = mySqrt(num);
        System.out.println("Result: "+result);
    }
    public static int mySqrt(int x) {
        int res = 0;
        for(int i=1;i<=x;i++){
            if(i*i == x){
                return  i;
            }
            if(i*i > x){
                return  i - 1;
            }
        }
        return res;
    }
}
