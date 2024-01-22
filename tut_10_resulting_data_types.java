public class tut_10_resulting_data_types {
    public static void main(String[] args) {
       /*
        R=int+int=int
        R=int+float=float
        r=ont+char=int
        r=float+double=double
        */
        //Increment and Decrement Operators
        int i =50;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        int y=7;
        int x= ++y*8;
        System.out.println(x);//outputs is 64 
        char ch= 'a';
        System.out.println(ch);
        System.out.println(++ch);//increment in character output is b

    }
    
}
