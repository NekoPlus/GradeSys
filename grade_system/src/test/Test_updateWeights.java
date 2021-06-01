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
		
		ByteArrayInputStream inContent = new ByteArrayInputStream("1 1 1 1 1 Y".getBytes());
		System.setIn(inContent);

		/*�� setOut�]�wconsole output ��outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		
		
		
		
		
		GradeSystems aGradeSystems = new GradeSystems();
		boolean isupdateWeights = aGradeSystems.updateWeights();  
		
		//assertEquals("�t����ҦX�p�ݭn100%, ���ˬd", outContent.toString());
		
		/* 	1.	assert last INCONTENT equals ��Y��
			2.	assert last OUTCONTENT equals ���H�W���T��? Y (Yes) �� N (No)\r�� */

		assertEquals(true, isupdateWeights);

	}
	
	@Test
	public void Test_updateWeights2() throws IDExceptions1, IDExceptions2, IDExceptions3 {
		
		ByteArrayInputStream inContent;
		inContent = new ByteArrayInputStream("1 1 2 2 4 Y".getBytes());
		System.setIn(inContent);

		/*�� setOut�]�wconsole output ��outContent */
		ByteArrayOutputStream outContent;
		
		
		outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		
		
		GradeSystems aGradeSystems = new GradeSystems();
		boolean isupdateWeights = aGradeSystems.updateWeights();
		String temp = outContent.toString();
		
		String tteemm="";
		int i=0;
		for (String retval: temp.split("%")){
			if(i++==10) {
				tteemm=retval;
			}
			
        }
		
		assertEquals("�H�W���T��? Y(Yes) �� N(No)\n�ϥΪ̿�J�G", tteemm);
		//assertEquals("�H�W���T��? Y(Yes) �� N(No)\n�ϥΪ̿�J�G", outContent.toString());

		/* 	1.	assert last INCONTENT equals ��Y��
			2.	assert last OUTCONTENT equals ���H�W���T��? Y (Yes) �� N (No)\r�� */

		assertEquals(true, isupdateWeights);

	}
}
