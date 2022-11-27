package testing;
 
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class LCSubStr {
	    //Edge coverage
		@Test
		void test1() 
		{	
			int out = Cfg.LCSubStr("a", "");
			assertEquals(0,out);
		}
		
		//Prime path coverage
		@Test
		void test2() 
		{	
			int out = Cfg.LCSubStr("", "a");
			assertEquals(0,out);
		}
		
		@Test
		void test3() 
		{	
			int out = Cfg.LCSubStr("b", "");
			assertEquals(0,out);
		}	
}

