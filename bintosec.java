public class bintosec {
    public static void main(String[] args) {
        int bin=1101;
        int result=0;
        int power=0;
        while (bin>0) 
        {
            int digit=bin%10;
            int dec=digit*((int)Math.pow(2, power));
            result+=dec;
            power+=1;
            bin/=10;
        }
        System.out.println(result);
    }
}
