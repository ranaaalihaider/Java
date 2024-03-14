package com.mycompany.lab_05;
import java.util.Scanner;
public class Task6 
{
        public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        int max=0, count=0,number,index=0;
        System.out.println("Enter Numbers to find index of max number (0 to exit)");
        while(true)
        {
            System.out.printf("Enter Nmber %d : ",(count+1));
            number=input.nextInt();
            if (count==0)
            {
                max=number;
                index=1;
            }
            if (number==0) 
            {
                break;
            }
            count++;
            if (number>max)
            {
                max=number;
                index=count;
            }
            
        }
        System.out.println("Index of Max number is "+index);
    }
    
}
