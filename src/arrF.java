import java.util.Scanner;

public class arrF {

    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        int s =0;
        int[] a = new int [n];
        for(int i = 0; i < n; ++i){
            a[i] = input.nextInt();
        }
        for(int i = 1; i < n-1; ++i){
            if(a[i]>a[i+1] && a[i]>a[i-1]){
                s++;
            }

        }
        System.out.println(s);
    }
}
