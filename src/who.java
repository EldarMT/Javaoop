import java.util.Scanner;
public class who {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("ENter first number:");
        a = input.nextInt();
        System.out.println("Enter second number:");
        b = input.nextInt();

        if(a>b){
            System.out.println(1);
        }
        if(a<b){
            System.out.println(2);
        }
        if (a==b){
            System.out.print(0);
        }
    }
}
