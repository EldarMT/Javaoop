import java.util.Scanner;

public class HR3 {
    public static  void main( String  args []){
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        if(n%2==0 & n>=6 & n<=20){
            System.out.println("Weird");
        }else{
            System.out.println("u are so Crazy1");
        }
    }
}
