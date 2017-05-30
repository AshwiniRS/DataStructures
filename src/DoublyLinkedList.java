
public class DoublyLinkedList {
	NodeLL headNode = null;
	
	public void addNode(int x){
		NodeLL newNode = new NodeLL(x);
		if(headNode == null){
			headNode = newNode;
		}else{
			NodeLL curr = headNode;
			while(curr.next != null){
				curr = curr.next;
			}
			curr.next = newNode;
			newNode.prev = curr;
		}
	}
	
	public void display(NodeLL headNode){
		NodeLL curr = headNode;
		while(curr!=null){
			System.out.print(curr.data + " ");
			curr=curr.next;
		}
	}
	
	public void deleteNode(int x){
		NodeLL curr = headNode;
		
		if(curr.data == headNode.data){
			if(curr.next != null){
				curr.next.prev = null;
				headNode = curr.next;
			}
		}
		while(curr!=null){
			if(curr.data == x){
				if(curr.prev != null){
					curr.prev.next = curr.next;
				}
				if(curr.next != null){
					curr.next.prev = curr.prev;
				}
			}
			curr=curr.next;
		}
	}
	
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.addNode(3);
		dll.addNode(6);
		dll.addNode(1);
		//dll.display(dll.headNode);
		dll.deleteNode(3);
		dll.display(dll.headNode);
	}

}
class NodeLL{
	int data;
	NodeLL prev;
	NodeLL next;
	
	public NodeLL(int x){
		this.data = x;
		this.prev = null;
		this.next = null;
	}
}