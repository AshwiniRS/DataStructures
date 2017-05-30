
public class LinkedList {
	private static Node_ll head1 = null;
	private static Node_ll head2 = null;
	
//	public Node_ll mergeLists(Node_ll head1, Node_ll head2){
//		if(head1 == null) return head2;
//		if(head2 == null) return head1;
//		if(head1.data < head2.data){
//			head1.next = mergeLists(head1.next, head2);
//			return head1;
//		}else{
//			head2.next = mergeLists(head2.next, head1);
//			return head2;
//		}
//		
//	}
//	
	
	public Node_ll insert(Node_ll head,int num){
		Node_ll newNode = new Node_ll(num);
		if(head == null){
			head = newNode;
		}else{
			Node_ll tmp = head;
			while(tmp.next!=null){
				tmp=tmp.next;
			}
			tmp.next = newNode;
		}
		return head;
	}
	
	public Node_ll reverse(Node_ll head){
		if(head==null)
			return null;
		if(head.next==null)
			return head;
		Node_ll temp = null;
		Node_ll temp1 = head;
		Node_ll temp2 = null;
		while(temp1!=null){
			temp2 = temp1.next;
			temp1.next=temp;
			temp=temp1;
			temp1=temp2;
		}
		head=temp;
		return head;
	}
	public static void main(String[] args) {
		int[] firstArr = {2,4,6,8};
		int[] secArr = {1,3,5,7,9};
		LinkedList ll = new LinkedList();
		for(int i : firstArr)
			head1=ll.insert(head1,i);
		for(int i : secArr)
			head2=ll.insert(head2,i);
		//Node_ll node1 = ll.mergeLists(head1,head2);
		Node_ll node2 = ll.reverse(head1);
//		while(node1!=null){
//			System.out.print(node1.data + " ");
//			node1=node1.next;
//		}
		while(node2!=null){
			System.out.print(node2.data + " ");
			node2=node2.next;
		}
	}
}

class Node_ll{
	int data;
	Node_ll next;
	
	Node_ll(int num){
		this.data = num;
		this.next = null;
	}
}
