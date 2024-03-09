public class demo2 {
    public static void main(String[] args) {
        int a,b,sum;
        double c;
        a=3;
        b=5;
        c=14.1;
        sum=a+b+(int)c;
        System.out.printf("a %d b %d c %f sum %d",a,b,c,sum);
        c /= a;
        System.out.println();
        System.out.printf("a %d b %d c %f sum %d",a,b,c,sum);
        b += (int) c - a;
        System.out.println();
        System.out.printf("a %d b %d c %f sum %d",a,b,c,sum);
        a *= 2 * b + (int) c; 
        System.out.println();
        System.out.printf("a %d b %d c %f sum %d",a,b,c,sum);
    

    }
}
