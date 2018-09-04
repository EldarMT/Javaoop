import java.util.Scanner;

public class arrC {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        int s =0;
        int[] a = new int [n];
        for(int i = 0; i < n; ++i){
            a[i] = input.nextInt();
        }
        for(int i = 0; i < n; ++i){
            if(a[i] >= 0){
                s++;
            }

        }
        System.out.println(s);
    }
}
