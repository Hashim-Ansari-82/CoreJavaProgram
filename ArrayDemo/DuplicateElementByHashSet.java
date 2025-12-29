import java.util.HashSet;

class DuplicateElementByHashSet{
    public static void main(String[] args){
      int[] a={3,4,5,6,7,8,9,0,9,8,7,6,5,5,5,4,4,33,33};
         HashSet<Integer> seen=new HashSet<>();
         HashSet<Integer> duplicate=new HashSet<>();
         for(int i:a){
            if(!seen.add(i)){
                duplicate.add(i);
            }
         }
           System.out.print("Duplicate Element : "+duplicate);
    }
}