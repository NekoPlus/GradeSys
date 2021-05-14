package test;
/*****************************************************************
public  testUI1() {assertNotNull ( new UI() );}
*****************************************************************/
import static org.junit.Assert.*;
import SourceCodeFiles.*;
import org.junit.Test;

public class Test_UI {
	UI aUI = new UI();
	@Test
	public void test() {
		assertNotNull(aUI);
	}
}
