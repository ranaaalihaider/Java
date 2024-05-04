public class Employe 
{
    int employeID;
    int grade;
    public Employe()
    {
        employeID=0;
        grade="No Grade Defined";
    }  
    public Employe(int newemployeID, int newGrade)
    {
        employeID=newemployeID;
        grade=newGrade;
    }
    public void display()
    {
        System.out.printf("Your Employe ID is %d Your Grade is %d \n",employeID,grade);
    }
}
