package testing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EditDistance {
	    //Prime path coverage
		@Test
		void test1() 
		{	
			int out = Cfg.editDistDP("","a");
			assertEquals(1,out);
		} 
}
