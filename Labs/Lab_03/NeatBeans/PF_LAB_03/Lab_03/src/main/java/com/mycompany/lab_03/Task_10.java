/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_03;

public class Task_10 {
    public static void main(String[] args) {
        int degree=30;
        double radians=Math.toRadians(degree);
        double sin=Math.sin(radians);
        double cos=Math.cos(radians);
        double tan=Math.tan(radians);
        
        System.out.printf("Degrees \t Radians\tSine\tCosSine\tTangent %n %d \t\t %.4f\t        %.4f\t %.4f\t %.4f",degree,radians,sin,cos,tan);
        degree=60;
        radians=Math.toRadians(degree);
        sin=Math.sin(radians);
        cos=Math.cos(radians);
        tan=Math.tan(radians);
        
        System.out.printf("%n %d \t\t %.4f\t        %.4f\t %.4f\t %.4f",degree,radians,sin,cos,tan);
    }    
}
