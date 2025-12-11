package arrayprogram;

public class SumOfArray {

	public static void main(String[] args) {
		int[] a= {1,3,4,7,6,5,4 };
		int sum=0;
		for(int i=0; i<a.length; i++) {
		sum +=a[i];
		}
		System.out.println("Sum of Array Elements = "+sum);
	

	}

}
