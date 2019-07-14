package day1;
import day1.factorial;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class factorialTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		//factorial f=new factorial();
		int act=factorial.calculatefactorial(5);
		int exp=120;
		assertEquals(act,exp);
	}

}
