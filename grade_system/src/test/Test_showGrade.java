package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import SourceCodeFiles.GradeSystems;

public class Test_showGrade {

	@Test
	public void test() {
		/*用 setIn 設定console input 為inContent，使用者輸入的字串Q */
		ByteArrayInputStream inContent = new ByteArrayInputStream("962001044".getBytes());
		System.setIn(inContent);

		/*用 setOut設定console output 為outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* 執行promptID returns使用者輸入的字串*/
		GradeSystems aGradeSystems = new GradeSystems();
		boolean isShowGrade = aGradeSystems.showGrade(inContent.toString());  
		/*預期promptID會顯示"輸入ID或 Q (結束使用)？" */
		assertEquals(true, isShowGrade);
		//assertEquals("凌宗廷 87 86 98 88 87\n", outContent.toString());
	}

}
