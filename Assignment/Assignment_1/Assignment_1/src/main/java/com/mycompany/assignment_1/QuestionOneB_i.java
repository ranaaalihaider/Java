package com.mycompany.assignment_1;
import java.util.Scanner;
public class QuestionOneB_i
{
    public static void main(String[] args) 
    {
        //Logical Error 
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Numbers to get their sum and multiple");
        System.out.println("Enter Number 1");
        int num1=input.nextInt();
        System.out.println("Enter Number 2");
        int num2=input.nextInt();
        int result;
        result=num1+num2;
        result=num1*num2;
        System.out.println("Sum is "+result);
        System.out.println("Product is "+result);
        

    }
}
