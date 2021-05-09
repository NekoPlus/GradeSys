package test;
/****************************************************************************
class TestShowRank
aGradeSystem ¶È§t­â©v§Ê¤Î§õ«Â§Ê

test case 1: assert ­â©v§Ê rank equals 2
test case 2: assert §õ«Â§Ê rank equals 1
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
