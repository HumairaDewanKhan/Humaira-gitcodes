public class Num1097 {
    public static void main(String[] args) {
        int x = 8;
        for (int i = 1; i <=9; i=i+2) {

            for (int j = 1; j <=3; j++) {
              x--;
                System.out.print(x);
                if (i == 3) {

                    for (int k = 7; k >=15; k--) {
                        System.out.print(" "+k);
                    }
                }


            }


        }
    }
}
