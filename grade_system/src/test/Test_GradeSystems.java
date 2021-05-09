package test;
/*****************************************************************
class TestGradeSystems
參閱下面細部設計中 GradeSystems class的設計草圖，測試用minimal input file建構的aGradeSystem object。

public  testGradeSystrems1() 
1.	aGradeSystem = new GradeSystems();
2.	assert equality of: 1) 87 and  2) aGradeSystem.aTree.get(“962001044”).lab1

public  testGradeSystrems2()
1.	aGradeSystem = new GradeSystems();
2.	assert equality of: 1) 81 and  2) aGradeSystem.aTree.(“962001051”).lab1

****************************************************************************/

import static org.junit.Assert.*;
import org.junit.Test;

import SourceCodeFiles.*;

public class Test_GradeSystems {
	
	GradeSystems aGradeSystem = new GradeSystems(); 
	@Test
	public void testGradeSystrems1() {
		assertEquals (87, aGradeSystem.aTree.get("962001044").lab1);
	}
	@Test
	public void testGradeSystrems2() {
		assertEquals (81, aGradeSystem.aTree.get("962001051").lab1);
	}
}
