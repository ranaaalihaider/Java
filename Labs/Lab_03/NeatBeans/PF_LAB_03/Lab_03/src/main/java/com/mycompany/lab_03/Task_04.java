/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_03;

import java.util.Scanner;
public class Task_04 {
    public static void main(String[] args) {
        System.out.println("Enter Number of Minutes");
        Scanner input=new Scanner(System.in);
        int minutes=input.nextInt();
        int hours=minutes/60;
        int remaningMinutes=minutes%60;
        System.out.println("Now Time after Mid-Night is "+hours+" "+remaningMinutes);
    }    
}
