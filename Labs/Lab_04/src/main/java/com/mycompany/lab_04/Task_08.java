/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_04;
import java.util.Scanner;
public class Task_08 {
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Month in Numeric form");
        int month=input.nextInt();
        System.out.println("Enter Date");
        int day=input.nextInt();
        System.out.println("Enter Year in two digit Number ");
        int year=input.nextInt();
        if((month*day)==year)
        {
            System.out.println("Date is Magic");
        }
        else
        {
            System.out.println("Date is not magic"); 
        }
        
    }

    
    
}
