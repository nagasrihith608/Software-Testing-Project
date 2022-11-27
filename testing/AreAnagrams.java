package testing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AreAnagrams {
	        //Edge coverage
			@Test
			void test1() 
			{	
				boolean out = Cfg.areAnagrams("d","d");
				assertEquals(true,out);
			}
			
			@Test
			void test2() 
			{	
				boolean out = Cfg.areAnagrams("srihith","saiksk");
				assertEquals(false,out);
			}
			
			@Test
			void test3() 
			{	
				boolean out = Cfg.areAnagrams("ansh","bnsh");
				assertEquals(false,out);
			}
			
			//Prime path coverage
			@Test
			void test4() 
			{	
				boolean out = Cfg.areAnagrams("ad","da");
				assertEquals(true,out);
			}
			
			@Test
			void test5() 
			{	
				boolean out = Cfg.areAnagrams("naveen","sandeep");
				assertEquals(false,out);
			}
			
			@Test
			void test6() 
			{	
				boolean out = Cfg.areAnagrams("","");
				assertEquals(true,out);
			}
			
			@Test
			void test7() 
			{	
				boolean out = Cfg.areAnagrams("qwer","wart");
				assertEquals(false,out);
			}
}
