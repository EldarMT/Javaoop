import java.util.Scanner;

public class testS {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int a,b;
        a= input.nextInt();
        b= input.nextInt();
        if(a!=1 & b!=1 || a==1 & b==1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
