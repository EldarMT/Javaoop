import java.util.Scanner;

public class arrd {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        int s =0;
        int[] a = new int [n];
        for(int i = 0; i < n; ++i){
            a[i] = input.nextInt();
        }
        for(int i = 1; i < n; ++i){
            if(a[i] > a[i-1]){
                s++;
            }
//k = k + (arr[i-1] < arr[i]);
        }
        System.out.println(s);
    }
}
