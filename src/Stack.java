
public class Stack {

	int num;
	int top;
	int[] arr;

	public Stack(int n){
		arr = new int[n];
		top = -1;
	}
	
	public void push(int num){
		top++;
		arr[top] = num;
	}
	
	public int pop(){
		int topEle = arr[top];
		top--;
		return topEle;
	}
	
	public int peek(){
		return arr[top];
	}
	
	public static void main(String[] args) {
		int[] input = {3,1,6,4,8,9};
		Stack s = new Stack(input.length);
		s.push(3);
		s.push(5);
		s.push(1);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
	}

}
