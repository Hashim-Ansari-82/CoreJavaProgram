package arrayprogram;

import java.util.Arrays;

public class CopyArrayDemo {

	public static void main(String[] args) {
		  int[] original={1,3,2,4,5,5,4,3,2,1};
		   int[] copy =new int[original.length];
		   
		   System.arraycopy(original,0,copy,0,original.length);
		  System.out.println(Arrays.toString(copy));
		}
	}
