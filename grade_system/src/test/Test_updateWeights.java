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
		
		ByteArrayInputStream inContent;

		/*�� setOut�]�wconsole output ��outContent */
		ByteArrayOutputStream outContent;
		
		
		outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		
		
		inContent = new ByteArrayInputStream("1".getBytes());
		System.setIn(inContent);
		System.setIn(inContent);
		System.setIn(inContent);
		System.setIn(inContent);
		System.setIn(inContent);
		
		GradeSystems aGradeSystems = new GradeSystems();
		boolean isupdateWeights = aGradeSystems.updateWeights();  
		
		//assertEquals("�t����ҦX�p�ݭn100%, ���ˬd", outContent.toString());
		
		/* 	1.	assert last INCONTENT equals ��Y��
			2.	assert last OUTCONTENT equals ���H�W���T��? Y (Yes) �� N (No)\r�� */

		assertEquals(true, isupdateWeights);

	}

}
