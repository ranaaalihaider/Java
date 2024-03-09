/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_04;

public class Task_01 {
    public static void main(String [] args){
        int x,y,z;
        x=10;
        y=15;
        z=20;
        boolean statement_1=!(x>10);
        boolean statement_2= (x<=5)|| (y<15);
        boolean statement_3= (x !=5) &&(y !=z);
        boolean statement_4=(x>=z)||(x+y >=z);
        boolean statement_5=(x<=y-2)&&(y>=z)||(z-2 !=20);
        System.out.println("Expression of statement 1 is : "+statement_1);
        System.out.println("Expression of statement 2 is : "+statement_2);
        System.out.println("Expression of statement 3 is : "+statement_3);
        System.out.println("Expression of statement 4 is : "+statement_4);
        System.out.println("Expression of statement 5 is : "+statement_5);
        
    }
}
