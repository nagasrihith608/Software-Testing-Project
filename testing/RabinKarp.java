package testing;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RabinKarp {
		//Prime path coverage
		@Test
		void test1() 
		{	
			int out = Cfg.rabinKarp("m","");
			assertEquals(0,out);
		}
}
