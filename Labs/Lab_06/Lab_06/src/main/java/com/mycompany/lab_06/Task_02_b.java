package com.mycompany.lab_06;
import java.util.Scanner;
public class Task_02_b 
{
    public static void main (String [] args)
    {   Scanner input=new  Scanner (System.in);
        System.out.print("Enter Character to see UNI code : ");
        String character =input.next();
        char result=character.charAt(0);
        int result2=(int) result;
        System.out.printf("Your UNI Code for Charcater %c is %d",result,result2);
        
        
        
    }
    
}
