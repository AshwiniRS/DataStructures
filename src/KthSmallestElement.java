import java.util.Scanner;

//to find kth smallest element of an array using heap

public class KthSmallestElement {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array : ");
		int n = sc.nextInt();
		MaxHeap maxHeap = new MaxHeap(n);
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the value of k");
		int k = sc.nextInt();
		int low=0;
		int high = k-1;
		int[] heap = maxHeap.buildHeap(arr,low,high);
		for(int a=1;a<heap.length;a++){
			System.out.print(heap[a] +" ");
		}
		System.out.println();
		for(int l=k;l<n;l++){
			if(heap[1]>arr[l]){
				heap[k+1] = arr[l];
				heap=maxHeap.extractMin(heap,k+3);
				for(int a=1;a<heap.length;a++){
					System.out.print(heap[a] +" ");
				}
				System.out.println();
			}
		}
		System.out.println(heap[1]);
	}

}
