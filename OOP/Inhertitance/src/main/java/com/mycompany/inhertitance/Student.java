package com.mycompany.inhertitance;
public class Student extends Person
{
    int rno;
    String section ;
    public Student()
    {
        super();
        rno=0;
        section="Default Section";
    }
    public Student(String name,String fatherName,int age,int cnic,String address ,int newRno, String newSection)
    {
        super(name,fatherName,age,cnic,address);
        rno=newRno;
        section=newSection;
    }
    public void display()
    {   super.display();
        System.out.printf("Your Roll Number is %d Your Section is %s",rno,section);
    }
}
