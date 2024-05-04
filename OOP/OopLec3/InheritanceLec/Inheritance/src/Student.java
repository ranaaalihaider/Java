public class Student 
{
    int rno;
    String section ;
    public Student()
    {
        rno=0;
        section="Default Section";
    }
    public Student(int newRno, String newSection)
    {
        rno=newRno;
        section=newSection;
    }
    public void display()
    {
        System.out.printf("Your Roll Number is %d Your Section is ",rno,section);
    }
}
