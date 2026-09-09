import java.util.Scanner;

public class ScoreBoard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello All , Welcome to IPL ScoreBoard....");
        System.out.println("CSK vs MI... ");
        System.out.println("CSK : 0/0 Over : 0.0");
            double over_count = 0.0;
           int total_Score = 0;
        int wicket_count = 0;
        boolean flag = true;

            while(flag) {
                if(over_count < 17.0) {
                    System.out.print("Runs scored in Current ball: ");
                    String user_input = scan.nextLine();

                        if (user_input.equalsIgnoreCase("W")) {
                            wicket_count++;
                            over_count++;
                            String over_format = ((int) (over_count / 6)) + "." + ((int) (over_count % 6));
                            System.out.println("CSK : " + total_Score + "/" + wicket_count + " Over : " + over_format);
                            if (wicket_count == 10 ) {
                                System.out.println("All Out!, Well Played");
                                System.out.println("Summary : ");
                                System.out.println("Runs: " + total_Score);
                                System.out.println("Wickets: " + wicket_count);
                                System.out.println("Over : " + over_format);
                                flag = false;
                            }

                        } else {
                            int input = Integer.parseInt(user_input);
                            if (input >=0 && input< 7) {
                            int current_Score = input;
                            total_Score += current_Score;
                            over_count++;
                            String over_format = ((int) (over_count / 6)) + "." + ((int) (over_count % 6));

                            System.out.println("CSK : " + total_Score + "/" + wicket_count + " Over : " + over_format);
                        }
                            else{
                                System.out.println("Invalid Input , Please give a Run Rate between 0 to 6.");
                            }
                    }

                }
                else {
                    flag = false;
                    System.out.println("Match Over !! Well Played Team!!");
                    System.out.println("Summary : ");
                    System.out.println("Runs: " + total_Score);
                    System.out.println("Wickets: " + wicket_count);
                    System.out.println("Over : 3");

                }

            }
    }
}
