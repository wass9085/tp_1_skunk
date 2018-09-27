import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DieTest {

	@Before
	public void setUp() throws Exception 
	{
		
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	@Test
	public void test_initialization_0f_predictableDie() 
	{
		int[] int_values = new int[] {3,2,1};
		Die die = new Die(int_values);
		die.roll();
		int value = die.getLastRoll();
		assertEquals("assert not equals 3",3,value);
	}

}
