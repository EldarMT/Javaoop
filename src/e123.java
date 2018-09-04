import java.util.Scanner;

public class e123 {
    public static void main( String args []){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i =1 ; i<=10 ; i++){
            int res =(n * i);


            System.out.println(n + " * " + i + " = " + res);
        }
    }
}
