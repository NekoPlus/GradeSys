package test;
/****************************************************************************
class TestShowRank
aGradeSystem �ȧt��v�ʤΧ��§�

test case 1: assert ��v�� rank equals 2
test case 2: assert ���§� rank equals 1
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
		 assertEquals (true, aGradeSystem.showRank("962001044"));
	}
	@Test
	public void Test_showRank2() {
		 ByteArrayOutputStream stream = new ByteArrayOutputStream();
		 PrintStream printstream= new PrintStream(stream);
		 System.setOut(printstream);
		 assertEquals("2",stream.toString());

	}
}
