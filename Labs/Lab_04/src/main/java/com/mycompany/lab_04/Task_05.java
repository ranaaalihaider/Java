/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_04;
import java.util.Scanner;
public class Task_05 {
    public static void main(String []args){
        Scanner input=new Scanner (System.in);
        int num1,num2,num3;
        System.out.println("Enter Number 1: ");
        num1=input.nextInt();
        System.out.println("Enter Number 2: ");
        num2=input.nextInt();
        System.out.println("Enter Number 3: ");
        num3=input.nextInt();
        if(num1==num2)
        {
            if(num2==num3)
            {
                if(num3==num1)
                    {
                        System.out.println("3 Numbers are same: ");
                    }
                else{
                    System.out.println("2 numbers are same ");
                }
            }
            else
            {
            System.out.println("2 Numbers are same ");
            }
        }
        else if( num2==num3)
        {
            System.out.println("2 Numbers are same");
        }
        else if(num3==num1){
            System.out.println("2 Numbers are same");
        }
        else{
            System.out.println("No Numbe is same");
        }
        
    }
    
}
