public class vowels {
    public static void main(String[] args) {
        String test="pp";
        int count=0;
        int length=test.length();
        for(int i=0;i<length;i++)
        {
            if ("aeiouAEIOU".indexOf(test.charAt(i))!=-1) 
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
