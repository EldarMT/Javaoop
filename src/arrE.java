import java.util.Scanner;

public class arrE {
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
            if(a[i]<0 & a[i+1]<0 || a[i]>0 & a[i+1]>0 ){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }

    }
}
