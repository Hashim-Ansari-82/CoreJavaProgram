import java.util.Map;
import java.util.LinkedHashMap;

public class NonRepeatedChar {

      public static void main(String[] args) {
        String str="hashimrani";
        Map<Character,Integer> h=new LinkedHashMap<>();
        for(char c:str.toCharArray()){
            h.put(c, h.getOrDefault(c, 0)+1); 
        }
        for(Map.Entry<Character,Integer> entry:h.entrySet()){
            if(entry.getValue()==1){
                System.out.println("First Non-Repeated Char : "+entry.getKey());
                break;
            }
        }
      }
}
