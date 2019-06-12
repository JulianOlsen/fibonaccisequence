package fibonaccisequence;

import java.util.*;

public class fibonaccisequence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        double fibonaccisequencea = 1;
        double fibonaccisequenceb = 1;
        System.out.print(fibonaccisequencea+", "+fibonaccisequenceb+", ");
        while(true){
            double fibonacci = fibonaccisequencea+fibonaccisequenceb;
            System.out.println(fibonacci+", ");
            fibonaccisequencea = fibonaccisequenceb;
            fibonaccisequenceb = fibonacci;
        }
         */
        int number = scan.nextInt();
        double sumnumber = function1(number);
        System.out.println(sumnumber);
        
    }
     public static double function1(int num){

         double i = 0;
         double a = 1;
         double b = 2;
         double plus = 0;
         while (num>i){
             plus=a/b+plus;
             ++a;
             ++b;
             ++i;
         }
         return plus;
     }
}
