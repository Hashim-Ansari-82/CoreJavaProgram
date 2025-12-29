import java.util.*;

class Atm{

    int pin=1234;
    int amount;
    int deposite;
    public void menu(){
        System.out.println("enter choice");
        System.out.println("1 check balance");
    }
    Scanner sc=new Scanner(System.in);

    int balance=sc.nextInt();

    public void checkBalance(){
        System.out.println("Current balance : "+balance);

    }
    public void withdraw(){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Curent Balance : "+balance);
        }
    }
    public void deposite(){
    }
}