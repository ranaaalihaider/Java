package com.mycompany.ooplec3;
public class OopLec3 
{

    public static void main(String[] args) 
    {
        /* 
        System.out.println("Hello World!");
        Student studentData= new Student();
        System.out.println(studentData.rn);
        System.out.println(studentData.name);
        System.out.println(studentData.marks);
        studentData.display();
        Student st= new Student(14, "Ali Haider", 100);
        st.display();
        */
        PersonalData pd =new PersonalData();
        pd.display();
        PersonalData pd1 =new PersonalData("Ali",20,0316,14);
        pd1.display();
        PersonalData pd2 =new PersonalData("Alii",10,0315,015);
        pd2.display();
        
        int a =  0316;
        System.out.println(a);
        
    }
}
