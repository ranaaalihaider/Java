class example 
{
    static int num=0;
    String name="Ali";
    int age=20;

}
public class static_code {
    public static void main(String[] args) 
    {
        String h="hello";
        h.con
        System.out.println("Calling without object");
        System.out.println(example.num);
        example.num=40;
        System.out.println(example.num);
        example obj=new example();
        example obj1=new example();
        //dealing with obj
        System.out.println("Simple obj values");
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.num);
        //dealing with obj1
        obj1.age=999;
        obj.name="Haider";
        obj1.num=-999;
        System.out.println("obj1 values");
        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.num);
        //caliing again obj values
        System.out.println("calling again obj values after change in obj1");
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.num);
        

    }
}
