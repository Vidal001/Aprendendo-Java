package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
        double raio = 3.4;
         final double pi = 3.14159; // Final = forma de identificar uma constante
        
        double area = pi * raio * raio; // Double = valor de ponto flutuante
        
        System.out.println(area); 
        
        raio = 10;
        area = pi * raio * raio;
        System.out.println("Area = " + area);
		
		
	}

}
