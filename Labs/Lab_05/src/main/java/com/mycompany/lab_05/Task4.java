package com.mycompany.lab_05;
import java.util.Scanner;
public class Task4 
{
        public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Length of Sequence : ");
        int limit = input.nextInt();
        int counter=0;
        boolean checker=true;
        for (int i=1; i<=limit; i++)
        {   
            System.out.println("Enter Number "+i+" : ");
            int number=input.nextInt();
            if (number==0)
            {
                checker=false;
            }
            if (checker==true)
            {
                counter++;
            }
        }
        System.out.print("Lngth of sequence where it ends with 0 is "+counter);
    }
    
}
