public class binary {
    public static void main(String[] args) {
        int num=13;
        int binary=0;
        int place=1;
        while (num>0) 
        {
            int reminder=num%2;
            binary=binary+reminder*place;
            num/=2;
            place*=10;

        }
        
        System.out.println(binary);
    }
}
