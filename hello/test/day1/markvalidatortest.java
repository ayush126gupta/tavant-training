package day1;
import day1.markvalidator;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class markvalidatortest {

	@Test
	void testispass() {
		//fail("Not yet implemented");
		boolean act=markvalidator.isPass(66);
		boolean exp=true;
		assertEquals(act,exp);
	}
void testmarkgrade() {
	String act=markvalidator.markGrade(66);
	String exp="Grade C";
	assertEquals(act,exp);
}
}
