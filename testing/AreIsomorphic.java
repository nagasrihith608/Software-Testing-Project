package testing;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class AreIsomorphic {
	    //Edge coverage
		@Test
		void test1() 
		{	
			boolean out = Cfg.areIsomorphic("ss","xx");
			assertEquals(true,out);
		}
		
		@Test
		void test2() 
		{	
			boolean out = Cfg.areIsomorphic("","");
			assertEquals(true,out);
		}
		
		@Test
		void test3() 
		{	
			boolean out = Cfg.areIsomorphic("srihith","saiksk");
			assertEquals(false,out);
		}
		
		//Prime path coverage
		@Test
		void test4() 
		{	
			boolean out = Cfg.areIsomorphic("naveen","sandeep");
			assertEquals(false,out);
		}
		
		@Test
		void test5() 
		{	
			boolean out = Cfg.areIsomorphic("","");
			assertEquals(true,out);
		}
		
		@Test
		void test6() 
		{	
			boolean out = Cfg.areIsomorphic("sx","zz");
			assertEquals(false,out);
		}
		
		@Test
		void test7() 
		{	
			boolean out = Cfg.areIsomorphic("dd","ay");
			assertEquals(false,out);
		}
}
