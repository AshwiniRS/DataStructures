import java.util.Arrays;

public class ReverseWordsInString {

	public void reverseWords(String str){
		String[] strArr = str.split(" ");
		for(int i=0,j=strArr.length-1; i<j;){
			String tmp =strArr[i];
			strArr[i] = strArr[j];
			strArr[j] = tmp;
			i++;
			j--;
		}
		StringBuilder builder = new StringBuilder();
		for(String s : strArr) {
		    builder.append(s);
		    builder.append(" ");
		}
		
		System.out.println(builder.toString());
	}
	public static void main(String[] args) {
		String str = "Vivek is stupid and mad idiot";
		ReverseWordsInString revObj = new ReverseWordsInString();
		revObj.reverseWords(str);
	}

}
