import java.util.Scanner;
public class mid 
{
    public static void main(String[] args) 
    {
        int marks=0;
        String name="";
        String reg="";
        Scanner input=new Scanner(System.in);
        while (true) 
        {
            System.out.print("Enter Reg No : ");
            reg=input.next();
            input.nextLine();
            System.out.println(reg);
            if (reg.equals("0") || reg.equals("null")) 
            {
                System.out.println("Exit");
                break;
            }
            else
            {
                System.out.print("Enter Name : ");
                String newName=input.nextLine();
                System.out.print("Enter Marks : ");
                int newMarks=input.nextInt();
                input.nextLine();
                if (newMarks>marks) 
                {
                    marks=newMarks;
                    name=newName;
                }
            }

        }
        System.out.printf("%s has maximum marks %d",name,marks);
    }
}
