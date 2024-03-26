package com.mycompany.lab_06;
import java.util.Scanner;
public class Task_07 
{
    public static void main(String[] args) {
                Scanner input= new Scanner (System.in);
        System.out.print("Enter Word : ");
        String word=input.next();
        int index1=word.indexOf('f');
        int index2=word.lastIndexOf('f');
        if ((index1>=0)&&(index1==index2))
        {
            System.out.println("Your answer is "+index1);
        }
        else if (index1<0)
        {

        }
        else
        {
            System.out.printf("Your Answer is %s %s",index1,index2);
        }

    }
    
}
