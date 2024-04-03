package com.mycompany.assignment_02;
import java.util.Scanner;
public class Task_10 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Line to check number of vowels : ");
        String line=input.nextLine();
        vowels(line);
    }
    public static void vowels(String line)
    {
        int lenght=line.length();
        int count=0;
        for(int i=0;i<lenght;i++)
        {
            if ("aeiouAEIOU".indexOf(line.charAt(i)) !=-1) 
            {
                count++;
            }
        }
        System.out.println("Number of vowels in this line is "+count);
    }
    
}

