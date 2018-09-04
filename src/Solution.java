import java.util.Scanner;

public class Solution {
    public static void main(String  args []){
        Scanner in = new Scanner(System.in);
        int i = 1;
        while(in.hasNext()){
            String s= in.nextLine();
            System.out.println();
            System.out.println("/////////////////////////////////");
            System.out.println(i + " " + s);
            i++;
        }

    }
}
