import java.util.Scanner;

public class nextj {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a;
        a = input.nextInt();
        System.out.println(a+2 - a%2);
    }
}
