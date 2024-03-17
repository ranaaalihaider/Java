public class Strings {
    public static void main(String[] args) {
        String s1= new String("Hello");
        String s2= new String("Ali");
        System.out.println(s1);
        System.out.println(s2);
        s1=s1.concat(s2);
        System.out.println(s1);
        s1=s1.substring(2);
        System.out.println(s1);
    }
}
