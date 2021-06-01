package test;
/****************************************************************************
class TestShowRank
aGradeSystem �ȧt��v�ʤΧ��§�

test case 1: assert ��v�� rank equals 2
test case 2: assert ���§� rank equals 1
***************************************************************************/

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import SourceCodeFiles.*;

import org.junit.Test;

public class Test_showRank {

	GradeSystems aGradeSystem = new GradeSystems(); 
	@Test
	public void Test_showRank1() { 
		 /*�� setOut�]�wconsole output ��outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* ����showRank returns�ϥΪ̿�J���r��*/
		boolean isshowRank = aGradeSystem.showRank("985002033");  
		assertEquals(true, isshowRank);
			
		assertEquals("�L�v޳�ƦW��16\n", outContent.toString());
	}
	
	@Test
	public void Test_showRank2() {

		/*�� setOut�]�wconsole output ��outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* ����showRank returns�ϥΪ̿�J���r��*/
		boolean isshowRank = aGradeSystem.showRank("962001044");  
		assertEquals(true, isshowRank);
		
		assertEquals("��v�ʱƦW��38\n", outContent.toString());
		
	}
}
