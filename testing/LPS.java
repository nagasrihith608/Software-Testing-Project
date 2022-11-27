package testing;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LPS {
	        //Edge coverage
			@Test
			void test1() 
			{	
				int out = Cfg.LPS("s");
				assertEquals(1,out);
			}
			
			//Prime path coverage
			@Test
			void test2() 
			{	
				int out = Cfg.LPS("r");
				assertEquals(1,out);
			}
			//Error test case
			@Test
			void test3() 
			{	
				int out = Cfg.LPS("");
				assertEquals(1,out);
			}
}
