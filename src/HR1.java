import java.util.Scanner;

public class HR1 {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        if(n%2==0){
            System.out.println("not Weird");
        }else {
            System.out.println("Weird");
        }
    }
}
