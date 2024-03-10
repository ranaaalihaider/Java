/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_1;

import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1=input.nextInt();
        System.out.println("Enter Number 2");
        int num2=input.nextInt();
        System.out.println("Enter Number 3");
        int num3=input.nextInt();
        if((num1==num2)||(num2==num3)||(num1==num3))
        {
            System.out.println("Any of two numbers are equall so we can not arrange in decending order. Please try again");
            return;
        }
        else if ((num1>num2)&&(num1>num3)) 
        {
            if (num2>num3)
            {
                System.out.printf("Your Output in decreasing order is %d %d %d",num1,num2,num3);
            }
            else if (num3>num2) 
            {
                System.out.printf("Your Output in decreasing order is %d %d %d",num1,num3,num2);
            }
        }
        else if ((num2>num3)&&(num2>num1)) 
        {
            if (num3>num1)
            {
                System.out.printf("Your Output in decreasing order is %d %d %d",num2,num3,num1);
            }
            else if (num1>num3)
            {
                System.out.printf("Your Output in decreasing order is %d %d %d",num2,num1,num3);
            }
        }
        else if ((num3>num1)&&(num3>num2))
        {
            if (num1>num2) {
                System.out.printf("Your Output in decreasing order is %d %d %d",num3,num1,num2);
            }
            else if (num2>num1) {
                System.out.printf("Your Output in decreasing order is %d %d %d",num3,num2,num1);
            }
        }
    }
}