public class Strr 
{
    public static void main(String[] args) 
    {
        String  st="AeiAoUA";
        System.out.println(st.toLowerCase());
        System.out.println(st.toUpperCase());
        System.out.println(st.trim());
        System.out.println(st.startsWith("A"));
        System.out.println(st.endsWith("U"));
        System.out.println(st.isEmpty());
        System.out.println(st.charAt(2));
        System.out.println(st.concat("heloo"));
        System.out.println(st.indexOf("A"));
        System.out.println(st.lastIndexOf("A"));
        String st1="ali";
        String st2="ali";
        System.out.println(st1.equals(st2));
        String st3="Ali";
        String st4="ali";
        System.out.println(st3.equals(st4));
        System.out.println(st3.equalsIgnoreCase(st4));
        String  ii="BBF";
        String  ij="BBCD";
        System.out.println(ii.compareTo(ij));


    }
}
