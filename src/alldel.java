import java.util.Scanner;

public class alldel {
    public static void main( String args []){
        Scanner input = new Scanner(System.in);
        int x;
        x = input.nextInt();

        for(int i =1;i<=x;i++){
            if(x%i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
