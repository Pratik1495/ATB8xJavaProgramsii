package Task;

public class Task2_calculator {
    public static void main(String[] args) {
        double a=10;
        double b=30;


        //calculation
//        double addition = a+b;
//        double subtraction = a-b;
//        double multiply = a*b;
//        double division = a/b;
//        double remainder = a%b;

        System.out.printf("%f + %f =%f",a,b,a+b);
        System.out.println();
        System.out.printf("%f - %f =%f",a,b,a-b);
        System.out.println();
        System.out.printf("%f * %f =%f",a,b,a*b);
        System.out.println();
        System.out.printf("%f / %f =%f",a,b,a/b);
        System.out.println();
        System.out.printf("%f modulus %f =%f",a,b,a%b);
        System.out.println();
    }
}
