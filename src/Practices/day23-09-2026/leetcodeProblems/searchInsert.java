package Practices.day23092026.leetcodeProblems;

import java.util.Scanner;

public class searchInsert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a array size : ");
        int n = scan.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter a Array elements: ");
        for(int i = 0;i<=nums.length -1;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter a target value : ");
        int target = scan.nextInt();
        int result = searchInsert(nums , target);
        System.out.println("Output : "+ result);

    }
    public static int searchInsert(int[] nums, int target) {

        int i;
        for( i = 0;i <= nums.length;i++){
            if(nums[i] >= target){
                return i;
            }

        }
        return nums.length;
    }
}
