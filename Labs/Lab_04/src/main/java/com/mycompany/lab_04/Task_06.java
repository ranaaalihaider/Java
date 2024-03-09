/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_04;
import java.util.Scanner;
public class Task_06 {
    public static void main(String [] args){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter Number between 1 and 10: ");
        int number=input.nextInt();
        switch(number){
            case 1: System.out.println("In Roman it is represented as I");
            break;
            case 2: System.out.println("In Roman it is represented as II");
            break;
            case 3: System.out.println("In Roman it is represented as III");
            break;
            case 4: System.out.println("In Roman it is represented as IV");
            break;
            case 5: System.out.println("In Roman it is represented as V");
            break;
            case 6: System.out.println("In Roman it is represented as VI");
            break;
            case 7: System.out.println("In Roman it is represented as VII");
            break;
            case 8: System.out.println("In Roman it is represented as VIII");
            break;
            case 9: System.out.println("In Roman it is represented as IX");
            break;
            case 10: System.out.println("In Roman it is represented as X");
            break;
            default: System.out.println("Your Input is not between 1 and 10");
            break;
             
           
        }
        
    }   
}
