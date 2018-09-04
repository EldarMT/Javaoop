import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class triangleG {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int a ,b ,d;

        System.out.println("Enter first number:");
        a = input.nextInt();
        System.out.println(("Enter second number:"));
        b = input.nextInt();
        d = (a*a + b * b);
        double c = sqrt(d);
        System.out.println("Hypotenuse:");
        System.out.println(c);



    }
}
