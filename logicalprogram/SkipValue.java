public class SkipValue {
   public static void main(String[] args) {
    for(int i=0; i<=10; i++){
        if(i==7 || i==9){
            continue;
        }
        System.out.print(i+" ");
    }
   }
}
