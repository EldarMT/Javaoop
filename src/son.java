import java.util.Scanner;

public class son {
    public static void main (String args []){
        Scanner input = new Scanner(System.in);
        int a;
        a = input.nextInt();
        System.out.println((a/100) + ((a/10)%10) + (a%10));
    }
}
