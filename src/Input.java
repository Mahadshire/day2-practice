import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("please inter some input: ");
        int rollno = input.nextInt();
        System.out.println(" your rollno is " + rollno);
        String name = input.next();
        System.out.println(name);
        float marks = input.nextFloat();
        System.out.println(marks);


    }
}