package zad02;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CalculatorSteps {
	
	private Calculator calc;
	

	@Given("a calculator")
	public void calulatorSetup(){
		calc = new Calculator();
	}
	
	@When("set arguments to $a and $b")
	public void setArguments(double a, double b){
		calc.setFirst(a);
		calc.setSecond(b);
	}
	
    @Then("adding should return $result")
	public void Add(double result){
    	assertEquals(result, calc.add(), 0.0001);
	}
    
    @Then("subtracting should return $result")
  	public void Substract(double result){
  		assertEquals(result, calc.sub(), 0.0001);
  	}
    
    @Then("multiplication should return $result")
  	public void multiplication(double result){
    	assertEquals(result,calc.multi(), 0.0001);
  	}
    
    @Then("division should return $result")
  	public void division(double result){
  		assertEquals(result, calc.div(), 0.000000001);
  	}
    
    @Then("great test should return $result")
    	public void GreatTest(boolean result){
  		assertEquals(result, (boolean) calc.greater());        
    }
}

	
	

