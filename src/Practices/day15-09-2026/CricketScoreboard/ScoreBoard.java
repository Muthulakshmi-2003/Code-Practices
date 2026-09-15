package Practices.day15092026.CricketScoreboard;

import java.util.Scanner;

public class ScoreBoard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello All , Welcome to IPL Practices ScoreBoard....");
        System.out.print("Team 1 : ");
        String team1 = scan.nextLine().toUpperCase();
        System.out.print("Team 2 :");
        String team2 = scan.nextLine().toUpperCase();
        System.out.println(team1 + " vs " + team2 + " ... ");
        System.out.println(" .........." + team1 + " to Batting.........");
        System.out.println(team1 + " : 0/0 Over : 0.0");
        int total_score1 = Innings(scan, team1);
        int target_score = total_score1 + 1;
        System.out.println("Next , " + team2 + " Ready to Bat .....");
        System.out.println(team2 + " Target Score is : " + target_score);
        System.out.println(team1 + " vs " + team2 + " ... ");
        System.out.println(team2 + " : 0/0 Over : 0.0");
        int total_score2 = Innings(scan, team2);
        System.out.println("total_score1 : " + total_score1);
        System.out.println("total_score2 : " + total_score2);
        if (total_score1 > total_score2) {
            System.out.println("----------Congratualation " + team1 + " ... won the Match----------");
            System.out.println("--------" + team1 + " Won the Match ---- " + team2 + " Lose the Match----------");

        } else if (total_score1 == total_score2) {
            System.out.println("---------- Ohhoo Match drawn ---------- ");
            System.out.println("The Both Team Literally same Run Rate ");
            System.out.println("We Move on a Super Over Match");
            System.out.println("Instruction : Super Over means cricket club give 1 over , 6 balls . How many run rate scored in both team comparetly which team run is high. they won the match . other team Lose the match ... ");
            System.out.println("--------------------Count down starts ...-----------------------");
            System.out.println(team1 + " vs " + team2 + " ... Super Over ...");

            int target_superScore = superOver(scan, team1);
            System.out.println("Target score : " + (target_superScore + 1));
            System.out.println("--------- Next " + team2 + "" + " Yet Batting ----------");
            int target_superScore2 = superOver(scan, team2);
            if (target_superScore > target_superScore2) {
                System.out.println("----------Congratualation " + team1 + " ... won the Match----------");
                System.out.println("--------" + team1 + " Won the Match ---- " + team2 + " Lose the Match----------");
            } else {
                System.out.println("----------Congratualation " + team2 + " ... won the Match----------");
                System.out.println("--------" + team2 + " Won the Match ---- " + team1 + " Lose the Match----------");
            }
        } else {
            System.out.println("----------Congratualation " + team2 + " ... won the Match----------");
            System.out.println("--------" + team2 + " Won the Match ---- " + team1 + " Lose the Match----------");
        }
    }

    public static int Innings(Scanner scan, String team) {
        double over_count = 0.0;
        int total_Score = 0;
        int wicket_count = 0;
        boolean flag = true;
        while (flag) {
            if (over_count < 17.0) {
                System.out.print("Runs scored in Current ball: ");
                String user_input = scan.nextLine();
                if (user_input.equalsIgnoreCase("W")) {
                    wicket_count++;
                    over_count++;
                    String over_format = ((int) (over_count / 6)) + "." + ((int) (over_count % 6));
                    System.out.println(team + " : " + total_Score + "/" + wicket_count + " Over : " + over_format);

                    if (wicket_count == 10) {
                        System.out.println("All Out!, Well Played  ");
                        System.out.println("Summary : ");
                        System.out.println("Runs: " + total_Score);
                        System.out.println("Wickets: " + wicket_count);
                        System.out.println("Over : " + over_format);
                        flag = false;
                    }
                } else {
                    int input = Integer.parseInt(user_input);
                    if (input >= 0 && input < 7) {
                        int current_Score = input;
                        total_Score += current_Score;
                        over_count++;
                        String over_format = ((int) (over_count / 6)) + "." + ((int) (over_count % 6));
                        System.out.println(team + " : " + total_Score + "/" + wicket_count + " Over : " + over_format);
                    } else {
                        System.out.println("Invalid Input , Please give a Run Rate between 0 to 6.");
                    }
                }
            } else {
                flag = false;
                System.out.println("Match Over !! Well Played Team!!  ");
                System.out.println("Summary : ");
                System.out.println("Team  : " + team);
                System.out.println("Runs: " + total_Score);
                System.out.println("Wickets: " + wicket_count);
                System.out.println("Over : 3");
            }
        }
        return total_Score;
    }

    public static int superOver(Scanner scan, String team) {
        System.out.println(team + " : 0/0  Over : 0.0");
        boolean flag = true;
        double over_counts = 0.0;
        int total_Score = 0;
        int wicket_count = 0;
        while (flag) {
            if (over_counts < 5.0) {
                System.out.print("Runs scored in Current ball: ");
                String user_input2 = scan.nextLine();
                if (user_input2.equalsIgnoreCase("W")) {
                    wicket_count++;
                    over_counts++;
                    String overs_formats = ((int) (over_counts / 6)) + "." + ((int) (over_counts % 6));
                    System.out.println(team + " : " + total_Score + "/" + wicket_count + " Over : " + overs_formats);
                    if (wicket_count == 5) {
                        System.out.println("All Out!, Well Played");

                        flag = false;
                    }
                } else {
                    int input2 = Integer.parseInt(user_input2);
                    if (input2 >= 0 && input2 < 7) {
                        int current2_Score = input2;
                        total_Score += current2_Score;
                        over_counts++;
                        String overs_formats = ((int) (over_counts / 6)) + "." + ((int) (over_counts % 6));
                        System.out.println(team + " : " + total_Score + "/" + wicket_count + " Over : " + overs_formats
                        );
                    } else {
                        System.out.println("Invalid Input , Please give a Run Rate between 0 to 6.");
                    }
                }
            } else {
                flag = false;
                System.out.println("CSK vs MI Super Over CSK Batting completed !!");
                System.out.println("Summary : ");
                System.out.println("Team  : " + team);
                System.out.println("Runs: " + total_Score);
                System.out.println("Wickets: " + wicket_count);
                System.out.println("Over : 1");
            }
        }
        return total_Score;
    }
}


    
    


