package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import SourceCodeFiles.*;


public class Test_promptID {
	
	@Test
<<<<<<< HEAD
	public void testPromptID1() throws IDExceptions1, IDExceptions2, IDExceptions3 {
=======
	public void test() throws IDExceptions1, IDExceptions2, IDExceptions3 {
>>>>>>> 449d1d834729c659344d7b580fb8336bcb68f73b
		/*�� setIn �]�wconsole input ��inContent�A�ϥΪ̿�J���r��Q */
		ByteArrayInputStream inContent = new ByteArrayInputStream("Q".getBytes());
		System.setIn(inContent);

		/*�� setOut�]�wconsole output ��outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* ����promptID returns�ϥΪ̿�J���r��*/
		UI aUI = new UI();
<<<<<<< HEAD
		String userInput = aUI.promptID();  
		/*�w��promptID�|���"��JID�� Q (�����ϥ�)�H" */
		assertEquals("��JID�� Q (�����ϥ�)?", outContent.toString());
		/*�w��user input �O Q */ 
		assertEquals ("Q", userInput);
=======
		String userInput = aUI.promptID();
		
		/*�w��promptID�|���"��JID�� Q (�����ϥ�)�H" */
		assertEquals("��JID�� Q (�����ϥ�)?", outContent.toString());
		/*�w��user input �O Q */ 
		assertEquals ("Q", userInput.toString());
		

>>>>>>> 449d1d834729c659344d7b580fb8336bcb68f73b

	}
	@Test
	public void testPromptID2() throws IDExceptions1, IDExceptions2, IDExceptions3 {
		/*�� setIn �]�wconsole input ��inContent�A�ϥΪ̿�J���r��Q */
		ByteArrayInputStream inContent = new ByteArrayInputStream("Q".getBytes());
		System.setIn(inContent);

		/*�� setOut�]�wconsole output ��outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* ����promptID returns�ϥΪ̿�J���r��*/
		UI aUI = new UI();
		String userInput = aUI.promptID();  
		/*�w��promptID�|���"��JID�� Q (�����ϥ�)�H" */
		assertEquals("��JID�� Q (�����ϥ�)?", outContent.toString());
		/*�w��user input �O Q */ 
		assertEquals ("Q", userInput);

	}
}
