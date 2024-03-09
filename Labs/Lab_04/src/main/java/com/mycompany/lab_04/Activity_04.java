/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_04;
import java.util.Scanner;
public class Activity_04 {
    static Scanner console = new Scanner (System.in);
    public static void main (String [] args){
        int score;
        System.out.print("Enter Score: ");
        score=console.nextInt();
        if (score >=90)
        {
            System.out.println("The grade is A");
        }
        else if(score >=80){
            System.out.println("The grade is B");
        }
        else if(score >=70){
            System.out.println("The grade is C");
        }
        else if(score >=60){
            System.out.println("The grade is D");
        }
        else{
            System.out.println("The grade is F");
        }
        
    }
    
}
