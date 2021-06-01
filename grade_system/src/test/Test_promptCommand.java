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
		/*用 setIn 設定console input 為inContent，使用者輸入的字串Q */
		ByteArrayInputStream inContent = new ByteArrayInputStream("G".getBytes());
		System.setIn(inContent);

		/*用 setOut設定console output 為outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* 執行promptCommand returns使用者輸入的字串*/
		UI aUI = new UI();
		String userInput = aUI.promptCommand();  
		/*預期promptCommand會顯示"輸入ID或 Q (結束使用)？" */
		assertEquals("輸入指令\n1) G 顯示成績 (Grade)\n2) R 顯示排名 (Rank)\n3) W 更新配分 (Weight)\n4) E 離開選單 (Exit)\n", outContent.toString());
		/*預期user input 是 Q */ 
		assertEquals ("G", userInput.toString());

	}

}
