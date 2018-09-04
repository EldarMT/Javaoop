import java.util.Scanner;

public class mindel {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int x;
        x = input.nextInt();

        for(int i =2; i<=x; i++){
            int e =1;
            if(x%i==0){

                System.out.println(i);
            }
        }
    }
}
