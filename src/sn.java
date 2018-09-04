import java.util.Scanner;

import static java.lang.Math.abs;

public class sn {
    public static void main( String args []){
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        int a, b, s,d;
        a= n/1000;
        b= n/100%10;
        s = n/10%10;
        d= n%10;
        System.out.println(abs(a-d)+abs(b-s)+1);
    }
}
