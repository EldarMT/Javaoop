import java.util.Scanner;
public class lastnumber {
    public static void main(String atgs []){
        Scanner input = new Scanner(System.in);
        int s;
        System.out.println("NUmber:");
        s = input.nextInt();
        int a = s % 10;
        System.out.println("A-R:");
        System.out.println(a);
    }
}
