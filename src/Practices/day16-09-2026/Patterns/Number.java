package Patterns;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a output for how many line numbers print: ");
        int num = scan.nextInt();
        for(int line = 1;line<= num ; line++){
            for(int row = 1; row<=line;row++){
                System.out.print(row+" ");
            }
            System.out.println();
        }

    }
}
