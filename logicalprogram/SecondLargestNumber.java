public class SecondLargestNumber {
    public static void main(String[] args) {
        int a=28;
        int b=14;
        int c=38;
        if((a>b && a>c ) || (a<c && a<b)){
            System.out.println(b+" is second largest number");
        }
        else if((b<a && b<c) || (b>a && b>c)){
          System.out.println(a+" is second largest number");
        }
        else{
          System.out.println(c+" is second largest number ");
        }
    }
}
