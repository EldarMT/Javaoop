import java.util.Scanner;

public class clock2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n ;
        System.out.println("Enter second:");
        n = input.nextInt();
        System.out.println(( n / 3600 % 24)+ ":" + (n/3600/60% 10)+ ":" + (n%60%10));
    }
}
