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
		ByteArrayInputStream inContent = new ByteArrayInputStream("G".getBytes());
		System.setIn(inContent);

		/*�� setOut�]�wconsole output ��outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* ����promptCommand returns�ϥΪ̿�J���r��*/
		UI aUI = new UI();
		String userInput = aUI.promptCommand();  
		/*�w��promptCommand�|���"��JID�� Q (�����ϥ�)�H" */
		assertEquals("��J���O\n1) G ��ܦ��Z (Grade)\n2) R ��ܱƦW (Rank)\n3) W ��s�t�� (Weight)\n4) E ���}��� (Exit)\n", outContent.toString());
		/*�w��user input �O Q */ 
		assertEquals ("G", userInput.toString());

	}

}
