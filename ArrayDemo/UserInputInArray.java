import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInputInArray {
  public static void main(String[] args) throws Exception{
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("<------------- Enter Array Size ----------->");
     int size=Integer.parseInt(br.readLine());
     int[] a=new int[size];
     System.out.println("Enter Array Element "+size);
     for(int i=0; i<a.length; i++){
        System.out.println("Enter element in index "+i);
        a[i] = Integer.parseInt(br.readLine());
     }
     System.out.println("<------------- Array Value ----------->");
     for (int i = 0; i<a.length; i++) {
        System.out.println("\n<----- Value in specific Index -------> "+i+" ---> "+a[i]);
     }
     
  }
}
