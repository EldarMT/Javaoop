import java.util.Scanner;
public class apple2 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("Apple:");
        a = input.nextInt();
        System.out.println("Children:");
        b = input.nextInt();
        c = b - (b/a) * a;
        System.out.println("IN Basket:");
        System.out.println(c);
    }
}
