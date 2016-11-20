package zad01;

public class Calculator {
	
	private int first;
	private int second;
	
	public double getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public double getSecond() {
		return second;
	}

	public void setSecond(int second) {
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
