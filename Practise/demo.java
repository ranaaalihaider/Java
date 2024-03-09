public class demo {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int d=2;

        a = (b++) + 3 * ++d;
        System.out.printf("%d %d %d %n",a,b,d);
        int c = 2 * d + (++b) + a;
        System.out.printf("%d %d %d %d %n",a,b,c,d);
        b = 2 * (++c) - (a++);
        System.out.printf("%d %d %d %d %n",a,b,c,d);
        d = d++ + d + b++ + b;
        System.out.printf("%d %d %d %d",a,b,c,d);


    }
}
