package test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import SourceCodeFiles.UI;

public class Test_showWelcomeMsg {

	@Test
	public void Test_showWelcomeMsg1() {

		/*用 setOut設定console output 為outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* 執行howWelcomeMsg returns使用者輸入的字串*/
		UI aUI = new UI();
		boolean isshowWelcomeMsg = aUI.showWelcomeMsg("凌宗廷");  
		assertEquals(true, isshowWelcomeMsg);
		/*預期howWelcomeMsg會顯示"Welcome 凌宗廷" */
		assertEquals("Welcome 凌宗廷\n", outContent.toString());
		
		
		
	}

}
