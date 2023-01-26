import java.util.Scanner;

public class Num1072 {
    {
        Scanner sc = new Scanner(System.in);
        int n,y;
        n= sc.nextInt();
        int countin =0;
        int countout =0;
        for (int i = 1; i <=n ; i++) {
            y = sc.nextInt();
            if(y>=10 && y<=20){
                countin++;
            }
            else countout++;

        }
        System.out.println(countin+" in");
        System.out.println(countout+" out");
    }
}
