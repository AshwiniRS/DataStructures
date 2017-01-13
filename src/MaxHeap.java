

public class MaxHeap {
	static int position = 1;
	static int[] heap=null;

	MaxHeap(int n){
		heap = new int[n+1];
	}
	public int[] buildHeap(int[] arr,int low,int high){
		for(int i=low;i<=high;i++){
			insert(arr[i]);
		}
		return heap;
	}
	public void insert(int x){
		insert(x,heap);
	}
	public void insert(int x, int[] heap){
		if(position == 1){
			heap[position] = x;
			position++;
		}else{
			heap[position] = x;
			heapify();
			position++;
		}
	}
	
	public int[] heapify(){
		return heapify(heap,position);
	}
	public int[] heapify(int[] heap, int position){
		int tempPos = position;
		while(tempPos>0 && heap[tempPos/2] < heap[tempPos]){
			int temp = heap[tempPos];
			heap[tempPos] = heap[tempPos/2];
			heap[tempPos/2] = temp;
			tempPos=tempPos/2;
		}
		return heap;
	}
	
	public static int[] sinkUp(int pos){

		int temp = pos;
		if((2*pos)<position && heap[temp]<heap[2*pos]){
			temp = 2*pos;
		}
		if((2*pos+1)<position && heap[temp]<heap[2*pos+1]){
			temp = 2*pos+1;	
		}
		if(temp != pos){
			int r = heap[pos];
			heap[pos] = heap[temp];
			heap[temp] = r;
			sinkUp(temp);
		}
		return heap;
	}
	
	public static int[] extractMin(){
		return extractMin(heap,position);
	}
	public static int[] extractMin(int[] heap,int position){
		int k = heap[1];
		heap[1] = heap[position-2];
		heap[position-1]=0;
		position--;
		heap = sinkUp(1);
		return heap;
	}
	
	public static void printHeap(){
		for(int i=1;i<heap.length;i++){
			System.out.print(heap[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		int[] arr = {3,2,1,7,8,4,10,16,12};
		MaxHeap maxHeap = new MaxHeap(arr.length);
		int low = 0;
		int high = arr.length;
		maxHeap.buildHeap(arr,low,high);
		for(int i=1;i<heap.length;i++){
			System.out.print(heap[i]+" ");
		}
		//int k = extractMin();
	//	System.out.println("Max element : "+k);
		for(int i=1;i<heap.length;i++){
			System.out.print(heap[i]+" ");
		}
		//k = extractMin();
		//System.out.println("Max element : "+k);
		//System.out.println(k+"\n");
		for(int i=1;i<heap.length;i++){
			System.out.print(heap[i]+" ");
		}
	}
}
