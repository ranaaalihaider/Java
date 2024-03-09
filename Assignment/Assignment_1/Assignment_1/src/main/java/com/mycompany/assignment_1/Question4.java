/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_1;
import java.util.Scanner;
public class Question4 
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter value of a : ");
        double a=input.nextDouble();
        System.out.print("Enter value of b : ");
        double b=input.nextDouble();
        System.out.print("Enter value of c : ");
        double c=input.nextDouble();
        double x=((b)*(b))-(4*((a)*(c)));
        x=Math.pow(x, 0.5);
        double result_1=((-b)+x)/(2*a);
        double result_2=((-b)-x)/(2*a);
        if (x==0) 
        {   
            System.out.printf("This equation has one root %.4f",result_1);
            
        }
        else if (x>0) 
        {
            System.out.println("This equation has two roots");
            System.out.printf("%.4f and % .4f",result_1,result_2);
        }
        else
        {
            System.out.println("Equation has no real roots.");
        }
        
    }
    
}
