public class task_10 {
    public static void main(String[] args) {
        int degree=30;
        double radians=Math.toRadians(degree);
        double sin=Math.sin(radians);
        double cos=Math.cos(radians);
        double tan=Math.tan(radians);
        
        System.out.printf("Degrees \t Radians\tSine\tCosSine\tTangent %n %d \t\t %.4f\t        %.4f\t %.4f\t %.4f",degree,radians,sin,cos,tan);
        degree=60;
        radians=Math.toRadians(degree);
        sin=Math.sin(radians);
        cos=Math.cos(radians);
        tan=Math.tan(radians);
        
        System.out.printf("%n %d \t\t %.4f\t        %.4f\t %.4f\t %.4f",degree,radians,sin,cos,tan);
    }
}
