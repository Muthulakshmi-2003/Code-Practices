import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        String str = scan.nextLine();
        String reverse = "";

        for(int i = str.length()-1;i>=0;i--){
            reverse = reverse+str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println( reverse + " It is Palidrome");
        }
        else{
            System.out.println(reverse + " Not a Palidrome");
        }
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//        String reverse = new StringBuilder(str).reverse().toString();
//
//        if(str.equals(reverse)){
//            System.out.println("It is Palindrome");
//        }
//        else{
//            System.out.println("Not a Palindrome");
//        }
  }

    }
