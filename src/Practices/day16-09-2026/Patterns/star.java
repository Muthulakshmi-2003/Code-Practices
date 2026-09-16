package Patterns;

import java.util.Scanner;

public class star {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Give a Random Number : ");
        int user_num = scan.nextInt();
        for(int line = 1;line<= user_num;line++){
            for(int row = 1; row<=user_num;row++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


    }
}
