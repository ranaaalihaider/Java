package com.mycompany.lab_05;
import java.util.Scanner;
public class Activity01 
{
    public static void main (String [] args)
    {
        int number1= (int) (Math.random()*10);
        int number2= (int)(Math.random()*10);
        Scanner input= new Scanner(System.in);
        System.out.println("What is "+number1+" + "+number2+" ? : ");
        int answer=input.nextInt();
        while( answer != (number1+number2))
        {
            System.out.println("Wrong Answer Try again . \n"+"What is "+number1+" + "+number2+" ? : ");
            answer=input.nextInt();
        }
        System.out.println("You got it !");
        
    }
    
}
