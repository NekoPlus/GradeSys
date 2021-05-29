package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.Test;

import SourceCodeFiles.IDExceptions1;
import SourceCodeFiles.IDExceptions2;
import SourceCodeFiles.IDExceptions3;
import SourceCodeFiles.UI;

public class Test_promptID {

	@Test
	public void test() throws IDExceptions1, IDExceptions2, IDExceptions3 {
		ByteArrayInputStream in = new ByteArrayInputStream("Q".getBytes());
		System.setIn(in);
		UI c = new UI();
		
	}

}
