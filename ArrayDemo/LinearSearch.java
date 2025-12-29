import java.io.*;

class LinearSearch{
    public static void main(String[] args)throws IOException {
        int[] a={3,5,23,67,90,87,65,12,43,143};
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a key");
        int key=Integer.parseInt(br.readLine());
        boolean found=false;
       
        for (int i = 0; i < a.length; i++) {
            if(a[i]==key){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Your search element is : "+key);
        }
        else {
            System.out.println("Your Search element not Present in Arry ");
        }
    }
}