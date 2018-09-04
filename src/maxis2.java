import java.util.Scanner;

public class maxis2 {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("First number:");
        a = input.nextInt();
        System.out.println("Second number:");
        b = input.nextInt();

        System.out.println("MAX IS:");
        if(a>b){
            System.out.println(a);

        }else{
            System.out.println(b);
        }

    }
}
