package com.mycompany.lab_06;
import java.util.Scanner;
public class Task_08 
{
    public static void main (String [] args )
    {
        Scanner input= new Scanner (System.in);
        System.out.print("Enter Line : ");
        String line=input.nextLine();
        int firstH=line.indexOf('h');
        int lastH=line.lastIndexOf('h');
        String left=line.substring(0, firstH);
        String right=line.substring(lastH+1);
        System.out.println("Your answe is : "+left+right);
    }
    
}
