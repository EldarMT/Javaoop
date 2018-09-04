import java.util.Random;
import java.util.Scanner;

public class div {
    public static void main ( String args []){
        Scanner input = new Scanner(System.in);
        int a,b;
        Random rnd = new Random();

        a = input.nextInt();
        b = input.nextInt();

        if(a%b==0 || b%a==0){
            System.out.println(1);
        }else{
            System.out.println(rnd);
        }
    }
}
