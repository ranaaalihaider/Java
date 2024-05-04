package com.mycompany.inhertitance;
public class Employe 
{
    int employeID;
    String grade;
    public Employe()
    {
        employeID=0;
        grade="No Grade Defined";
    }  
    public Employe(int newemployeID, String newGrade)
    {
        employeID=newemployeID;
        grade=newGrade;
    }
    public void display()
    {
        System.out.printf("Your Employe ID is %d Your Grade is %s \n",employeID,grade);
    }
}
