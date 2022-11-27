package testing;
  
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ReverseString {
    //Edge coverage
	@Test
	void test1() 
	{	
		String out = Cfg.reverseString("a");
		assertEquals("a",out);
	}
	//Prime path coverage
	@Test
	void test2() 
	{	
		String out = Cfg.reverseString("ab");
		assertEquals("ba",out);
	}
	
	@Test
	void test3() 
	{	
		String out = Cfg.reverseString("");
		assertEquals("",out);
	}
}
