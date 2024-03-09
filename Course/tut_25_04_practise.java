public class tut_25_04_practise {
    public static void main(String[] args) {
        //Pattern using while loop
        int limit=4;
        while (limit>0) {
            int limit2=limit;
            while (limit2>0) {
                System.out.print("*");
                limit2=limit2-1;
            }
            limit=limit-1;
            System.out.println();
        }
    }
}
