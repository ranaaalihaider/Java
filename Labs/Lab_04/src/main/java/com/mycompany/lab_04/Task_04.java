/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_04;
import java.util.Scanner;
public class Task_04 {
    public static void main (String []args){
        Scanner input= new Scanner (System.in);
        System.out.println("Enter Numbers to know minumum one.");
        System.out.println("Enter Number 1 :");
        int number1=input.nextInt();
        System.out.println("Enter Number 2 : ");
        int number2=input.nextInt();
        int minimumNumberIs=Math.min(number1, number2);
        System.out.println("Your minimum number is : "+minimumNumberIs);
        
    }
    
}
