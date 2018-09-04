import java.util.Scanner;

public class sumN {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        int t, sum = 0;
        for(int i =1 ; i<=n;i++){
            t = input.nextInt();

            sum=sum+t;
        }
        System.out.println(sum);
    }
}
