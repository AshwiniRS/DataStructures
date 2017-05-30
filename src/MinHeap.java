
public class MinHeap {
	
	private int[] heapArr;
	private int maxSize;
	private int heapSize;
	
	public MinHeap(int size){
		this.maxSize = size;
		this.heapSize = 0;
		this.heapArr = new int[maxSize];
	}
	
	public void insert(int[] numArr){
		for(int i=0; i<numArr.length; i++){
			if(heapSize +1 == maxSize)
				break;
			heapArr[++heapSize] = numArr[i];
			int pos = heapSize;
			while(pos!=1 && numArr[i] > heapArr[pos/2]){
				heapArr[pos] = heapArr[pos/2];
				pos=pos/2;
			}
			heapArr[pos]=numArr[i];
		}
	}
	
	public void display(){
		for(int i : heapArr){
			System.out.println(i + " ");
		}
	}
	
	public int parent(int pos){
		return pos/2;
	}
	
	public int leftChild(int pos){
		return 2*pos;
	}
	
	public int rightChild(int pos){
		return 2*pos + 1;
	}
	
	
	public int remove(){
		int removedEle = 0;
		removedEle = heapArr[1];
		heapArr[1] = heapArr[heapSize--];
		//heapify(1);
		return removedEle;	
	}
	public static void main(String[] args) {
		int[] numArr = {3,1,5,2,4,6,7};
		MinHeap minHeap = new MinHeap(numArr.length);
		minHeap.insert(numArr);
		minHeap.display();	
	}
}
