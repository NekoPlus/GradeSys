package test;
/****************************************************************************
class TestShowRank
aGradeSystem �ȧt��v�ʤΧ��§�

test case 1: assert ��v�� rank equals 2
test case 2: assert ���§� rank equals 1
***************************************************************************/

import static org.junit.Assert.*;
import SourceCodeFiles.*;

import org.junit.Test;

public class Test_showRank {

	@Test
	public void testGradeSystrems1() {
		assertEquals (2, showRank("962001044"));
	}

}
