package test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import SourceCodeFiles.IDExceptions1;
import SourceCodeFiles.IDExceptions2;
import SourceCodeFiles.IDExceptions3;
import SourceCodeFiles.UI;

public class Test_showFinishMsg {

	@Test
	public void testPromptID1() throws IDExceptions1, IDExceptions2, IDExceptions3 {

		/*�� setOut�]�wconsole output ��outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* ����promptID returns�ϥΪ̿�J���r��*/
		UI aUI = new UI();
		aUI.showFinishMsg();
		/*�w��promptID�|���"��JID�� Q (�����ϥ�)�H" */
		assertEquals("�����F\n", outContent.toString());


	}

}
