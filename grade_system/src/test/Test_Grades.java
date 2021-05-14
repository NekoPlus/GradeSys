package test;

import static org.junit.Assert.*;

import org.junit.Test;

import SourceCodeFiles.Grades;

public class Test_Grades {

	Grades aGrade= new Grades("­â©v§Ê", 1, 2, 3, 4, 5);
	@Test
	public void test() {
		assertNotNull(aGrade);
	}

}
