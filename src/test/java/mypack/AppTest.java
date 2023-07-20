package mypack;


import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AppTest 
{
   @Test
   public void testCase1(){
	   //return value,function
	   assertEquals(true,App.isEqual(9, 9));
	   
   }
   @Test
   public void testCase2(){
	   //return value,function
	   assertEquals(true,App.isEqual(-3,-3));
	   
   }
   @Test
   public void testCase3(){
	   //return value(required value),function(result value)
	   assertEquals(false,App.isEqual(9,10));
	   
   }
   @Test
   public void testCase4(){
	   //return value,function
	   assertEquals(false,App.isEqual(3,4));
	   
   }
}
