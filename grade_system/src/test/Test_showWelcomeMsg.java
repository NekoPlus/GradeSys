package test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import SourceCodeFiles.UI;

public class Test_showWelcomeMsg {

	@Test
	public void Test_showWelcomeMsg1() {

		/*�� setOut�]�wconsole output ��outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* ����howWelcomeMsg returns�ϥΪ̿�J���r��*/
		UI aUI = new UI();
		boolean isshowWelcomeMsg = aUI.showWelcomeMsg("��v��");  
		assertEquals(true, isshowWelcomeMsg);
		/*�w��howWelcomeMsg�|���"Welcome ��v��" */
		assertEquals("Welcome ��v��\n", outContent.toString());
		
		
		
	}

}
