import java.util.Scanner;

public class year {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int y;
        System.out.println("Year:");
        y = input.nextInt();

        Boolean A = (y % 4 == 0);
        Boolean B = (y % 400 == 0);
        Boolean C = (y % 100 == 0);

        if((A & !C ) || B){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
