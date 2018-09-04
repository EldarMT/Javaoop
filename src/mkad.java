import java.util.Scanner;
public class mkad {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int v , t;
        int l = 109 ;
        System.out.println("Enter speed:");
        v = input.nextInt();
        System.out.println("Enter time:");
        t = input.nextInt();
        int n;
        int h=(v*t);
        if(h>0)
            n = (v * t) % l;

        if (h<=0) {
            n = (l + (v * t) % l) % l;
        }



        System.out.println("Answer:");
        System.out.println(n);

    }
}
