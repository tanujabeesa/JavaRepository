package mypack;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvenNumberTest {
	EvenNumber EN;
	
	public EvenNumberTest(){
		EN= new EvenNumber();
	}

	@Test
	public void testCase1() {
		assertTrue(EN.isEven(90));
	}
	@Test
	public void testCase2() {
		assertFalse(EN.isEven(97));
	}
	@Test
	public void testCase3() {
		assertFalse(EN.isEven(-96));
	}
}
