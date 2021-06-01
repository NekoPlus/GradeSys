package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import SourceCodeFiles.GradeSystems;

public class Test_showGrade {

	@Test
	public void test() {
		/*�� setIn �]�wconsole input ��inContent�A�ϥΪ̿�J���r��Q */
		ByteArrayInputStream inContent = new ByteArrayInputStream("962001044".getBytes());
		System.setIn(inContent);

		/*�� setOut�]�wconsole output ��outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* ����promptID returns�ϥΪ̿�J���r��*/
		GradeSystems aGradeSystems = new GradeSystems();
		boolean isShowGrade = aGradeSystems.showGrade(inContent.toString());  
		/*�w��promptID�|���"��JID�� Q (�����ϥ�)�H" */
		assertEquals(true, isShowGrade);
		//assertEquals("��v�� 87 86 98 88 87\n", outContent.toString());
	}

}
