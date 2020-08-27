/*
Developer: Gil Silva
Java Boot Camp
Debugging
Assignment
This program will ask a user for a test score to determine if a student "passed" or "failed"
the test where 60 is the cut line. It will continue until user types -1 to terminate.
However, it doesn't work.  Can you fix it?
 */

import java.util.Scanner; // Scanner class added

public class Score {
    public static void main(String[] args){
        Scanner keybd = new Scanner(System.in);
        int score;

        do{
            System.out.println("Enter a student's test score. Type -1 to quit.");
            score = keybd.nextInt(); //Corrected data type input

            if (score >= 60) {
                System.out.println("Student passed.");

            } else if (score >= 0 && score < 60){
                System.out.println("Student failed.");
            } else if (score == -1) {
                System.out.println("You chose to end the program.");
            } else {
                System.out.println("Score cannot be a negative number.");
            }



        } while (score != -1); // ends do-while loop

        System.out.println("Goodbye!"); //Added info output to user

    }
}
