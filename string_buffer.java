public class string_buffer 
{
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Ali");
        System.out.println(sb);
        sb.append(" Haider");
        System.out.println(sb);
        String str= "Rana ";
        System.out.println(str);
        str=str.concat( "Ali Haider");
        System.out.println(str);

    }
    
}
