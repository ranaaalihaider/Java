import java.util.Scanner;
public class task_03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Class 1 Students ");
        int class_1=input.nextInt();
        System.out.println("Enter Class 2 Students ");
        int class_2=input.nextInt();
        System.out.println("Enter Class 3 Students ");
        int class_3=input.nextInt();
        //Class_1
        int bench_class_1=class_1/2;
        int additionalClass_1=class_1%2;
        int toalBenchClass_1=bench_class_1+additionalClass_1;
        //Class_2
        int bench_class_2=class_2/2;
        int additionalClass_2=class_2%2;
        int toalBenchClass_2=bench_class_2+additionalClass_2;
        //CLass_3
        int bench_class_3=class_3/2;
        int additionalClass_3=class_3%2;
        int toalBenchClass_3=bench_class_3+additionalClass_3;
        //Sum of Required Benches of all classes
        int totalBenchRequired=toalBenchClass_1+toalBenchClass_2+toalBenchClass_3;
        //Printing result
        System.out.println("Total Bench Required are : "+totalBenchRequired);

    }
}
