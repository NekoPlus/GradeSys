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
		inContent = new ByteArrayInputStream("1 1 1 1 1 Y".getBytes());
		System.setIn(inContent);

		/*�� setOut�]�wconsole output ��outContent */
		ByteArrayOutputStream outContent;
		
		
		outContent = new ByteArrayOutputStream();
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
		
		assertEquals("�нT�{�°t��\nlab1\t10%\nlab2\t10%\nlab3\t10%\nmid-term\t30%\nfianl exam\t40%\n��J�s�t��\nlab1\tlab2\tlab3\tlab2\tmid-term\tfinal exam\t"
				+ "�нT�{�s�t��\nlab1\t10.0%\nlab2\t10.0%\nlab3\t20.0%\nmid-term\t20.0%\nfianl exam\t40.0%\n�H�W���T��? Y(Yes) �� N(No)\n�ϥΪ̿�J�G", outContent.toString());
		//assertEquals("�нT�{�s�t��\nlab1\t1.0%\nlab2\t1.0%\nlab3\t1.0%\nmid-term\t1.0%\nfianl exam\t1.0%\n�H�W���T��? Y(Yes) �� N(No)\n�ϥΪ̿�J�G", outContent.toString());

		/* 	1.	assert last INCONTENT equals ��Y��
			2.	assert last OUTCONTENT equals ���H�W���T��? Y (Yes) �� N (No)\r�� */

		assertEquals(true, isupdateWeights);

	}
}
