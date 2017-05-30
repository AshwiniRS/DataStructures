import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = {1,3,5,7};
		int[] arr2 = {2,3,4,6,8};
		
		List<Integer> intList = new ArrayList<Integer>();
		for (int index = 0; index < arr1.length; index++)
		{
		    intList.add(arr1[index]);
		}
		
		List<Integer> intList1 = new ArrayList<Integer>();
		for (int index = 0; index < arr2.length; index++)
		{
		    intList1.add(arr2[index]);
		}
		
		intList.retainAll(intList1);
		System.out.println(intList.toString());
		
		
	}

}
