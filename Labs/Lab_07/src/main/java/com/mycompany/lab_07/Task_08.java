package com.mycompany.lab_07;
import java.util.Scanner;
public class Task_08 
{
    public static void main (String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter String : ");
        String str=input.nextLine();
        str=str.toUpperCase();
        int number=vowelsCounter(str);
        System.out.println("Number of vowels in string are "+number);
        
    }
    public static int vowelsCounter(String s)
    {
        int length=s.length();
        int count=0;
        for (int i=0; i<length; i++)
        {
            if("AEIOU".indexOf(s.charAt(i)) !=-1 )
            {
                count++;
            }
        }
        return count;
    }
}
