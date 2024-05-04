package com.mycompany.ooplec3;
public class PersonalData 
{
     String name;
    private int age;
    private int phoneNo;
    private int code;
    public PersonalData()
    {
        name="none";
        age=0;
        phoneNo=0;
        code=0;
    }
    public PersonalData(String na,int ag,int no, int cod)
    {
        name=na;
        age=ag;
        phoneNo=no;
        code=cod;
    }
    public void display()
    {
        System.out.printf("Your name is %s your age is %d your Phone no is %s Your code is %d \n",name,age,Integer.toOctalString(phoneNo),code);
    }
}
