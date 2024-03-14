package com.mycompany.lab_05;
import java.util.Scanner;
public class Task1_IV 
{
        public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Number to get sum of cubes ");
        int number=input.nextInt();
        int sum=0;
        for(int i=1; i<=number; i++)
        {
            int result= (i)*(i)*(i);
            sum+=result;
        }
        System.out.println("Sum of cubes upto this number is "+sum);

    } 
}
