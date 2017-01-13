import java.util.Arrays;

//Minimum Number of Platforms Required for a Railway/Bus Station
//http://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/
//Time Complexity : (nlogn)
public class MinumimNumberofPlatforms {

	public static void findMinimumPlatforms(int[] arr,int dep[]){
		int i=0,j=0,platformCount=0,finalCount=0;
		while(i<arr.length && j<dep.length){
			if(arr[i]<=dep[j]){
				platformCount++;
				if(platformCount>finalCount)
					finalCount = platformCount;
				i++;
			}else{
				platformCount--;
				j++;
			}
		}
		System.out.println(finalCount);
	}
	
	public static void main(String[] args) {
		int[] arr = {900,  940, 950,  1100, 1500, 1800};
		int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
		Arrays.sort(arr);
		Arrays.sort(dep);
		findMinimumPlatforms(arr,dep);
	}
}
