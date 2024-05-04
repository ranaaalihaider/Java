package com.mycompany.ooplec3;
public class Student 
{
    int rn;
    String name;
    int marks;
    public Student()
    {
        rn=0;
        name="none";
        marks=0;
    }
    public Student (int r, String n, int mark)
    {
        rn=r;
        name=n;
        marks=mark;
    }
    public void display()
    {
        System.out.println("Roll No is "+rn);
        System.out.println("Name is "+name);
        System.out.println("Marks are "+marks);
    }
}
