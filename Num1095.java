public class Num1095 {
    public static void main(String[] args) {
        int x =60;
        for (int i = 1; i <=650; i=i+3) {
            System.out.println("I = "+i+" J = "+x);
            x= x-5;
           if(x==0){
               System.out.println("I = "+(i+1)+" J = "+x);
               break;
           }

            
        }
    }
}
