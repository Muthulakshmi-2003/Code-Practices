package Patterns;

import java.util.Scanner;

public class star_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter tha output: ");
        int userinput = scan.nextInt();
        for(int line = userinput;line >= 0;line--) {
            for(int row = line; row >= 0; row--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
