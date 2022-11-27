package testing;
  
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LCS {
	    //Prime path coverage
		@Test
		void test1() 
		{	
			int out = Cfg.LCS("","");
			assertEquals(0,out);
		}
		
		@Test
		void test2() 
		{	
			int out = Cfg.LCS("","a");
			assertEquals(0,out);
		}
}
