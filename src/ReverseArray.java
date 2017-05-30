
public class ReverseArray {

	public static int[] revArr(int[] num){
		int start=0, end=num.length-1;
		while(start<=end){
			int temp = num[start];
			num[start] = num[end];
			num[end] = temp;
			start++;
			end--;
		}		
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {2,5,1,6,3,7};
		num = revArr(num);
		for(int i : num) System.out.println(i);
		
	}

}
