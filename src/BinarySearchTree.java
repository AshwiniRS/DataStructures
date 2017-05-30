
public class BinarySearchTree {
	public static Node root;
	static BinarySearchTree bst = new BinarySearchTree();
	public BinarySearchTree() {
		root = null;
	}
	public void constructTree(int[] nums,int x){
		for(int i:nums){
			bst.insert(i);
		}
	}
	
	
	public boolean search(int num){
		Node current = root;
		while(current!=null){
			if(current.num == num){
				return true;
			}else if(current.num>num){
				current=current.left;
			}else
				current=current.right;
		}
		return false;
	}
	public boolean delete(int num){
		Node current = root;
		Node parent = root;
		boolean isleft = false;
		while(current.num!=num){
			parent = current;
			if(current.num > num){
				isleft=true;
				current = current.left;
			}else{
				isleft=false;
				current = current.right;
			}
			if(current == null)
				return false;
		}
		
		if(current.left == null && current.right == null){
			if(current == root){
				root = null;
			}else if(isleft){
				parent.left=null;
			}else
				parent.right=null;
		}
		
		else if(current.right == null){
			if(current == root){
				root = current.left;
			}else if(isleft){
				parent.left = current.left;
			}else
				parent.right = current.right;
		}
		
		else if(current.left == null){
			if(current == root){
				root = current.right;
			}else if(isleft){
				parent.left = current.right;
			}else{
				parent.right = current.right;
			}
		}
		
		else if(current.left != null && current.right != null){
			Node minEle = getMinEle(current);
			if(current == root)
				root= minEle;
			else if(isleft){
				parent.left = minEle;
			}else
				parent.right = minEle;
			
			minEle.left = current.left;
		}
		return true;
	}
	
	public Node getMinEle(Node delnode){
		Node successor = null;
		Node successorPar = null;
		Node current = delnode.right;
		
		while(current!=null){
			successorPar = successor;
			successor = current;
			current = current.left;
		}
		
		if(successor != delnode.right){
			successorPar.left = successor.right;
			successor.right = current.right;
		}
		return successor;
	}
	public void insert(int num){
		if(root==null){
			root = new Node(num);
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(num<current.num){
				current = current.left;
				if(current == null){
					parent.left = new Node(num);
					return;
				}
			}else{
				current = current.right;
				if(current == null){
					parent.right = new Node(num);
					return;
				}
			}
		}
	}

	//preorder = root left right; inorder = left root right; postorder = left right root
	
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.println(" " + root.num);
			display(root.right);
		}
	}
	
	public int getSum(Node root){
		Node temp = root;
		int sum = 0;
		sum = temp.num + (temp.right!=null ? getSum(temp.right) : 0) + (temp.left!=null ? getSum(temp.left) : 0);
		return sum;
	}
	public static void main(String[] args) {
		int[] nums = {3,1,6,4,8,5};
		int x = 9;
		bst.constructTree(nums,x);
		
		int sum =bst.getSum(root);
		System.out.println(sum);
	//	bst.display(root);
		bst.delete(6);
		bst.display(root);
		System.out.println(bst.search(10));
	}

}
class Node{
	int num;
	Node left;
	Node right;
	
	public Node(int x){
		this.num=x;
		this.left=null;
		this.right=null;
	}
}
