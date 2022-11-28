package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(4));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase() .equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Yasmin";
		var sobrenome = "Vidal";
		var idade = "21";
		var salario = 12345.987F;
		
		System.out.println("Nome: " + nome 
				+ "\nSobrenome: " + sobrenome 
				+ "\nIdade " + idade + 
				"\nSalario " + salario + "\n\n ");
		
		 
		
		
		
		
	}

}
