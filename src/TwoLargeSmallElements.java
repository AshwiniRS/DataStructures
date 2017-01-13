
public class TwoLargeSmallElements {

	int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
	int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
	public void find2largestEle(int[] arr){
		for(int i=0;i<arr.length; i++){
			if(arr[i] > max1){
				max2=max1;
				max1=arr[i];
			}else if(arr[i]>max2){
				max2=arr[i];
			}
		}
		System.out.println(max1 + " " + max2);
	}
	
	public void find2smallestEle(int[] arr){
		for(int i=0;i<arr.length; i++){
			if(arr[i] < min1){
				min2=min1;
				min1=arr[i];
			}else if(arr[i]<min2){
				min2=arr[i];
			}
		}
		System.out.println(min1 + " " + min2);
	}
	
	public static void main(String[] args) {
		int[] arr = {10,5,3,7,11,25,36};
		TwoLargeSmallElements obj = new TwoLargeSmallElements();
		obj.find2largestEle(arr);
		obj.find2smallestEle(arr);
	}

}
