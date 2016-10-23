package zad03;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class LiczbaRzymskaTest {

	LiczbaRzymska rzymska = new LiczbaRzymska();
	
	@Test
	public void testRomanConversion() {
		//System.out.println(LiczbaRzymska.toString(rzymska.getLiczba()));
		assertEquals("III", LiczbaRzymska.toString(rzymska.getLiczba()));		
	}
	@Test
	public void RomanNullTest(){
		assertNotNull(rzymska.getLiczba());
	}
	@Test
	public void RomanNegative(){
		assertThat(LiczbaRzymska.toString(-1), is("Invalid Roman Number Value"));
	}
	

}
