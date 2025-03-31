package javaBasicPrograms;

import java.util.Random;
import java.util.Scanner;

//wap to take a number as input and match it with the random number
public class P005_While_GuessTheNumber {
    public static void main(String[] args) {
        //Guess a number between 1 to 100
        Random random = new Random();
        int numberToGuess= random.nextInt(100)+1; //=1 will make sure it takes between 1 to 10
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int guess;
        int attempt=0;
        while(true){
           guess=sc.nextInt();
           attempt++;
           if(guess==numberToGuess){
               System.out.println("You guess the correct number: "+numberToGuess);
               System.out.println("Number of attempts: "+attempt);
               break;
           } else if (guess<numberToGuess) {
               System.out.println("The guess number is low");
           }else {
               System.out.println("The guess number is high");
           }
        }
    }
}
