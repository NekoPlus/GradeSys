package test;
/*****************************************************************************-
class TestCalculateTotalGrade
aGrade: name李威廷 lab1 81  lab2 98  lab3 84  midtermExam 90 finalExam 93

test case 1: lab1 0.1  lab2 0.1  lab3 0.1  midtermExam 0.3  finalExam 0.4
test case 2: lab1 0.2  lab2 0.2  lab3 0.2  midTermExam 0.2  finalExam 0.2
test case 3: lab1 0.1  lab2 0.1  lab3 0.0  midtermExam 0.4  finalExam 0.4
**************************************************************************** */

import static org.junit.Assert.*;
import org.junit.Test;
import SourceCodeFiles.*;

public class Test_calculateTotalGrade {

	private GradeSystems aGradeSystem;
	float[] testWeights1 = {0.1f, 0.1f, 0.1f, 0.3f, 0.4f};
	float[] testWeights2 = {0.2f, 0.2f, 0.2f, 0.2f, 0.2f};
	float[] testWeights3 = {0.1f, 0.1f, 0.0f, 0.4f, 0.4f};
	
	Grades aGrade = aGradeSystem.aTree.get("962001051");
	@Test
	public void TestCalculateTotalGrade1() {
		assertEquals (91, aGrade.calculateTotalGrade(testWeights1));
	}
	@Test
	public void TestCalculateTotalGrade2() {
		assertEquals (89, aGrade.calculateTotalGrade(testWeights2));
	}
	@Test
	public void TestCalculateTotalGrade3() {
		assertEquals (91, aGrade.calculateTotalGrade(testWeights3));
	}
}

/*****************************************************************************
public testCalculateTotalGrade1() 
1.	手算 expected result (81*0.1+98*0.1+84*0.1+90*0.3+93*0.4=90.5四捨五入91)
2.	aGrade calls calculateTotalGrade (weights) 算actual result
3.	assert equal of the two results 

public testCalculateTotalGrade2() 
1.	手算 expected result (81*0.2+98*0.2+84*0.2+90*0.2+93*0.2四捨五入89)
2.	aGrade calls calculateTotalGrade (weights) 算actual result
3.	assert equal of the two results

public testCalculateTotalGrade3()  { … …}
**************************************************************************** */