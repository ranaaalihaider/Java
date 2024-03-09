/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_04;
import java.util.Scanner;
public class Task_09 {
    public static void main (String [] args){
        System.out.println("Enter Pennies Nickels Dimes and Quartes to make one dollar and win game");
        Scanner input= new Scanner(System.in);
        double pennies = 0.01;
        double nickels = 0.05;
        double dimes = 0.1;
        double quarter= 0.25 ;
        System.out.println("Enter Pennis Amount ");
        double penniesAmount=input.nextDouble()*pennies;
        System.out.println("Enter Nicleks Amount");
        double nickelsAmount=input.nextDouble()*nickels;
        System.out.println("Enter Dimes Amount ");
        double dimesAmount=input.nextDouble()*dimes;
        System.out.println("Enter Quarter Amount");
        double quarterAmount =input.nextDouble()*quarter;
        double total=penniesAmount+nickelsAmount+dimesAmount+quarterAmount;
        if(total==1.0){
            System.out.println("Congratulations you won the GAME");
            
        }
        else{
            System.out.println("Sorry You Lost the game overall sum is : "+total);
        }
        
        
    }
        
    
}
