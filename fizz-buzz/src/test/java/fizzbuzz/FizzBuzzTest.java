package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

import fizzbuzz.FizzBuzz;

public class FizzBuzzTest {

	@Test
	public void fizzBuzzTwo() throws Exception {
		
		FizzBuzz fb = new FizzBuzz();
	
		String res = fb.returnFizzBuzz(2);
		
		String expected = "2";
		
		assertEquals(expected , res);
		
	}
	
	@Test
	public void fizzBuzzFizz() throws Exception {
		
		FizzBuzz fb = new FizzBuzz();
	
		String res = fb.returnFizzBuzz(3);
		
		String expected = "Fizz";
		
		assertEquals(expected , res);
		
	}
	
	@Test
	public void fizzBuzz3divisors() throws Exception {
		
		FizzBuzz fb = new FizzBuzz();
	
		String res = fb.returnFizzBuzz(6); // first tested with 3
		
		String expected = "Fizz";
		
		assertEquals(expected , res);
		
	}
	
	@Test
	public void fizzBuzz5divisors() throws Exception {
		
		FizzBuzz fb = new FizzBuzz();
	
		String res = fb.returnFizzBuzz(10); // first tested with 5
		
		String expected = "Buzz";
		
		assertEquals(expected , res);
		
	}
	
	@Test
	public void fizzBuzzBoth() throws Exception {
		
		FizzBuzz fb = new FizzBuzz();
	
		String res = fb.returnFizzBuzz(15); // first tested with 5
		
		String expected = "FizzBuzz";
		
		assertEquals(expected , res);
		
	}
	
	
	
	@Test
	public void doTheWholeThing() throws Exception {
		
		FizzBuzz fb = new FizzBuzz();
	
		String doTheWholeThing = fb.doTheWholeThing(15); // first tested with 5
		
		String expected = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz"
				+ " 11 Fizz 13 14 FizzBuzz ";
		
		assertEquals(expected , doTheWholeThing);
		
	}
	

}
