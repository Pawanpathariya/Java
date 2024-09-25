import  java.util.*;
public class sub {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter number");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        System.out.println("Enter number");
        b=s.nextInt();
        System.out.println("Substraction : "+(a-b));
        s.close();
    }
}
