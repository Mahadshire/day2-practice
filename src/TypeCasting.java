import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b);
//        byte a = 5;
//        byte b = 6;
//        byte c = 3;
//        int d = (a*b)/c;
//        System.out.println(d);
        byte b = 45;
        char c = 'a';
        short s = 300;
        float f = 44.456f;
        int i = 234456;
        double d = 0.0235;
        double result = (f * b) + (i/c) - (d * s) ;
        System.out.println((f * b) +" "+ (i/c) +" "+ (d * s));

    }
}
