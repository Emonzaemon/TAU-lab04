package zad04;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;


import org.hamcrest.Matchers;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class GraSteps {

private Gra psikus;
private Throwable throwable = null;

@Given("a psikus instance")
public void psikusSetup() {
	psikus = new Gra();
}

@When("set argument $value to cyfrokrad")
public void satValueToCryfrokrad(int value) {
	psikus.cyfrokrad(value);
}

@Then("result is equal to null")
public void cyfrokradSingle() {
	assertThat(psikus.getWynik(), is(Matchers.nullValue()));
}

@Then("result is not null and equal to $a, or $b, or $c, or $d")
public void cyfrokradTest(int a, int b, int c, int d) {
	assertThat(psikus.getWynik(), Matchers.allOf(
			Matchers.notNullValue(),
			Matchers.anyOf(
					is(Matchers.equalTo(a)),
					is(Matchers.equalTo(b)),
					is(Matchers.equalTo(c)),
					is(Matchers.equalTo(d))
			)
	));
}

@When("set argument $value to hultajchochla")
public void setValueToHultajchochla(int value) {
	try {
		psikus.hultajchochla(value);
	}  catch (NieudanyPsikusException e) {
		throwable = e;
	}
}

@Then("result is equal to $value")
public void hultajchochlaTest(int value) {
	assertThat(psikus.getWynik(), is(Matchers.equalTo(value)));
}

@Then("an nieudany psikus exception is thrown")
public void nieudanyPsikusExceptionTest() {
	assertThat(throwable, instanceOf(NieudanyPsikusException.class));
}

@When("set argument $value to nieksztaltek")
public void setValueToNieksztaltek(int value) {
	psikus.nieksztaltek(value);
}


@Then("result is equal to $a, or $b, or $c")
public void nieksztaltekTest(int a, int b, int c) {
	assertThat(psikus.getWynik(), Matchers.anyOf(
			is(Matchers.equalTo(a)),
			is(Matchers.equalTo(b)),
			is(Matchers.equalTo(c))
			)
	);
}

@Then("result still equal to $value")
public void nieksztaltekTestNotChanged(int value) {
	assertThat(psikus.getWynik(), Matchers.equalTo(value));
}

}
