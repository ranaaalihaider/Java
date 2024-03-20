package com.mycompany.lab_06;
import java.util.Scanner;
public class Task_02_a 
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Number bw 1 and 127 : ");
        int number=input.nextInt();
        if(number >=1 && number <=127)
        {
            char result=(char)number;
            System.out.printf("Your Chracter for ASCI code %d is %c",number,result);
        }
        else
        {
            System.out.println("Wrong Input");
        }
        
    }
}
