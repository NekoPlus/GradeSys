package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import SourceCodeFiles.*;

public class Test_promptCommand {

	@Test
	public void testPrompCommand1() throws IDExceptions1, IDExceptions2, IDExceptions3 {
		/*�� setIn �]�wconsole input ��inContent�A�ϥΪ̿�J���r��Q */
		ByteArrayInputStream inContent = new ByteArrayInputStream("962001044".getBytes());
		System.setIn(inContent);

		/*�� setOut�]�wconsole output ��outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* ����promptID returns�ϥΪ̿�J���r��*/
		UI aUI = new UI();
		String userInput = aUI.promptID();  
		/*�w��promptID�|���"��JID�� Q (�����ϥ�)�H" */
		assertEquals("��J���O\n1) G ��ܦ��Z (Grade)\n2) R ��ܱƦW (Rank)\n3) W ��s�t�� (Weight)\n4) E ���}��� (Exit)", outContent);
		/*�w��user input �O Q */ 
		//assertEquals ("962001044", userInput);

	}

}
