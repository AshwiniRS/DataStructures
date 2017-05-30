
public class CoinFlipAndDiceRoll {

	public int coinFlip(){
		int cointInt = (int) ( Math.random() * 2 + 1); //will generate a random number between 1 and 2
		return cointInt;
	}
	
	public void getRollDiceNumber(){
		while(true){
			//if 2 -> 1 or 1-> 0
			int hundreds = coinFlip()-1;
			int tens = coinFlip()-1;
			int units = coinFlip()-1;

			int sum = 4*hundreds + 2*tens + 1*units;

			if(sum<=6){
				System.out.println("Number on roll dice : "+sum);
				break;
			}
		}
	}
	public static void main(String[] args) {
		CoinFlipAndDiceRoll cp = new CoinFlipAndDiceRoll();
		cp.getRollDiceNumber();
	}

}
