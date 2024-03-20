package com.mycompany.lab_06;
import java.util.Scanner;
public class Task_03_a 
{
    public static void main (String [] args)
    {
        Scanner input= new Scanner (System.in);
        System.out.print("Enter Number between 1 and 15 : ");
        int number=input.nextInt();
        if (number >=0 && number<=15)
        {   char result='0';
            if (number <10)
            {
                result= (char)(number+ '0');
            }
            else
            {
            
            switch(number)
            {
                case 10:  result = 'A'; break;
                case 11:  result = 'B'; break;
                case 12:  result = 'C'; break;
                case 13:  result = 'D'; break;
                case 14:  result = 'E'; break;
                case 15:  result = 'F'; break;
                
            }
            }
            System.out.println("Its Hexa value is "+result);
        }
        else
        {
            System.out.println("Wrong Input");
        }
    }
}
