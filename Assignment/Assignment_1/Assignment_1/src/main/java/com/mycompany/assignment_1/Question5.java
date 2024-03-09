/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_1;
import java.util.Random;
public class Question5 {
    public static void main(String[] args) {
        Random rand=new Random();
        int number=rand.nextInt(12)+1;
        System.out.print("Month Number is "+number+" and month name is ");
        switch (number) {
            case 1:System.out.println("January");
                break;
            case 2:System.out.println("Feburary");
                break;
            case 3:System.out.println("March");
                break;
            case 4:System.out.println("April");
                break;
            case 5:System.out.println("May");
                break;
            case 6:System.out.println("June");
                break;
            case 7:System.out.println("July");
                break;
            case 8:System.out.println("August");
                break;
            case 9:System.out.println("September");
                break;
            case 10:System.out.println("October");
                break;
            case 11:System.out.println("November");
                break;
            case 12:System.out.println("December");
                break;
        
            default:System.out.println("Unexpected Error Try Again");
                break;
        }        
    }   
}

