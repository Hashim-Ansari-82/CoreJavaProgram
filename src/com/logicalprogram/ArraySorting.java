package LogicalProgram;

import java.util.Arrays;
import java.util.Optional;

public class ArraySorting {

		    public static void main(String[] args){
			  @SuppressWarnings("boxing")
			  Integer[] a={3,9,7,4,9,2,1,};
			  Optional<Integer> findFirst=Arrays.asList(a).stream().sorted().skip(1).findFirst();
			  System.out.println(findFirst.get());
			
		  }

	}

