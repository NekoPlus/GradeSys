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

		/*用 setOut設定console output 為outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* 執行promptID returns使用者輸入的字串*/
		UI aUI = new UI();
		aUI.showFinishMsg();
		/*預期promptID會顯示"輸入ID或 Q (結束使用)？" */
		assertEquals("結束了\n", outContent.toString());


	}

}
