/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_04;
import java.util.Scanner;
public class Activity_03 {
    static Scanner console =new Scanner (System.in);
    public static void main(String [] args){
        double wages,rate,hours;
        System.out.println("Line 2: Enter Working " +"hours : ");
        hours=console.nextDouble();
        System.out.println("");
        System.out.println("Line 5: Enter the pay"+" rates: ");
        rate =console.nextDouble();
        System.out.println("");
        if(hours>40.0)
        {
            wages=40.0*rate+1.5*rate*(hours-40.0);
            
        }
        else
        { wages =hours * rate;
            
        }
        System.out.printf("Line 12: The wages are $ %.2f %n",wages);
        System.out.println("");
        
    }
    
}
