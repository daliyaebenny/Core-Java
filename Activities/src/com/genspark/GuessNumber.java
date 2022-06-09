package com.genspark;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        GuessNumber gN = new GuessNumber();
        gN.doGuessing();

    }
    public void doGuessing(){
        int trial = 5;
        Scanner scan = new Scanner(System.in);

        //Generate a random number
        int number =1 + (int)(100 * Math.random());
        System.out.println("Correct Guess"+number );
        // 1+ (int) Math.random()*100;

        System.out.println("Please enter a number from 1 to 100");
        int i ;
        for(i=0;i<trial;i++){
            int  numberGuess = scan.nextInt();
            if(number == numberGuess){
                System.out.println("Correct Guess");
                break;
            }else if(numberGuess > number && i!=trial-1){
                System.out.println("Hidden number is smaller,try again");
            }else if(numberGuess < number && i!=trial-1){
                System.out.println("Hidden number is greater,try again");
            }
        }
        if(i==trial){
            System.out.println("RAn out of lives,Number is"+number);
        }
        scan.close();

    }
}
