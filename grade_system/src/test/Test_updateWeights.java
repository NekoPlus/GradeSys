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
		
		ByteArrayInputStream inContent = new ByteArrayInputStream("10 10 10 40 30 Y".getBytes());
		System.setIn(inContent);

		/*用 setOut設定console output 為outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));
		
		
		GradeSystems aGradeSystems = new GradeSystems();
		boolean isupdateWeights = aGradeSystems.updateWeights();
		String[] outStringByLines = outContent.toString().split("\n");
        
        assertEquals("以上正確嗎? Y(Yes) 或 N(No)", outStringByLines[outStringByLines.length-2]);

		/* 	assert last OUTCONTENT equals “以上正確嗎? Y (Yes) 或 N (No)” */

		assertEquals(true, isupdateWeights);

	}
	
}
