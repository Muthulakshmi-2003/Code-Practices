package  Practices.day10092026.CricketScoreboard;

import java.util.Scanner;

public class ScoreBoard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello All , Welcome to IPL Practices.ScoreBoard....");
        System.out.println("CSK vs MI... ");
        System.out.println("CSK : 0/0 Over : 0.0");
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
                    System.out.println("CSK : " + total_Score + "/" + wicket_count + " Over : " + over_format);
                    if (wicket_count == 10) {
                        System.out.println("All Out!, Well Played 1st Innigs Over ");
                        System.out.println("Summary : ");
                        System.out.println("Runs: " + total_Score);
                        System.out.println("Wickets: " + wicket_count);
                        System.out.println("Over : " + over_format);
                        System.out.println("Next , MI Ready to Bat .....");
                        total_Score++;
                        System.out.println("MI Target Score is : " + total_Score);
                        flag = false;
                    }

                } else {
                    int input = Integer.parseInt(user_input);
                    if (input >= 0 && input < 7) {
                        int current_Score = input;
                        total_Score += current_Score;
                        over_count++;
                        String over_format = ((int) (over_count / 6)) + "." + ((int) (over_count % 6));

                        System.out.println("CSK : " + total_Score + "/" + wicket_count + " Over : " + over_format);
                    } else {
                        System.out.println("Invalid Input , Please give a Run Rate between 0 to 6.");
                    }
                }

            } else {
                flag = false;
                System.out.println("Match Over !! Well Played Team!! 1st Innigs Over ");
                System.out.println("Summary : ");
                System.out.println("Runs: " + total_Score);
                System.out.println("Wickets: " + wicket_count);
                System.out.println("Over : 3");
                System.out.println("Next , MI Ready to Bat .....");
                total_Score++;
                System.out.println("MI Target Score is : " + total_Score);



            }

        }
        System.out.println(" ..........MI Yet to Bad.........");

        MiInnings innings = new MiInnings();
        innings.nextInnings(total_Score);


    }

    public static class MiInnings {
        public void nextInnings(int total_score) {

            System.out.println("Hello all , Welcome to IPL Practices.ScoreBoard....");
            System.out.println("CSK vs MI... ");
            System.out.println("Fist Innings CSK was Batting Wonderful batting . Now MI Start to Batting....");
            total_score--;
            System.out.print("--------------CSK Score : " + total_score + " -------- ");
            total_score++;
            System.out.println("MI target Score : " + total_score + " ----------");
            int target_score = total_score;
            int actualcskScore = target_score - 1;
            Scanner scan2 = new Scanner(System.in);

            System.out.println("MI : 0/0 Over : 0.0");
            double over_count = 0.0;
            int total_Score = 0;
            int wicket_count = 0;
            boolean flag = true;

            while (flag) {
                if (over_count < 17.0) {
                    System.out.print("Runs scored in Current ball: ");
                    String user_input = scan2.nextLine();

                    if (user_input.equalsIgnoreCase("W")) {
                        wicket_count++;
                        over_count++;
                        String over_format = ((int) (over_count / 6)) + "." + ((int) (over_count % 6));
                        System.out.println("MI : " + total_Score + "/" + wicket_count + " Over : " + over_format);

                        if (wicket_count == 10) {
                            System.out.println("All Out!, Well Played MI 2st Innigs Over ");
                            System.out.println("Summary : ");
                            System.out.println("Runs: " + total_Score);
                            System.out.println("Wickets: " + wicket_count);
                            System.out.println("Over : " + over_format);
                            System.out.println("Target Score : " + target_score);

                            System.out.println("----------Congratualation CSK... won the Match----------");
                            System.out.println("--------CSK Won the Match ---- MI Lose the Match----------");
                            flag = false;
                        }
                    } else {
                        int input = Integer.parseInt(user_input);
                        if (input >= 0 && input < 7) {
                            int current_Score = input;
                            total_Score += current_Score;
                            over_count++;
                            String over_format = ((int) (over_count / 6)) + "." + ((int) (over_count % 6));

                            System.out.println("MI : " + total_Score + "/" + wicket_count + " Over : " + over_format);
                        } else {
                            System.out.println("Invalid Input , Please give a Run Rate between 0 to 6.");
                        }
                    }
                }
                else {
                    flag = false;
                    System.out.println("Match Over !! Well Played Team!! 2st Innigs Over ");
                    System.out.println("Summary : ");
                    System.out.println("Runs: " + total_Score);
                    System.out.println("Wickets: " + wicket_count);
                    System.out.println("Over : 3");
                    System.out.println("Target score : " + target_score);
                    total_score--;

                    if (total_score <= target_score)
                    {
                        int target_scoreforcsk = target_score - 1;
                        System.out.println("target for csk : "+ target_scoreforcsk);
                        System.out.println("total_score : "+total_score);
                        if(total_score == target_scoreforcsk) {
                            System.out.println("---------- Ohhoo Match drawn ---------- ");
                            System.out.println("The Both Team Literally same Run Rate ");
                            System.out.println("We Move on a Super Over Match");
                            System.out.println("Instruction : Super Over means  cricket club give 1 over , 6 balls . How many run rate scored in both team comparetly which team run is high. they won the match . other team Lose the match ... ");
                            System.out.println("--------------------Count down starts ...-----------------------");
                            System.out.println("CSK vs MI... Super Over ...");
                            System.out.println("CSK : 0/0  Over : 0.0");
                            boolean flag2 = true;
                            while (flag2) {
                                if (over_count < 5.0) {
                                    System.out.print("Runs scored in Current ball: ");
                                    String user2_input = scan2.nextLine();
                                    if (user2_input.equalsIgnoreCase("W")) {
                                        wicket_count++;
                                        over_count++;
                                        String overs_format = ((int) (over_count / 6)) + "." + ((int) (over_count % 6));
                                        System.out.println("CSK : " + total_Score + "/" + wicket_count + " Over : " + overs_format);
                                        if (wicket_count == 5) {
                                            System.out.println("All Out!, Well Played");
                                            System.out.println("Congratualtion MI won the Match ");
                                            System.out.println("------------ MI Won the Match ---- CSK Won the Match ------------- ");
                                        }
                                    } else {
                                        int input2 = Integer.parseInt(user2_input);
                                        if (input2 >= 0 && input2 < 7) {
                                            int current2_Score = input2;
                                            total_Score += current2_Score;
                                            over_count++;
                                            String overs_format = ((int) (over_count / 6)) + "." + ((int) (over_count % 6));

                                            System.out.println("CSK : " + total_Score + "/" + wicket_count + " Over : " + overs_format);
                                        } else {
                                            System.out.println("Invalid Input , Please give a Run Rate between 0 to 6.");
                                        }
                                    }
                                } else {
                                    flag2 = false;
                                    System.out.println("CSK vs MI Super Over CSK Batting completed !!");
                                    System.out.println("Summary of CSK : ");
                                    System.out.println("Runs: " + total_Score);
                                    System.out.println("Wickets: " + wicket_count);
                                    System.out.println("Over : 1 (Super Over)");
                                    total_Score++;
                                    System.out.println("Target score : " + total_Score);
                                    System.out.println("--------- Next MI Yet Batting ----------");


                                }

                                int super_targetScore = total_score++;
                                if (over_count == 5.0) {
                                    System.out.print("Runs scored in Current ball: ");
                                    String user2_input = scan2.nextLine();
                                    if (user2_input.equalsIgnoreCase("W")) {
                                        wicket_count++;
                                        over_count++;
                                        String overs_format = ((int) (over_count / 6)) + "." + ((int) (over_count % 6));
                                        System.out.println("MI : " + total_Score + "/" + wicket_count + " Over : " + overs_format);
                                        if (wicket_count == 5) {
                                            System.out.println("All Out!, Well Played");
                                            System.out.println("Congratualtion MI won the Match ");
                                            System.out.println("------------ CSK Won the Match ---- MI Won the Match ------------- ");
                                        }
                                    } else {
                                        int input2 = Integer.parseInt(user2_input);
                                        if (input2 >= 0 && input2 < 7) {
                                            int current2_Score = input2;
                                            total_Score += current2_Score;
                                            over_count++;
                                            String overs_format = ((int) (over_count / 6)) + "." + ((int) (over_count % 6));

                                            System.out.println("MI : " + total_Score + "/" + wicket_count + " Over : " + overs_format);
                                        } else {
                                            System.out.println("Invalid Input , Please give a Run Rate between 0 to 6.");
                                        }
                                    }
                                } else {
                                    flag2 = false;
                                    System.out.println("Super Over completed !!!");
                                    System.out.println("Summary of MI : ");
                                    System.out.println("Runs: " + total_Score);
                                    System.out.println("Wickets: " + wicket_count);
                                    System.out.println("Over : 1 (Super Over)");
                                    System.out.println("target score : " + super_targetScore);
                                    if (super_targetScore < total_Score) {
                                        System.out.println("MI won the match ");
                                    } else {
                                        System.out.println("CSK won the match");
                                    }


                                }
                            }
                        }
                        else {

                            System.out.println("----------Congratualation CSK won the Match----------");
                            System.out.println("--------CSK Won the Match ---- MI Lose the Match----------");
                        }

                    }
                    else
                    {

                        System.out.println("----------- Congratulation ---MI You won the Match-----------");
                        System.out.println("--------MI Won the Match ---- CSK Lose the Match----------");
                    }


                }

            }

        }
    }


}





