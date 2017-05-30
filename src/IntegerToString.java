//itoa()
//if number is negative
//if number is 0, return string with 0
//check the base -> 2,8,10 Negatives are handled with 10 base


public class IntegerToString {

	public String itoa(int num){
		StringBuilder result = new StringBuilder();
		int  i = 0;
		boolean isNegative = false;
		if(num == 0){
			result.append('0');
			return result.toString();
		}
		if(num<0){
			isNegative = true;
			num = -num;
		}
		
		while(num != 0){
			int remainder = num % 10;
		//	int c = (remainder>9) ? (remainder-10) + 'a' : remainder + '0';
			int c = remainder + '0';
			num = num/10;
			result.append((char)c);
		}
		
		if(isNegative)
			result.append("-");
			
		return result.reverse().toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerToString itos = new IntegerToString();
		String result = itos.itoa(36);
		System.out.println(result);
	}

}
