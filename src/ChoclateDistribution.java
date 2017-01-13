import java.util.Arrays;

//TIME COMPLEXITY - O(nlogn)
//http://www.geeksforgeeks.org/chocolate-distribution-problem/

public class ChoclateDistribution {

	public static void findMinDiffPackets(int[] arr,int m){
		int min = Integer.MAX_VALUE;
		int res_i=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			if((i+m-1)<arr.length && min>(arr[i+m-1]-arr[i])){
				min = arr[i+m-1]-arr[i];
				res_i=i;
			}
		}
		
		for(int k=res_i;k<m+res_i;k++)
		System.out.println(arr[k]);
	}
	public static void main(String[] args) {
		int[] arr = {7, 3, 2, 4, 9, 12, 56};
		int m = 3;
		findMinDiffPackets(arr,m);
	}

}
