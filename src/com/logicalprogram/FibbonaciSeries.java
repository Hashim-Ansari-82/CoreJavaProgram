package LogicalProgram;

public class FibbonaciSeries {
    public static void main(String[] args) {
        int no1 = 0;
        int no2 = 1;
        System.out.print(no1+","+no2);
       for(int i=1; i<=5; i++) {
           int sum=no1+no2;
           System.out.print("," + sum);
           no1 = no2;
           no2 = sum;
       }
    }

}
