package Practices.day18;

import java.util.Scanner;

public class star_6 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter a output value: ");
        int num = scan.nextInt();
        for(int row = 0;row<num;row++){
            for(int star=1;star<=num-row;star++){
                System.out.print("*");
            }
            for(int space = 1; space<=row;space++){
                System.out.print(" ");
            }
            System.out.println();

        }



    }
}
