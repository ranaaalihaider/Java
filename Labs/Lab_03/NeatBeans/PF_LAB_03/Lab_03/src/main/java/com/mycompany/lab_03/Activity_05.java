/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_03;

import java.util.Scanner;
public class Activity_05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Purchase amount");
        double purchaseAmount=input.nextDouble();
        double tax=purchaseAmount*0.06;
        System.out.println("Sales tax is $"+(int)(tax*100)/100.0);
    }    
}
