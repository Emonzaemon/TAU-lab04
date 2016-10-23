package zad03;

public class LiczbaRzymska {

	private int liczba;
	
	public int getLiczba() {
		return liczba;
	}

	public void setLiczba(int liczba) {
		this.liczba = liczba;
	}
	
	LiczbaRzymska(){
		this.setLiczba(3);
	}
	
	public static String toString(int liczba){
		    if (liczba < 1 || liczba > 3999)
		        return "Invalid Roman Number Value";
		    String s = "";
		    while (liczba >= 1000) {
		        s += "M";
		        liczba -= 1000;        }
		    while (liczba >= 900) {
		        s += "CM";
		        liczba -= 900;
		    }
		    while (liczba >= 500) {
		        s += "D";
		        liczba -= 500;
		    }
		    while (liczba >= 400) {
		        s += "CD";
		        liczba -= 400;
		    }
		    while (liczba >= 100) {
		        s += "C";
		        liczba -= 100;
		    }
		    while (liczba >= 90) {
		        s += "XC";
		        liczba -= 90;
		    }
		    while (liczba >= 50) {
		        s += "L";
		        liczba -= 50;
		    }
		    while (liczba >= 40) {
		        s += "XL";
		        liczba -= 40;
		    }
		    while (liczba >= 10) {
		        s += "X";
		        liczba -= 10;
		    }
		    while (liczba >= 9) {
		        s += "IX";
		        liczba -= 9;
		    }
		    while (liczba >= 5) {
		        s += "V";
		        liczba -= 5;
		    }
		    while (liczba >= 4) {
		        s += "IV";
		        liczba -= 4;
		    }
		    while (liczba >= 1) {
		        s += "I";
		        liczba -= 1;
		    }    
		    return s;
		
	}


}
