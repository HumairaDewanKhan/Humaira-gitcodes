import java.util.Scanner;

public class Num1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y;
        for (int i = 1; i <= n; i++) {
            y = sc.nextInt();
            if(y>0 && y%2==0){
                System.out.println("EVEN POSITIVE");
            }
           else if(y>0 && y%2!=0){
                System.out.println("ODD POSITIVE");
            }
            else if(y<0 && y%2==0){
                System.out.println("EVEN NEGATIVE");
            }
            else if(y<0 && y%2!=0){
               System.out.println("ODD NEGATIVE");
            }
            else{
                System.out.println("NULL");
            }

        }

    }
}
