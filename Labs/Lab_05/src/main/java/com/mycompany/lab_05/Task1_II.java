package com.mycompany.lab_05;
import java.util.Scanner;
public class Task1_II 
{
        public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int num1=input.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2=input.nextInt();
        if (num1<num2)
        {
            System.out.println("Ascending Order of Numbers is here");
            for(int i=num1;i<=num2;i++ )
            {
                System.out.print(i+" ");
            }
        }
        else
        {
            System.out.println("In Descending Order");
            for(int i=num1;i>=num2;i--)
            {
                System.out.print(i+" ");
            }
        }
    }
    
}
