package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import SourceCodeFiles.IDExceptions1;
import SourceCodeFiles.IDExceptions2;
import SourceCodeFiles.IDExceptions3;
import SourceCodeFiles.GradeSystems;

public class Test_updateWeights {
	
	
	@Test
	public void Test_updateWeights1() throws IDExceptions1, IDExceptions2, IDExceptions3 {
		
		ByteArrayInputStream inContent;
		inContent = new ByteArrayInputStream("1 1 1 1 1 Y".getBytes());
		System.setIn(inContent);

		/*用 setOut設定console output 為outContent */
		ByteArrayOutputStream outContent;
		
		
		outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		
		
		
		
		
		GradeSystems aGradeSystems = new GradeSystems();
		boolean isupdateWeights = aGradeSystems.updateWeights();  
		
		//assertEquals("配分比例合計需要100%, 請檢查", outContent.toString());
		
		/* 	1.	assert last INCONTENT equals “Y”
			2.	assert last OUTCONTENT equals “以上正確嗎? Y (Yes) 或 N (No)\r” */

		assertEquals(true, isupdateWeights);

	}
	
	@Test
	public void Test_updateWeights2() throws IDExceptions1, IDExceptions2, IDExceptions3 {
		
		ByteArrayInputStream inContent;
		inContent = new ByteArrayInputStream("1 1 2 2 4 Y".getBytes());
		System.setIn(inContent);

		/*用 setOut設定console output 為outContent */
		ByteArrayOutputStream outContent;
		
		
		outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		
		
		
		GradeSystems aGradeSystems = new GradeSystems();
		boolean isupdateWeights = aGradeSystems.updateWeights();  
		
		assertEquals("請確認舊配分\nlab1\t10%\nlab2\t10%\nlab3\t10%\nmid-term\t30%\nfianl exam\t40%\n輸入新配分\nlab1\tlab2\tlab3\tlab2\tmid-term\tfinal exam\t"
				+ "請確認新配分\nlab1\t10.0%\nlab2\t10.0%\nlab3\t20.0%\nmid-term\t20.0%\nfianl exam\t40.0%\n以上正確嗎? Y(Yes) 或 N(No)\n使用者輸入：", outContent.toString());
		//assertEquals("請確認新配分\nlab1\t1.0%\nlab2\t1.0%\nlab3\t1.0%\nmid-term\t1.0%\nfianl exam\t1.0%\n以上正確嗎? Y(Yes) 或 N(No)\n使用者輸入：", outContent.toString());

		/* 	1.	assert last INCONTENT equals “Y”
			2.	assert last OUTCONTENT equals “以上正確嗎? Y (Yes) 或 N (No)\r” */

		assertEquals(true, isupdateWeights);

	}
}
