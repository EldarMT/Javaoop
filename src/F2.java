import java.util.Scanner;

public class F2 {
    public static void main( String args []){
        Scanner input = new Scanner(System.in);
        double a , b;
        a = input.nextInt();
        b = input.nextInt();

        double c = Math.pow(a,b);

        System.out.print(c);
    }
}
