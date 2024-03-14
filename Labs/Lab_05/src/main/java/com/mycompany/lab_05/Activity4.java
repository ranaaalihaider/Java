package com.mycompany.lab_05;
import java.util.Scanner;
public class Activity4 
{
    static Scanner input=new Scanner(System.in);
    public static void main (String [] args)
    {
        int num;
        int guess;
        boolean done;
        num = (int)(Math.random()*100);
        done=false;
        while (!done)
        {
            System.out.print("Enter an integer greater than or equall to 0 or less than 100 : ");
            guess=input.nextInt();
            if(guess==num)
            {
                System.out.println("You guessed the correct number .");
                done= true;
            }
            else if (guess<num)
            {
                System.out.println("Your Guess is lower than number \nGuess again !");
            }
            else if(guess>num)
            {
                System.out.println("Your Guess is higer than number \nGuess agaun !");
            }
        }
        
    }
    
}
