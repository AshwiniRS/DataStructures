import java.util.Arrays;

public class MinimumStack {
	static Stack stack;
	static Stack minStack;
	
	public MinimumStack(int n){
		stack = new Stack(n);
		minStack = new Stack(n);
	}
	
	public void insertNums(int[] input){
		for(int i:input){
			stack.push(i);
			if(minStack.top == -1 || minStack.peek()>i)
				minStack.push(i);
		}
	}
	public int findMin(int[] input, Stack stack, Stack minStack){
		return minStack.peek();
	}
	
	public void pop(){
		int r = stack.pop();
		if(minStack.peek() == r)
			minStack.pop();
	}
	public static void main(String[] args) {
		int[] input = {3,4,9,2,7,6,5,8};
		MinimumStack ms = new MinimumStack(input.length);
		ms.insertNums(input);
		System.out.println(ms.findMin(input,stack,minStack));
		ms.pop();
		System.out.println("Stack :"+Arrays.toString(stack.arr));
		System.out.println("MinStack :"+Arrays.toString(minStack.arr));
	}

}
