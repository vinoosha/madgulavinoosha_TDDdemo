import static org.junit.jupiter.api.assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class Removeachartest
{
	@Test
	void testfirstchar()
	{
		assertEquals("BCD",Removeachar.removeAcharacter("ABCD"));
	}
	@Test
	public void test2chars()
	{
		assertEquals("CD",Removeachar.removeAcharacter("AACD"));
	}
	@Test
	public void testonlysecondchar()
	{
		assertEquals("BCD",Removeachar.removeAcharacter("BACD"));
	}
	@Test
	public void testlast2chars()
	{
		assertEquals("BBAA",Removeachar.removeAcharacter("BBAA"));
	}
	@Test
	public void testfirstandlast2chars()
	{
		assertEquals("BAA",Removeachar.removeAcharacter("AABAA"));
	}
	
	
	
	
	
}
