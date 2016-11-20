package zad02;

public class Calculator {
	
	private double first;
	private double second;
	
	public double getFirst() {
		return first;
	}

	public void setFirst(double first) {
		this.first = first;
	}

	public double getSecond() {
		return second;
	}

	public void setSecond(double second) {
		this.second = second;
	}


	public double add(){
		return first + second;
	}
	
	public double sub(){
		return first - second;
	}
	
	public double multi(){
		return first * second;
	}
	
	public double div(){
		return first / second;
	}
	
	public boolean greater(){
		return first > second;
	}

}
