import java.util.Scanner;

public class Num1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int x;
        for (int i = 2; i <=n ; i=i+2) {

            x=i*i;
            System.out.println(i+"^"+2+" = "+x);
        }
    }
}
