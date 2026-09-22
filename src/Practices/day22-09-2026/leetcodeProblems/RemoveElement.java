package Practices.day22092026.leetcodeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = scan.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter value to remove from the array: ");
        int val = scan.nextInt();
        int result = removeElement(nums, val);
        System.out.println("Number of elements: " + result);
        System.out.println("Array: " + Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int input  = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != val){
                nums[input] = nums[i];
                input++;
            }
        }
        return input;
    }
}
