package day1;
import day1.markvalidatorswitch;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class markvalidatorswitchTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		String act=markvalidatorswitch.markGrad(80);
		String exp="grade b";
		assertEquals(act,exp);
	}

}
