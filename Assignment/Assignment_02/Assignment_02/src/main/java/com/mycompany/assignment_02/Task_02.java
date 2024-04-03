package com.mycompany.assignment_02;
import java.util.Scanner;
public class Task_02 
{
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter Number of Student : ");
        int limit=input.nextInt();
        input.nextLine();
        if (limit<2)
        {
            System.out.println("Sorry Student Number should be at least 2");
        }
        else
        {
            firstSecondPosition(limit);
        }
        
    }
    public static void firstSecondPosition(int limit)
    {
        int scoreFirst=0;
        String nameFirst ="";
        int scoreSecond=-1;
        String nameSecond="";
        for (int i=1;i<=limit;i++)
        {
            System.out.print("Enter Student Name : ");
            String studentName=input.nextLine();
            System.out.print("Enter Student Scores : ");
            int numbers=input.nextInt();
            input.nextLine();
            if (numbers>scoreSecond) 
            {
                if (numbers>scoreFirst) 
                {
                    scoreSecond=scoreFirst;
                    scoreFirst=numbers;
                    nameSecond=nameFirst;
                    nameFirst=studentName;
                    
                }
                else{
                    scoreSecond=numbers;
                nameSecond=studentName;
                }
                
                
            }
        }
        System.out.printf("%s got first position with %d marks and %s got second position with %d marks ",nameFirst,scoreFirst,nameSecond,scoreSecond);
    }
}


