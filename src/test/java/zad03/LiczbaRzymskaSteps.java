package zad03;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;



public class LiczbaRzymskaSteps {

	private LiczbaRzymska rzymska;
	
	@Given("a roman converter")
	public void Arabic(){
		 rzymska = new LiczbaRzymska();
	}
	
	@When("set arabic to $a")
	public void setDigit(int a){
		rzymska.setLiczba(a);
	}
	
    @Then("result is $result")
	public void convert(String result){
    	assertEquals("III", LiczbaRzymska.toString(rzymska.getLiczba()));
	}
	
    @Then("result should be not null")
	public void irNotNull(){
    	assertNotNull(rzymska.getLiczba());
	}
    
    @Then("message should appear $a")
	public void isValid(String a){
    	assertThat(LiczbaRzymska.toString(-1), is(a));
    }
}


