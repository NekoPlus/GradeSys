package test;
/****************************************************************************
class TestShowRank
aGradeSystem 僅含凌宗廷及李威廷

test case 1: assert 凌宗廷 rank equals 2
test case 2: assert 李威廷 rank equals 1
***************************************************************************/

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import SourceCodeFiles.*;

import org.junit.Test;

public class Test_showRank {

	GradeSystems aGradeSystem = new GradeSystems(); 
	@Test
	public void Test_showRank1() { 
		 /*用 setOut設定console output 為outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* 執行showRank returns使用者輸入的字串*/
		boolean isshowRank = aGradeSystem.showRank("985002033");  
		assertEquals(true, isshowRank);
			
		assertEquals("林宗瑋排名第16\n", outContent.toString());
	}
	
	@Test
	public void Test_showRank2() {

		/*用 setOut設定console output 為outContent */
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut (new PrintStream (outContent));

		/* 執行showRank returns使用者輸入的字串*/
		boolean isshowRank = aGradeSystem.showRank("962001044");  
		assertEquals(true, isshowRank);
		
		assertEquals("凌宗廷排名第38\n", outContent.toString());
		
	}
}
