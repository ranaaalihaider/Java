/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_04;
import java.util.Scanner;
public class Task_04_d {
    public static void main (String [] args){
        System.out.println("Enter 3 Integers to find minimum");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Number 1 ");
        int num1=input.nextInt();
        System.out.println("Enter Number 2 ");
        int num2=input.nextInt();
        System.out.println("Enter Number 3");
        int num3=input.nextInt();
        if((num1<num2)&&(num1<num3)){
            System.out.println("Number 1 is smallest");
        }
        else if((num2<num3)&&(num2<num1)){
            System.out.println("Number 2 is smallest");
        }
        else if((num3<num1)&&(num3<num2)){
            System.out.println("Number 3 is smallest");
        }
    }
    
}
