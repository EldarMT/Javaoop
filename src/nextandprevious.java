import java.util.Scanner;
public class nextandprevious {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("NUmbeR:");
        a = input.nextInt();

        System.out.println("The next number for the number " + a + " is " +(a+1) + ".");
        System.out.println("The previous number for the number " + a + " is " + (a-1) + ".");

    }
}
