package day1;
import day1.hello;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class helloworldtest {

	@Test
	void test() {
		//fail("Not yet implemented");
		//hello h =new hello();
		String act=hello.getMessage();
		String exp="hello world";
		assertEquals(exp,act);
	}
	

}
