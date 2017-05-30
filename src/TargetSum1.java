import java.util.Arrays;
import java.util.HashSet;

public class TargetSum1 {

	public static void findTwoInt(int[] arr,int x){
		int i=0,j=0;
		int flag=0;
		Arrays.sort(arr);
		for(i=0,j=arr.length-1;i<j;){
			if(arr[i]+arr[j] == x){
				System.out.println("Two integers are : " + arr[i] + " and " + arr[j]);
				flag=1;
				break;
			}else if(arr[i]+arr[j] < x) i++;
			else if(arr[i]+arr[j] > x) j--;
		}if(flag==0){
			System.out.println("No two numbers add upto x");
		}
	}
	
	
	public static void bstMethod(int[] arr,int x){
		BinarySearchTree bst = new BinarySearchTree();
		int flag=0;
		for(int i :arr){
			if(x-i != i)
				bst.insert(x-i);
		}
		for(int i : arr){
			if(bst.search(i) == true){
				System.out.println("Two numbers are " + i + " and " + Math.abs(x-i));
				flag=1;
				break;
			}
		}
		if(flag==0){
				System.out.println("No two numbers add upto x");
		}
	}
	
	public static void hashMethod(int[] arr,int x){
		HashSet<Integer> set = new HashSet<Integer>();
		int flag=0;
		for(int i : arr){
			if(x-i != i)
				set.add(x-i);
		}
		for(int i : arr){
			if(set.contains(i)){
				System.out.println("Two numbers are " + i + " and " + Math.abs(x-i));
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println("No two numbers add upto x");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,1,6,4,8,5}; // 
		int x = 9;
		findTwoInt(arr,x);
		bstMethod(arr, x);
		hashMethod(arr, x);
	}

}
