
package rockpaperscissores;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissores {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Random rand = new Random();
        
        int player = 0;
        int computer = 0;
        String p; //for the player's choice
        String c; //for the computer's choice
        int ap = 0;
        int ac = 0;
        char answer;
        
        boolean again = true;
        boolean invalid;
        while(again == true){
            System.out.println("The score is " + player + " - " + computer);
            System.out.println("Enter in rock, paper or scissors");
            p = input.next();
//            if((p != "rock")||(p != "paper")||(p != "scissors")){
//                invalid = true;
//                while(invalid == true){
//                    System.out.println("Invalid item, please type in a valid item");
//                    p = input.next();
//                    if((p != "rock")||(p != "paper")||(p != "scissors")){
//                invalid = true;
//                } else {
//                        invalid = false;
//                    }
//            }
//        }
            if(p == "rock"){
                ap = 1;
            } else if(p == "paper"){
                ap = 2;
            } else {
                ap = 3;
            }
            ac = rand.nextInt(3);
            if(ap == 1){
                if(ac == 1){
                    System.out.println("Draw");
                } else {
                    if(ac == 2){
                        System.out.println("Computer wins");
                        computer = computer + 1;
                    } else {
                        System.out.println("Player wins");
                        player = player + 1;
                    }
                }
            } else if (ap == 2){
                if(ac == 1){
                    System.out.println("Player wins");
                    player = player + 1;
                } else {
                    if(ac == 2){
                        System.out.println("Draw");
                    } else {
                        System.out.println("Computer wins");
                        computer = computer + 1;
            }
    }
    
} else {
                if(ac == 1){
                    System.out.println("Computer wins");
                    computer = computer + 1;
                } else {
                    if(ac == 2){
                        System.out.println("Player wins");
                        player = player + 1;
                    } else {
                        System.out.println("Draw");
            }
        }
    }
            System.out.println("Would you like to play again?(y/n)");
            answer = input.next().charAt(0);
            if(answer == 'y'){
                again = true;
            } else {
                again = false;
                System.out.println("The end score was " + player + " - " + computer);
            }
}
    }
}