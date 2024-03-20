package com.mycompany.lab_06;
import java.util.Scanner;
public class Task_09 
{
    public static void main (String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter Line : ");
        String line=input.nextLine();
        int firstIndex=line.indexOf('h');
        int lastIndex=line.lastIndexOf('h');
        String left=line.substring(0,firstIndex+1);
        String right=line.substring(lastIndex);
        String middle=line.substring(firstIndex+1,lastIndex);
        middle=middle.replace('h', 'H');
        System.out.print(left);
        System.out.print(middle);
        System.out.print(right);
    }
    
}
