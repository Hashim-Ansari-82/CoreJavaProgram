public class ContinueNoWithoutLoop {
  
       public static void  printNo(int no){
             if(no>10){
              return;    
            }
            System.out.println(no);
            printNo(no+1);
        }
    public static void main(String[] args) {
        printNo(1);
     
    }

}
