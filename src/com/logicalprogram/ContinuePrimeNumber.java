package LogicalProgram;

import java.util.Scanner;

public class ContinuePrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        int a=sc.nextInt();
        for(int i=2; i<=a; i++){
            boolean isPrime=false;
            for(int j=2; j<=i/2; j++){
                if(i%j==0){
                    isPrime=true;
                    break;
                }
            }
            if(isPrime==false){
                System.out.println(i+" ");
            }
            sc.close();
        }
    }
}
