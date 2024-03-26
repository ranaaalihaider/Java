/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_06;

/**
 *
 * @author Ranaa
 */
import java.util.Scanner;
public class demo 
{
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter latitude 1: ");
       double latitude1 = input.nextDouble();
       System.out.print("Enter longitude 1: ");
       double longitude1 = input.nextDouble();
       System.out.print("Enter latitude 2 :  ");
       double latitude2 = input.nextDouble();
       System.out.print("Enter longitude 2 : ");
       double longitude2 = input.nextDouble();
       double r = 6371.01;
       latitude1 = Math.toRadians(latitude1);
       longitude1 = Math.toRadians(longitude1);
       latitude2 = Math.toRadians(latitude2);
       longitude2 = Math.toRadians(longitude2);
       double d = r * Math.acos(Math.sin(latitude1) * Math.sin(latitude2) + Math.cos(latitude1)
               * Math.cos(latitude2) *Math.cos(longitude1 - longitude2)) ;  
       System.out.print("The distance between two points is" + d + "km");
       
    }  
    
}
