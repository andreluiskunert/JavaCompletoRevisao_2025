package FundamentosDesafios;

public class temperatura {
 public static void main(String[] args) {
	 // (ºF - 32) * 5/9 = ºC -> qual é a resposta?
	 System.out.println("---- Desafio Variaveis e Constantes----");
	 System.out.println();
	 final double FATOR = 5.0 / 9.0;
	 final double AJUSTE = 32;
	 double fahrenheit = 86;
	 double celsius = (fahrenheit -AJUSTE) * FATOR;
	 System.out.println("A temperatura { (ºF - 32) * 5/9 = ºC } e de: " + celsius + "º ;");
	 System.out.println("Mais um exemplo...");
	 fahrenheit = 150;
	 celsius = (fahrenheit -AJUSTE) * FATOR;
	 System.out.println("O outro resultado é de : "+ celsius +"º; ");
	 System.out.println("The End");
}
}
