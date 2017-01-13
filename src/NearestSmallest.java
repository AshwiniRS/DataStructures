
public class NearestSmallest {

	public static void findNearestSmallest(int[] arr){
		int min = Integer.MAX_VALUE;
		int[] smallestint = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			if(i==0){
				smallestint[0] = 0;
				min = 0;
			}else{
				if(arr[i-1] < arr[i]){
					smallestint[i]=arr[i-1];
				}else if(min < arr[i]){
					smallestint[i]=min;
				}else{
					for(int k=i-1;k>=0;k--){
						if(smallestint[k]<arr[i]){
							smallestint[i]=smallestint[k];
							break;
						}
					}
				}
				min = smallestint[i];
			}
		}
		
		for(int i=0;i<smallestint.length;i++)
			System.out.println(smallestint[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,10,3,5};
		findNearestSmallest(arr);
	}

}
