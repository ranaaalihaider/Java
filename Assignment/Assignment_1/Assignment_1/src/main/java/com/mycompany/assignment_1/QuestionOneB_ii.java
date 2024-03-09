//package Java.Assignment.Assignment_1.Assignment_1.src.main.java.com.mycompany.assignment_1;
package com.mycompany.assignment_1;
import java.util.Scanner;

public class QuestionOneB_ii 
{
        public static void main(String[] args) 
    {
        //Logical Error 
        Scanner input= new Scanner(System.in);
        System.out.println("Enter two numbers to get sum and than enter third number to divide sum with number 3");
        System.out.println("Enter Number 1");
        int num1=input.nextInt();
        System.out.println("Enter Number 2");
        int num2=input.nextInt();
        System.out.println("Enter Number 3");
        int num3=input.nextInt();
        int result=num1+num2/num3;
        System.out.println("Result is "+result);
        

    }
}
