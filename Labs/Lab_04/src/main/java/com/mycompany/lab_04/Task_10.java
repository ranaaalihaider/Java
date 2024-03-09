/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_04;
import java.util.Scanner;
public class Task_10 {
    public static void main (String [] args){
        Scanner input=new Scanner (System.in);
        System.out.println("Enter Number of Books You Purchased this month .");
        int books=input.nextInt();
        if(books==0){
            System.out.println("You earned 0 points");
        }
        else if (books==1){
            System.out.println("You earned 5 points");
        }
        else if(books==2){
            System.out.println("You earned 15 points");
        }
        else  if(books==3){
            System.out.println("You earned 30 points");
        }
        else if(books>=4){
            System.out.println("You earned 60 points");
        }
    }
    
}
