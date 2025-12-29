import java.util.*;

class HashMapDemo{
  public static void main(String[] args){  
	HashMap<Integer,String> hm=new HashMap<>();
	hm.put(12,"Hashim");
	hm.put(15,"Huzaifa");
	hm.put(18,"Raiyyan");
	hm.put(20,"Mr Srk");
	System.out.println(hm);
	Iterator<Map.Entry<Integer,String>> itr=hm.entrySet().iterator();
	  while(itr.hasNext()){
	      Map.Entry<Integer,String> m=itr.next();
		  System.out.println(m.getKey()+" ---> "+m.getValue());
		  if(m.getKey().equals(15)){
		  itr.remove();
		  }
	  }
       System.out.println(hm);
    }
 }