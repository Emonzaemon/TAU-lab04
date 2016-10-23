package zad04;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertNull;

import org.hamcrest.Matchers;
import org.junit.Test;




public class GraTest {
	
	Gra psikus = new Gra();
	
	@Test
    public void cyfrokradTest() {
		assertThat(psikus.cyfrokrad(1234), Matchers.anyOf(
	            is(Matchers.equalTo(123)),
	            is(Matchers.equalTo(124)),
	            is(Matchers.equalTo(134)),
	            is(Matchers.equalTo(234))
	        ));
		assertNull(psikus.cyfrokrad(1));
    }
	@Test
	public void hultajchochla(){
		Throwable w = null;
        try {
            assertThat(psikus.hultajchochla(12), is(Matchers.equalTo(21)));
            psikus.hultajchochla(1);
        } catch (NieudanyPsikusException e) {
            w = e;
        }
        assertThat(w, instanceOf(NieudanyPsikusException.class));
	}
	
	@Test
	public void nieksztaltekTest(){
		assertThat(psikus.nieksztaltek(376), Matchers.anyOf(
				is(Matchers.equalTo(876)),
				is(Matchers.equalTo(316)),
				is(Matchers.equalTo(379))
			));
			assertThat(psikus.nieksztaltek(124), Matchers.equalTo(124));
		
	}
	
}
