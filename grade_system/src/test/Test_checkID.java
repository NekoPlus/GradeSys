package test;
/*****************************************************************************-
class TestCheckID  
test case 1: ID 96z001044 (2打成z)
test case 2: ID 96200104 (遺漏最後的4)
test case 3: ID 962001044 (正確，凌宗廷的ID)
**************************************************************************** */

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import SourceCodeFiles.*;

import org.junit.Test;

public class Test_checkID {

	
	@Test (expected = IDExceptions1.class)
	public void testCheckID1() throws IDExceptions1, IDExceptions2, IDExceptions3{
		//aUI calls checkID(96z001044);
		ByteArrayInputStream in = new ByteArrayInputStream("Q".getBytes());
		System.setIn(in);
		UI c = new UI();
		boolean b=c.checkID("96z001044");
		assertEquals (b, false);
	}
	
	@Test (expected = IDExceptions2.class)
	public void testCheckID2() throws IDExceptions1, IDExceptions2, IDExceptions3{
		//aUI calls checkID(96200104);
		ByteArrayInputStream in = new ByteArrayInputStream("Q".getBytes());
		System.setIn(in);
		UI c = new UI();
		boolean b=c.checkID("96200104");
		assertEquals (b, false);
	}
	
	@Test
	public void testCheckID3() throws IDExceptions1, IDExceptions2, IDExceptions3{
		ByteArrayInputStream in = new ByteArrayInputStream("Q".getBytes());
		System.setIn(in);
		UI c = new UI();
		boolean b=c.checkID("962001044");
		assertEquals (b, true);
	}

}
