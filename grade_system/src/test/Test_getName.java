package test;
/*****************************************************************************-
class Test_getName  
test case 1: ID 962001044
test case 2: ID 955002056  
test case 3: ID 962001051 
**************************************************************************** */
import static org.junit.Assert.*;

import org.junit.Test;

import SourceCodeFiles.IDExceptions1;
import SourceCodeFiles.IDExceptions2;

public class Test_getName {

	@Test
	public void testCheckID1(){
		String b=getName("962001044");
		assertEquals (b, "­â©v§Ê");
	}
	
	@Test
	public void testCheckID2(){
		String b=getName("955002056");
		assertEquals (b, "³\¤åÄÉ");
	}
	
	@Test
	public void testCheckID3(){
		String b=getName("962001051");
		assertEquals (b, "§õ«Â§Ê");
	}


}
