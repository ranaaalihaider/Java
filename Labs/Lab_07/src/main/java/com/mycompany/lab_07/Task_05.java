package com.mycompany.lab_07;
import java.util.Scanner;
public class Task_05 
{
    public static void main (String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter String to count letters in it : ");
        String s=input.nextLine();
        int letters=countLetters(s);
        System.out.println("Number of letters in string are "+letters);
    }
    public static int countLetters(String s)
    {
        int length =s.length();
        int count=0;
        for (int i=0; i<length; i++)
        {
            if (s.charAt(i)!=' ')
            {
                count++;
            }
        }
        return count;           
    }
    
}
