public class Equall_strings {
    public static void main(String[] args) {
        String s1="Ali";
        String s2="Ali";
        if (s1==s2) {
            System.out.println("S1 is equall to S2");
            
        }
        else{
            System.out.println("S1 is not equall to S2");
        }//Checking by Equalls method
        if (s1.equals(s2)) {
            System.out.println("S1 is equall to S2 by equals methos");
            
        }
        else{
            System.out.println("S1 is not equall to S2 by equals method");
        }
        //storing string as an object
        String S3= new String("Ali");
        String S4= new String("Ali");
        if (S3==S4) {
            System.out.println("S3 OBJECT STRINGIS EQUALL TO S4 BY == METHOD");
            
        }
        else{
            System.out.println("S3 OBJECT STRING IS NOT EQUALL TO S4 BY == METHOD");
        }
        //Checking by equals method
        if (S3.equals(S4)) {
            System.out.println("S3 OBJECT STRINGIS EQUALL TO S4 BY == METHOD");
            
        }
        else{
            System.out.println("S3 OBJECT STRING IS NOT EQUALL TO S4 BY == METHOD");
        }
    }

}
