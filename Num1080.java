import java.util.Scanner;

public class Num1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        int max=0;
        int index =0;
        for (int i = 1; i <=100 ; i++) {
            n=sc.nextInt();
            if(n>max){
                max =n;
                index =i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }

}
