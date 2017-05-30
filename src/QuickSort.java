import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	
	private int[] arrToSort;
	private int length;
	
	public void sort(int[] values){
		if(values == null || values.length == 0)
			return;
		this.arrToSort = values;
		this.length=values.length;
		quickSort(0,length-1);
		values = this.arrToSort;
	}
	
	
	public void quickSort(int low, int high){
		int i = low;
		int j = high;
		
		Random rand = new Random();
		int num = low + rand.nextInt(high - low);
		
 	//	int pivot = arrToSort[low + (high-low)/2];
		int pivot = arrToSort[num];
		while(i<=j){
			while(arrToSort[i]<pivot){
				i++;
			}
			while(arrToSort[j]>pivot){
				j--;
			}
			
			if(i<=j){
				int tmp = arrToSort[i];
				arrToSort[i] = arrToSort[j];
				arrToSort[j] = tmp;
				i++;
				j--;
			}
		}
		
		if(low<j){
			quickSort(low, j);
		}
		if(i<high){
			quickSort(i, high);
		}
	}
	
	public static void main(String[] args) {
		int[] values = {3,1,6,4,8,5,9,12,18,14,16,23};
		QuickSort qs = new QuickSort();
		qs.sort(values);
		System.out.println(Arrays.toString(qs.arrToSort));
	}

}
