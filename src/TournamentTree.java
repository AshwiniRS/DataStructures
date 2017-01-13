import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.NodeList;

//not working
public class TournamentTree {

	static List<Node> nodeList = new ArrayList<Node>();
	int secondMin=Integer.MAX_VALUE;
	public Node createNode(int data){
		Node n = new Node();
		n.data=data;
		n.right=null;
		n.left=null;
		return n;
	}
	
	public void findSecondMin(int[] arr){
		int n = arr.length;
		Node root = null;
		for(int i=0;i<n;i+=2){
			Node n1 = createNode(arr[i]);
			Node n2 = null;
			if(i+1<n){
				n2 = createNode(arr[i+1]);
				root = n1.data<n2.data ? createNode(arr[i]) : createNode(arr[i+1]);
				root.left = n1;
				root.right = n2;
				nodeList.add(root);
			}else{
				nodeList.add(n1);
			}
		}
		
		int lsize = nodeList.size();
		System.out.println("Initially lsize :" +lsize);
		int init = 0;
		while(lsize >= 1){
			int temp = nodeList.size();
			for(int i=init;i<nodeList.size();i+=2){
				if(i+1<lsize){
				Node t1 = nodeList.get(i);
				Node t2 = nodeList.get(i+1);
				root = t1.data<t2.data?createNode(t1.data):createNode(t2.data);
				root.left = t1;
				root.right = t2;
				nodeList.add(root);
				
				}else{
					nodeList.add(nodeList.get(i));
				}
			}
			init = temp;
			System.out.println("Init : "+init);
			lsize = lsize/2;
			System.out.println("lsize :" +lsize);
			
			
		}
		for(Node n1 : nodeList){
			System.out.println(n1.data);
		}
		int secondMin = traverseTree(root,arr);
		System.out.println("SecondMin : "+ secondMin);
	}
	
	public int traverseTree(Node root,int[] arr){
		
		if(root == null  || ((root.left == null) && (root.right == null)) )
			return secondMin;
		if(root.left.data != root.data && secondMin > root.left.data){
			secondMin = root.left.data;
			return traverseTree(root.right, arr);
		}
		else if(root.right.data != root.data && secondMin > root.right.data){
			secondMin = root.right.data;
			return traverseTree(root.left, arr);
		}
		return secondMin;
	}
	public static void main(String[] args){
		int[] arr = {3, 6, 100, 9, 10, 12, 7, -1, 10};
		TournamentTree tt = new TournamentTree();
		tt.findSecondMin(arr);
		System.out.println(nodeList.get(nodeList.size()-1).data);
		System.out.println(nodeList.get(nodeList.size()-2).data);
		System.out.println(nodeList.get(nodeList.size()-3).data);
		System.out.println(nodeList.get(nodeList.size()-4).data);
		System.out.println(nodeList.get(nodeList.size()-5).data);
	}

	class Node{
		int data;
		Node right;
		Node left;
	}
}
