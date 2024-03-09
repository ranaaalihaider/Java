public class tut_017_relational_logical_operators {
    public static void main(String[] args) {
        //    &&  AND
        //    ||   OR
        //     !   NOT
        boolean a=true;
        boolean b=false;
        boolean c=true;
        System.out.println("Checking and \"&&\"");
        if (a&&b==true) {
            System.out.println("Both are True");
        }
        else{
            System.out.println("Both Does not give true output");
        }
        System.out.println("Checking or \"||\"");
        if (a||b==true) {
            System.out.println("Both are True");
        }
        else{
            System.out.println("Both Does not give true output");
        }
        System.out.println("For a b and c ");
        if (a==c && b==c) {
            System.out.println("a==c b==c");
        }
        else{
            System.out.println("Condition False");
        }
        if (a==c || b==c) {
            System.out.println("a==c or b==c");
        }
        else{
            System.out.println("condition false");
        }
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);
        System.out.println("Value of not of a (!a)  is "+!a);
        System.out.println("Value of not of a (!b)  is "+!b);
    }
}
