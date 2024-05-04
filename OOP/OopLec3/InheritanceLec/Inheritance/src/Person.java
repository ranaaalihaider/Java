public class Person 
{
    String name;
    String fatherName;
    int age;
    int cnic;
    String address;
    public Person()
    {
        name="None";
        fatherName="none";
        age=0;
        cnic=0000;
        address="No Address";
    }
    public Person(String newName, String newFatherName,int newAge, int newCnic, String newAddress)
    {
        name=newName;
        fatherName=newFatherName;
        age=newAge;
        cnic=newCnic;
        address=newAddress;
    }
    public void display()
    {
        System.out.print("Your Name is %s your Father Name is %s your age : %d CNIC : %d %n Your Address : %s \n",name,fatherName,age,cnic,address);
    }
}
