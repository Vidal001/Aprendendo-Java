package fundamentos;

import java.util.Scanner;

public class Wrapper {
	
	public static void main(String[] args) {
		
		
		//byte
		Byte b = 100;
		Short s = 1000;
		
		//Integer.pars eInt(entrada.next()); //int
		Integer i = 10000;
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 123.5678;
		System.out.println(d);
		
	    Boolean bo = Boolean.parseBoolean("True");
	    System.out.println(bo);
	    System.out.println(bo.toString().toUpperCase());
	    
	    Character c = '#'; //Char
	    System.out.println(c + "...");
	    
		
	}

}
