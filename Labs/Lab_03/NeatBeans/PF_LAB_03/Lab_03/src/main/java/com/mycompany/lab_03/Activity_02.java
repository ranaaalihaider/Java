/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_03;

public class Activity_02 {
    public static void main(String[] args) {
        double regularWages;
        double basePay=25;
        double regularHours=40;
        double overtimeWages;
        double overtimePay=37.5;
        double overtimeHours=10;
        double totalWages;
        regularWages=basePay*regularHours;
        overtimeWages=overtimePay*overtimeHours;
        totalWages=regularWages+overtimeWages;
        System.out.println("Wages for this week are $"+totalWages);


    }
    
}
