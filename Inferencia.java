package fundamentos;

public class Inferencia {
	 
	public static void main(String[] args) {
       
		double a = 4.5; // Declarei e inicializei
		System.out.println(a);
		
		var b = 4.5; // Quando declarada uma (var) é obrigatorio dar valor
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c= "Outro texto";
		System.out.println(c);
		
		// c = 4.5;
		
		double d; //Variavel foi declarada
		d = 123.65; // Varavel foi inicializada
		System.out.println(d); // Usada
		
		//Não é possivel alterar o tipo de uma váriavel depois de declarada
		// Só é possivel em caso de double > int
		
	}
}
