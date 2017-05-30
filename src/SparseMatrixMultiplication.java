import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Node_matrix {
        int x,y;
        Node_matrix(int x, int y) {
            this.x=x;
            this.y=y;
        }
    }
public class SparseMatrixMultiplication{
    public static int[][] multiply(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];
        List<Node_matrix> listA = new ArrayList<>();
        List<Node_matrix> listB = new ArrayList<>();
        for (int i=0;i<A.length;i++) {
            for (int j=0; j<A[0].length; j++) {
                if (A[i][j]!=0) listA.add(new Node_matrix(i,j));
            }
        }
        for (int i=0;i<B.length;i++) {
            for (int j=0;j<B[0].length;j++) {
                if (B[i][j]!=0) listB.add(new Node_matrix(i,j));
            }
        }

        for (Node_matrix nodeA : listA) {
            for (Node_matrix nodeB: listB) {
                if (nodeA.y==nodeB.x) {
                    result[nodeA.x][nodeB.y] += A[nodeA.x][nodeA.y] * B[nodeB.x][nodeB.y];
                }
            }
        }

        return result;
        
    }
    
    public static void main(String[] args){
    	int[][] A = {{0,0,0,0},{5,8,0,0},{0,0,3,0},{0,6,0,0}};
    	System.out.println(A.length + " " +  A[1].length);
    	int[][] B = {{0,1,1,0},{0,0,2,0},{0,0,1,0},{0,3,0,0}};
    	int[][] result = multiply(A,B);
    	for(int i=0; i<4; i++){
    		for(int j=0; j<4; j++){
    			System.out.print(result[i][j] + " ");
    		}
    		System.out.println();
    	}
    	
    	
    }
}