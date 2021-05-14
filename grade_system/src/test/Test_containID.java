package test;
/*****************************************************************************-
class Test_getName  
test case 1: ID 962001044
test case 2: ID 955002056  
test case 3: ID 800000001 
**************************************************************************** */
import static org.junit.Assert.*;

import org.junit.Test;

import SourceCodeFiles.GradeSystems;
import SourceCodeFiles.IDExceptions1;
import SourceCodeFiles.IDExceptions2;

public class Test_containID {

	GradeSystems aGradeSystem = new GradeSystems(); 
	@Test
	public void testCheckID1(){
		boolean b=aGradeSystem.containID("962001044");
		assertEquals (b, true);
	}
	
	@Test
	public void testCheckID2(){
		boolean b=aGradeSystem.containID("955002056");
		assertEquals (b, true);
	}
	
	@Test
	public void testCheckID3(){
		boolean b=aGradeSystem.containID("800000001");
		assertEquals (b, false);
	}
}
