
public class ThreeClosetItems {

	public static void findthreeClosest(int[] a,int[] b,int[] c){
		int i=0,j=0,k=0,res_i=0,res_j=0,res_k=0;
		int p=a.length;
		int q=b.length;
		int r=c.length;
		int min,max;
		int diff = Integer.MAX_VALUE;
		while(i<p && j<q && k<r){
			min = Math.min(a[i], Math.min(b[j], c[k]));
			max = Math.max(a[i], Math.max(b[j], c[k]));
			
			if(diff>(max-min)){
				res_i=i;res_j=j;res_k=k;
				diff = max-min;
			}
			if(a[i]==min) i++;
			else if(b[j]==min) j++;
			else k++;
		}
		System.out.println(a[res_i] + " " + b[res_j]+ " "+c[res_k]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,10};
		int[] b = {2,15,20};
		int[] c = {10,12};
		findthreeClosest(a,b,c);
	}

}
