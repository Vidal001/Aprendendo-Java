package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		final double FATOR = 5.0 /9.0;
		final double AJUSTE = 32;
	
		
		double fahren = 86;
		double celsius = (fahren - AJUSTE) * FATOR;
		
		System.out.println(celsius);
		
	}
			

}
