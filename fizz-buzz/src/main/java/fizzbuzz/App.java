package fizzbuzz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	FizzBuzz fzbz = new FizzBuzz();
    	
    	for (int i=1; i<=50; i++) {
    		
    	System.out.println(fzbz.returnFizzBuzz(i));
    	
    	}
    	
//    	FizzBuzz fb = new FizzBuzz();
//    	
//    	System.out.println(fb.doTheWholeThing(15));
    }
}
