class  Calculator {
    public int add(int num1, int num2)
    {
        int result=num1+num2;
        return result;
    } 
    public int substract(int num1, int num2)
    {
        int result=num1-num2;
        return result;
    } 
    public int multiply(int num1, int num2)
    {
        int result=num1*num2;
        return result;
    } 
    

    
}
public class Methods {
    public static void main(String[] args) 
    {
        Calculator cal= new Calculator();
        int n1=10;
        int n2=2;
        int add=cal.add(n1, n2);
        int sub =cal.substract(n1, n2);
        int multiply=cal.multiply(n1, n2);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(multiply);
    }
}
