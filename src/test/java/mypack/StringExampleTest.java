package mypack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
//import  org.hamcrest.core.Is.*;

import org.junit.Test;

public class StringExampleTest {

	StringExample ob;
	
	public StringExampleTest()
	{
		ob= new StringExample();
	}
	
	
	@Test
	public void testCase1() 
	{
		//assertThat(result value,expected value) works on the patterns
		assertThat(ob.greet("Jack"),is("Good Morning !Jack"));
			
	}
	
	
	@Test
	public void testCase2() 
	{
		//assertThat(result value,expected value) works on the patterns
		assertThat(ob.greet("Mohan"),is("Good Morning !Mohan"));
			
	}
	
	@Test
	public void testCase3() 
	{
		//assertThat(result value,expected value) works on the patterns
		assertThat(ob.greet("     William       James    "),is("Good Morning !William James"));
			
	}
	
	@Test
	public void testCase4() 
	{
		//assertThat(result value,expected value) works on the patterns
		assertThat(ob.greet("  Pooja  "),is("Good Morning !Pooja"));
			
	}

}
