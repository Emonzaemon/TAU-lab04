package zad01;


import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CalculatorSteps {
	
	private Calculator calc;
	private Throwable throwable = null;

	@Given("a calculator")
	public void calulatorSetup(){
		calc = new Calculator();
	}
	
	@When("set arguments to $a and $b")
	public void setArguments(int a, int b){
		calc.setFirst(a);
		calc.setSecond(b);
	}
	
    @Then("adding should return $result")
	public void Add(int result){
    	assertEquals(result, (int) calc.add());
	}
    
    @Then("subtracting should return $result")
  	public void Substract(int result){
  		assertEquals(result, (int) calc.sub());
  	}
    
    @Then("multiplication should return $result")
  	public void multiplication(int result){
  		assertEquals(result, (int) calc.multi());
  	}
    
    @Then("division should return $result")
  	public void division(int result){
  		assertEquals(result, (int) calc.div());
  	}
    
    @Then("great test should return $result")
    	public void GreatTest(boolean result){
  		assertEquals(result, (boolean) calc.greater());        
    }
    
    @When("$a divided by 0")
    	public void dividedByZero(int a){
    	try{
    		calc.setFirst(a);
    		calc.setSecond(0);
    		calc.div();
    } catch (ArithmeticException e){
		throwable = e;
	}
}
    
    @Then("division should thrown an exception")
    public void exceptionThrown() {
        assertThat(throwable, instanceOf(ArithmeticException.class));
    }
}



