import java.util.Scanner;

public class numberZ {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int x;
        x = input.nextInt();
        if(x>0){
            System.out.println(1);
        }
        if(x<0){
            System.out.println(-1);
        }
        if(x==0){
            System.out.println(0);
        }
    }
}
