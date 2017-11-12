package fizzbuzz;

import java.util.Formatter;

public class FizzBuzz {
	
	
	public String returnFizzBuzz(int i) throws Exception{
		
		
		String returnString = "";

		if (shouldFizz(i)){
			returnString += "Fizz";
		}
		
		if (shouldBuzz(i)){
			returnString += "Buzz";
		}
		
		if (returnString.equals("") || returnString.equals(null)){
			return Integer.toString(i);
		}
		
		
		return returnString;
	}
	
	

	private boolean shouldBuzz(int i) {
		return i%5 == 0;
	}

	private boolean shouldFizz(int i) {
			
			return i%3 == 0;
	}
	

	public String doTheWholeThing(int upLimit) throws Exception {

		String s = "";
		
		
		for (int i=1; i<= upLimit; ++i){
			s += returnFizzBuzz(i) +" ";
				
				System.out.println(s);
		}
		
		
		return s;		
	}
	

}
