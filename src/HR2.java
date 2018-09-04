import java.util.Scanner;

public class HR2 {
    public static void main(String  args []){
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        if(n%2==0 & n>=2 & n<5){
            System.out.println("Not Weird");
        }else
        {
            System.out.println("go to HELL!");
        }
    }
}
