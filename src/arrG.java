import java.util.Scanner;

public class arrG {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int n;
        int k;
        n = input.nextInt();
        int s =0;
        int[] a = new int [n];
        for(int i = 0; i < n; ++i){
            a[i] = input.nextInt();
        }
        for(int i = 0; i < n/2; i++){
            k = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = k;
        }
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }

    }
}
