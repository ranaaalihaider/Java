public class tut_24_break_continue {
    public static void main(String[] args) {
        for(int i=0; i<=10;i++){
            System.out.println(i);
            System.out.println("Hello World");
        }
        System.out.println("                Loop 2");
        for(int i=0; i<=10;i++){
            System.out.println(i);
            System.out.println("Hello World");
            if (i==5) {
                System.out.println("Ending the loop");
                break;
            }
        }
        System.out.println("                Loop 3");
        for(int i=0; i<=10;i++){
            System.out.println(i);
            System.out.println("Hello World");
            if (i==5) {
                continue;
            }
            System.out.println("Statement 2");
        }
    }
}
