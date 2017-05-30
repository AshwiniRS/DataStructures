import java.util.Arrays;

public class KthSmallestElement {

	public int arrayMethod(int[] values, int k){
		int r=0;
		QuickSort qs = new QuickSort();
		qs.sort(values);
		System.out.println(Arrays.toString(values));
		System.out.println(values[k-1]);
		return r;
	}
	
	public static void main(String[] args) {
		int[] values = {3,1,6,4,8,5,9,12,18,14,16,23};
		int k = 5;
		KthSmallestElement kobj = new KthSmallestElement();
		kobj.arrayMethod(values, k);
		
	}
}
