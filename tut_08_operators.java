public class tut_08_operators {
    public static void main(String[] args) {
        int a=4;
        int b=6+a;
        System.out.println(b);
        //checking vaues by usig comparison operators 
        System.out.println("Comparison operator results");
        System.out.println(a==a);
        System.out.println(a>a);
        System.out.println(a>b);
        //logical operators
        System.out.println("Logical operator 'and 'results");
        System.out.println(10>5 && 7<15);
        System.out.println(10<5 && 7<15);
        System.out.println("Logical Operator or results");
        System.out.println(10<5 || 7<15);
    } 
    
}
