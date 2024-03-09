/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_03;

import java.util.Scanner;
public class Task_02 {
    public static void main(String[] args) {
        int students;
        int apples;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number of Students ");
        students=input.nextInt();
        System.out.println("Enter Number of Apples");
        apples=input.nextInt();
        int distributes=apples/students;
        int remaning=apples%students;
        System.out.println("Apples Distributes "+distributes);
        System.out.println("Apples Remaning in basket "+remaning);
    }    
}
