import java.util.Scanner;

public class zero {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
int s=0;
        for(int i=1;i<=a;i++){
            b = input.nextInt();
            if(b==0)
            {
                s++;
            }
        }
        System.out.println("Sum of zero:");
        System.out.println(s);
    }
}
