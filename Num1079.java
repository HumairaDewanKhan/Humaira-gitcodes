import java.util.Scanner;

public class Num1079 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    float x,y,z,w,avg;
    for (int i = 1; i <= n; i++) {

        x= sc.nextFloat();
        z= sc.nextFloat();
        y= sc.nextFloat();
        w=(2*x)+(3*y)+(5*z);
        float n2 = n;
        avg =w/n2;
        System.out.printf("%.1f",avg);
    }
    //3
    //6.5 4.3 6.2
    //5.1 4.2 8.1
    //8.0 9.0 10.0
}
}
