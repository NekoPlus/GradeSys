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
		/*用 setIn 設定console input 為inContent，使用者輸入的字串Q */
		ByteArrayInputStream inContent = new ByteArrayInputStream("Q".getBytes());
		System.setIn(inContent);

		/*用 setOut設定console output 為outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* 執行promptID returns使用者輸入的字串*/
		UI aUI = new UI();
<<<<<<< HEAD
		String userInput = aUI.promptID();  
		/*預期promptID會顯示"輸入ID或 Q (結束使用)？" */
		assertEquals("輸入ID或 Q (結束使用)?", outContent.toString());
		/*預期user input 是 Q */ 
		assertEquals ("Q", userInput);
=======
		String userInput = aUI.promptID();
		
		/*預期promptID會顯示"輸入ID或 Q (結束使用)？" */
		assertEquals("輸入ID或 Q (結束使用)?", outContent.toString());
		/*預期user input 是 Q */ 
		assertEquals ("Q", userInput.toString());
		

>>>>>>> 449d1d834729c659344d7b580fb8336bcb68f73b

	}
	@Test
	public void testPromptID2() throws IDExceptions1, IDExceptions2, IDExceptions3 {
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
		assertEquals ("Q", userInput);

	}
}
