package day1;
import day1.sumofnumbers;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sumofnumberstest {

	@Test
	void test1() {
		//fail("Not yet implemented");
		int act=sumofnumbers.sumofodd(0,10);
		int exp=25;
		assertEquals(act,exp);
		
	}
	@Test
void test2(){
	int act=sumofnumbers.sumofeven(0,10);
	int exp=30;
	assertEquals(act,exp);
}
}
