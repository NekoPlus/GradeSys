package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import SourceCodeFiles.GradeSystems;

public class Test_showGrade {

	@Test
	public void Test_showGrade1() {
		/*用 setOut設定console output 為outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* 執行showGrade returns使用者輸入的字串*/
		GradeSystems aGradeSystems = new GradeSystems();
		boolean isShowGrade = aGradeSystems.showGrade("962001044");  
		assertEquals(true, isShowGrade);
		/*預期showGrade會顯示"凌宗廷 87 86 98 88 87\n" */
		assertEquals("凌宗廷 87 86 98 88 87\n", outContent.toString());
	}
	@Test
	public void Test_showGrade2() {

		/*用 setOut設定console output 為outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* 執行showGrade returns使用者輸入的字串*/
		GradeSystems aGradeSystems = new GradeSystems();
		boolean isShowGrade = aGradeSystems.showGrade("962001043");
		
		/*預期showGrade不會顯示輸出 */
		assertEquals(false, isShowGrade);
		
	}
	
	

}
