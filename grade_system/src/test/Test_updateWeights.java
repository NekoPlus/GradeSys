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

		/*用 setOut設定console output 為outContent */
		ByteArrayOutputStream outContent;
		
		
		outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		
		
		inContent = new ByteArrayInputStream("1".getBytes());
		System.setIn(inContent);
		System.setIn(inContent);
		System.setIn(inContent);
		System.setIn(inContent);
		System.setIn(inContent);
		
		GradeSystems aGradeSystems = new GradeSystems();
		boolean isupdateWeights = aGradeSystems.updateWeights();  
		
		//assertEquals("配分比例合計需要100%, 請檢查", outContent.toString());
		
		/* 	1.	assert last INCONTENT equals “Y”
			2.	assert last OUTCONTENT equals “以上正確嗎? Y (Yes) 或 N (No)\r” */

		assertEquals(true, isupdateWeights);

	}

}
