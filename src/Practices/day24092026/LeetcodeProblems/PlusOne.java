package Practices.day24092026.LeetcodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a size of an array : ");
        int size = scan.nextInt();
        System.out.println("enter a digits ");
        int[] nums = new int[size];
        for(int i = 0; i<= nums.length - 1 ;i++){
            nums[i] = scan.nextInt();
        }
        int[] output = nums;
        int[] result = plusOne(output);
        System.out.println("output "+ Arrays.toString(result));

    }

    public static int[] plusOne(int[] digits)
    {

        for(int i = digits.length - 1; i >= 0  ;i--)
        {
            if(digits[i] <= 9){
                digits[i]++;
                if(digits[i] > 9){
                    int number = digits[i];
                    int lastDigit = number % 10;
                    int firstDigit = number / 10;
                    return new int[]{firstDigit, lastDigit};
                }
                return digits;
            }
            digits[i] = 0;
        }
        return digits;

        }

}


