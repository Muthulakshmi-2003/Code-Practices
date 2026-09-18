package Practices.day18;

import java.util.Scanner;

public class star_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a random input value : ");
        int num = scan.nextInt();
        for(int i = 1; i <= num; i++){
            for(int space = 1;space <= num - i; space++){
                System.out.print(" ");
            }
            for(int star=1;star <= i;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
