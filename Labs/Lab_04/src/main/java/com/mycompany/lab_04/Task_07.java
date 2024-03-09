/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_04;
import java.util.Scanner;
public class Task_07 {
    public static void main (String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter length of rectangle 1");
        int lengthRec1=input.nextInt();
        System.out.println("Enter width of rectangle 1");
        int widthRec1=input.nextInt();
        System.out.println("Enter length of rectangle 2");
        int lengthRec2=input.nextInt();
        System.out.println("Enter width of rectangle 2");
        int widthRec2=input.nextInt();
        int areaRec1=lengthRec1*widthRec1;
        int areaRec2=lengthRec2*widthRec2;
        if(areaRec1>areaRec2)
        {
            System.out.println("Area of Rectangle 1 is "+areaRec1+" which is greater than area of Rectangle 2 that is "+areaRec2);
        }
        else if(areaRec2>areaRec1)
        {
            System.out.println("Area of Rectangle 2 is "+areaRec2+" which is greater than area of Rectangle 1 that is "+areaRec1);
        }
        else{
            System.out.println("Area of both rectangles are same that is "+areaRec1);
        }
    }
    
}
