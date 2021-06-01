package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import SourceCodeFiles.GradeSystems;

public class Test_showGrade {

	@Test
	public void Test_showGrade1() {
		/*�� setOut�]�wconsole output ��outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* ����showGrade returns�ϥΪ̿�J���r��*/
		GradeSystems aGradeSystems = new GradeSystems();
		boolean isShowGrade = aGradeSystems.showGrade("962001044");  
		assertEquals(true, isShowGrade);
		/*�w��showGrade�|���"��v�� 87 86 98 88 87\n" */
		assertEquals("��v�� 87 86 98 88 87\n", outContent.toString());
	}
	@Test
	public void Test_showGrade2() {

		/*�� setOut�]�wconsole output ��outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* ����showGrade returns�ϥΪ̿�J���r��*/
		GradeSystems aGradeSystems = new GradeSystems();
		boolean isShowGrade = aGradeSystems.showGrade("962001043");
		
		/*�w��showGrade���|��ܿ�X */
		assertEquals(false, isShowGrade);
		
	}
	
	

}
