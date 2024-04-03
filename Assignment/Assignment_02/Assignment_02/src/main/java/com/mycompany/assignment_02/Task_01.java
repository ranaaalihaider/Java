package com.mycompany.assignment_02;

import java.util.Scanner;
public class Task_01 
{
    static Scanner input= new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter Number of students : ");
        int limit =input.nextInt();
        input.nextLine();
        position_finder(limit);
    }
    public static void position_finder(int limit) 
    {
        
        int score=0;
        String name ="";
        for (int i=1;i<=limit;i++)
        {
            System.out.print("Enter Student Name : ");
            String studentName=input.nextLine();
            //input.next();
            System.out.print("Enter Student Scores : ");
            int numbers=input.nextInt();
            input.nextLine();
            if (numbers>score) 
            {
                score=numbers;
                name=studentName;
            }
        }
        System.out.printf("%s has the highest numbers %d",name,score);
    }
}
