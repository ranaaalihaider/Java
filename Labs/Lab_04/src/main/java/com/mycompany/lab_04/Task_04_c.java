/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_04;
import java.util.Scanner;
public class Task_04_c {
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter  Number :");
        int number =input.nextInt();
        if(number>0){
            System.out.println("Accordding to your number result is \n 1");
            
        }
        else if(number==0){
            System.out.println("Accordding to your number result is \n 0");
            
        }
        else if(number<0){
            System.out.println("Accordding to your number result is \n -1");            
        }
        
    }
    
}
