import java.util.Scanner;

public class clock1 {
    public static void main( String args []){
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        System.out.println((n/60%24) + " " + (n%60));
    }
}
