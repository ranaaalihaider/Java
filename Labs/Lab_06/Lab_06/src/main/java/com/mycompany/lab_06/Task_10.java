package com.mycompany.lab_06;
import java.util.Scanner;
public class Task_10 
{
    public static void main (String [] args)
    {
        Scanner input= new Scanner (System.in);
        System.out.print("Enter your line or word : ");
        String line=input.nextLine();
        int length=line.length();
        char first=line.charAt(2);
        System.out.println(first);
        char second=line.charAt(length-2);
        System.out.println(second);
        String third=line.substring(0,5);
        System.out.println(third);
        String fourth=line.substring(0,(length-2));
        System.out.println(fourth);
        for (int i=0 ; i<=(length-1);i++)
        {
            if (i%2==0)
            {
                char temp=line.charAt(i);
                System.out.print(temp);
            }
        }
        System.out.println("");
        for (int j=1; j<=(length-1); j++)
        {
            if (j%2 !=0)
            {
            char temp=line.charAt(j);
            System.out.print(temp);
            }
        }
        System.out.println("");
        for (int k=(length-1); k>=0;k--)
        {
            char temp=line.charAt(k);
            System.out.print(temp);
        }
        System.out.println("");
        for (int l=(length-1); l>=0;l-=2)
        {
            char temp=line.charAt(l);
            System.out.print(temp);
        }
        System.out.println("\n"+length);
        
        
        
        
    }
    
}
