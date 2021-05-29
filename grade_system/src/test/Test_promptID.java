package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import SourceCodeFiles.IDExceptions1;
import SourceCodeFiles.IDExceptions2;
import SourceCodeFiles.IDExceptions3;
import SourceCodeFiles.UI;

public class Test_promptID {

	@Test
	public void test() throws IDExceptions1, IDExceptions2, IDExceptions3 {
		/*用 setIn 設定console input 為inContent，使用者輸入的字串Q */
		ByteArrayInputStream inContent = new ByteArrayInputStream("Q".getBytes());
		System.setIn(inContent);

		/*用 setOut設定console output 為outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* 執行promptID returns使用者輸入的字串*/
		UI aUI = new UI();
		String userInput = aUI.promptID();
		
		/*預期promptID會顯示"輸入ID或 Q (結束使用)？" */
		assertEquals("輸入ID或 Q (結束使用)?", outContent.toString());
		/*預期user input 是 Q */ 
		assertEquals ("Q", userInput.toString());
		


	}

}
