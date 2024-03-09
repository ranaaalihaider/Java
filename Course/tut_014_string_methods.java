public class tut_014_string_methods {
    public static void main(String[] args) {
        String name="Ali haider";
        System.out.println(name);
        //now we will apply methods on string
        /*  1-.length()
            2-.toLowerCase()
            3-.toUpperCase()
            4-.trim()
            5-.substring()
            6-.replace()
            7-.startswith()
            8-.endswith()
            9_.charAt()
            10_.indexof()
            11_.lastindexof()
            12_.equal()
            12_.equalsIgnoreCase()
         */
        
        String statement="This is an example string";
        
        System.out.println(statement);
        System.out.print("Length of string is : " );
        int value=statement.length();
        System.out.println(value);
        System.out.println("Lowe case String is Following ");
        String str_lr=statement.toLowerCase();
        System.out.println(str_lr);
        System.out.println("Upper case string is following");
        String str_upr=statement.toUpperCase();
        System.out.println(str_upr);
        System.out.println(statement.toLowerCase());
        String non_trim_string="       Ali Haider      ";
        System.out.println(non_trim_string);
        String trimed_string=non_trim_string.trim();
        System.out.println(trimed_string);
        System.out.println(statement.substring(3,15));
        //upper line will start printing from this index number start index is included ending index is excluded
        System.out.println(".replace");
        System.out.println(statement.replace('T','i'));
        System.out.println(".replace");
        System.out.println(statement.replace("This","it"));
        System.out.println(".startswith");
        System.out.println(statement.startsWith("This"));//true
        System.out.println(".startswith");
        System.out.println(statement.startsWith("it"));//false
        System.out.println("endswith");
        System.out.println(statement.endsWith("string"));//true
        System.out.println(".endswith");
        System.out.println(statement.endsWith("String"));//false
        System.out.println(".chatAt");
        System.out.println(statement.charAt(1));
        System.out.println(".indexOf");
        System.out.println(statement.indexOf('s'));
        System.out.println(".indexOf");
        System.out.println(statement.indexOf('s',3));//now it will start searching after index 3
        System.out.println(statement.indexOf("str"));
        System.out.println(statement.indexOf('a', 0));
        System.out.println(".lastIndexOf");
        System.out.println(statement.lastIndexOf('a'));
        System.out.println(".equalsto");
        System.out.println(statement.equals("This is an example string"));
        System.out.println(statement.equals("this is an example string"));
        System.out.println(statement.equalsIgnoreCase("this is an example string"));
        //will ignore upper case and lower case cinditions
        System.out.println("Here are escape sequence \"Hi\" here is line break \n thi is this tab space \t this is this is backslash \\ ");
        



    }
}
