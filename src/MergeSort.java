import java.util.Arrays;

public class MergeSort {
	
	private int[] arrToSort;
	private int[] combineArr;
	private int length;
	
	public void sort(int[] values){
		this.arrToSort = values;
		this.combineArr = new int[values.length];
		length = values.length;
		mergeSort(0,length-1);
	}
	
	public void mergeSort(int low,int high){
		if(low<high){
			int middle = low +(high-low) /2;
			mergeSort(low, middle);
			mergeSort(middle+1, high);
			merge(low,middle,high);
		}
	}
	
	public void merge(int low, int middle, int high){
		for(int i=low; i<=high; i++){
			combineArr[i] = arrToSort[i];
		}
		
		int i = low;
		int  j = middle+1;
		int k = low;
		
		while(i<=middle && j<=high){
			if(combineArr[i] <= combineArr[j]){
				arrToSort[k] = combineArr[i];
				i++;
			}
			else{
				arrToSort[k] = combineArr[j];
				j++;
			}
			
			k++;
		}
		
		while(i<=middle){
			arrToSort[k] = combineArr[i];
			k++;
			i++;
		}
	}
	public static void main(String[] args) {
		int[] values = {3,7,1,2,6,9,8};
		MergeSort ms = new MergeSort();
		ms.sort(values);
		System.out.println(Arrays.toString(ms.arrToSort));
	}

}
