package Patterns;

import java.util.Scanner;

public class star_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a Random number: ");
        int num = scan.nextInt();
       for(int line=1;line <= num;line++){
           for(int row = 1; row <= line;row++){
               System.out.print("*"+" ");
           }
           System.out.println();
       }
       for(int line = num ; line >= 0;line--){
           for(int row = line ; row >= 0; row--){
               System.out.print("*"+" ");
           }
           System.out.println();
       }
    }
}
