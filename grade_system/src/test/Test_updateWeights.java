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
		
		ByteArrayInputStream inContent = new ByteArrayInputStream("1 1 1 1 1 Y".getBytes());
		System.setIn(inContent);

		/*用 setOut設定console output 為outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
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
		String temp = outContent.toString();
		
		String tteemm="";
		int i=0;
		for (String retval: temp.split("%")){
			if(i++==10) {
				tteemm=retval;
			}
			
        }
		
		assertEquals("以上正確嗎? Y(Yes) 或 N(No)\n使用者輸入：", tteemm);
		//assertEquals("以上正確嗎? Y(Yes) 或 N(No)\n使用者輸入：", outContent.toString());

		/* 	1.	assert last INCONTENT equals “Y”
			2.	assert last OUTCONTENT equals “以上正確嗎? Y (Yes) 或 N (No)\r” */

		assertEquals(true, isupdateWeights);

	}
}
