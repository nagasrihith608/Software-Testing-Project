package testing;
 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsPalindrome {
	    //Edge coverage
		@Test
		void test1() 
		{	
			boolean out = Cfg.isPalindrome("zz");
			assertEquals(true,out);
		}
		
		@Test
		void test2() 
		{	
			boolean out = Cfg.isPalindrome("zbaby");
			assertEquals(false,out);
		}
		
		//Prime path coverage
		@Test
		void test3() 
		{	
			boolean out = Cfg.isPalindrome("abca");
			assertEquals(false,out);
		}
		
		@Test
		void test4() 
		{	
			boolean out = Cfg.isPalindrome("abzba");
			assertEquals(true,out);
		}
		
		@Test
		void test5() 
		{	
			boolean out = Cfg.isPalindrome("");
			assertEquals(true,out);
		}
		
		@Test
		void test6() 
		{	
			boolean out = Cfg.isPalindrome("zasay");
			assertEquals(false,out);
		}
}
