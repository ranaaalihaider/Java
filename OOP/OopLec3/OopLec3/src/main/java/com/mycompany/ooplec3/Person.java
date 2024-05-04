package com.mycompany.ooplec3;
public class Person 
{
    String name;
    int age;
    //Default Constructor
    public Person()
    {
        name="none";
        age=0;
    }
    //Parametrized Constructor
    public Person(String n, int a)
    {
        name=n;
        age=a;
    }
    public void display ()
    {
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }
}
