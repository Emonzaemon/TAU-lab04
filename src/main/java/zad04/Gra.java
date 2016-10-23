package zad04;

import java.util.Random;

public class Gra implements Psikus {

	
	public Integer cyfrokrad(Integer liczba) {
		
		int length = String.valueOf(liczba).length();
		
		if(length>1){
		Random generator = new Random(); 
		int i = generator.nextInt(length);
		String str = String.valueOf(liczba);
		str = str.substring(0, i) + str.substring(i + 1);
		liczba = Integer.parseInt(str);
		return liczba;
		}
		else
		return null;
	}

	
	public Integer hultajchochla(Integer liczba) throws NieudanyPsikusException {
		int length = String.valueOf(liczba).length();
	
		if(length>1){
			int i;
			int j;
			Random generator = new Random(); 
			do{
				i = generator.nextInt(length);
				j = generator.nextInt(length);
			} while(i == j);
			String str = String.valueOf(liczba);
			char[] strchar = str.toCharArray();
			char buffer = strchar[i];
			strchar[i] = strchar[j];
			strchar[j] = buffer;
			liczba = Integer.parseInt(new String(strchar));
			return liczba;
		}
		else
			throw new NieudanyPsikusException("Jednocyfrowa liczba!");
	}

	
	public Integer nieksztaltek(Integer liczba) {
		char buff = 0;
		int length = String.valueOf(liczba).length();
		Random generator = new Random(); 
		int i = generator.nextInt(length);
		String str = String.valueOf(liczba);
		char[] strchar = str.toCharArray();
		char x = strchar[i];
		int los = Character.getNumericValue(x);
		switch(los){
		case 3: buff = '8'; break;
		case 7: buff = '1'; break;
		case 6: buff = '9'; break;
		default: return liczba;
		}
		System.out.print(buff);
		strchar[i] = buff;
		liczba = Integer.parseInt(new String(strchar));
		return liczba;
		
		
	}
	
	

}
