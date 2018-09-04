import java.util.Scanner;

public class snail {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int h,a,b,s,l;
        h = input.nextByte();
        a = input.nextInt();
        b = input.nextInt();
        l=h-a;
        s=a-b;
        System.out.println(1+l/s+(l%s+s-1)/s);
    }
}
