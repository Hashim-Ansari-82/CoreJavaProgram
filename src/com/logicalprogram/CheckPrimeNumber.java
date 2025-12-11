package LogicalProgram;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int a=sc.nextInt();
        int count=0;
        for(int i=1; i<=a; i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(a+" Is a Prime Number");
        }
        else
            System.out.println(a+" Is not Prime Number");
         sc.close();
    }
}
