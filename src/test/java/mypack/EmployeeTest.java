package mypack;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	Employee E ;
	Object arr[];
	
	public EmployeeTest()
	{
		E = new Employee();
		arr = new Object[5];
	}
	
	
	@Before
	public void init()
	{
		arr[0] = new Employee(101,"Pooja 1");
		arr[1] = new Employee(102,"Pooja 2");
		arr[2] = new Employee(103,"Pooja 3");
		arr[3] = new Employee(104,"Pooja 14");
		arr[4] = new Employee(105,"Pooja 15");
		System.out.println("Call before the test case ....");
		
	}
	
		
	@Test 
	public void testCase1() 
	{
		
		Object ep[] = E.getRecords().toArray();
		assertArrayEquals(arr,ep);  // (requiredoutput , output))
		System.out.println("Running the test case");		
		
	}

	
	@After
	public void complete()
	{
		System.out.println("Testing is completed....");
	}
	
}

