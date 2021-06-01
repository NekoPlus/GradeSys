package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import SourceCodeFiles.IDExceptions1;
import SourceCodeFiles.IDExceptions2;
import SourceCodeFiles.IDExceptions3;
import SourceCodeFiles.GradeSystems;

public class Test_updateWeights {
	
	
	@Test
	public void Test_updateWeights1() throws IDExceptions1, IDExceptions2, IDExceptions3 {
		
		ByteArrayInputStream inContent = new ByteArrayInputStream("10 10 10 40 30 Y".getBytes());
		System.setIn(inContent);

		/*�� setOut�]�wconsole output ��outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		
		
		GradeSystems aGradeSystems = new GradeSystems();
		boolean isupdateWeights = aGradeSystems.updateWeights();
		String[] outStringByLines = outContent.toString().split("\n");
        
        assertEquals("�H�W���T��? Y(Yes) �� N(No)", outStringByLines[outStringByLines.length-2]);

		/* 	assert last OUTCONTENT equals ���H�W���T��? Y (Yes) �� N (No)�� */

		assertEquals(true, isupdateWeights);

	}
	
}
