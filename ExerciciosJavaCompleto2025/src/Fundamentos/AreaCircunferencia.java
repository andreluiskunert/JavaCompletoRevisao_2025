package Fundamentos;

public class AreaCircunferencia {
 public static void main(String[] args) {
	//System.out.println(3 * 9);
	 System.out.println("---Calcular Area Circunferencia----");
	    double raio = 3.4;
	    final double pi = 3.14159;
	  System.out.println("o valor é .."+ pi * raio * raio  + "  Area Circunferencia;");
	  //System.out.println("#Outra forma...");
	/*  pi = 1;
	  System.out.println("o valor é .."+ pi * raio * raio  + "  Area Circunferencia;" + "este calculo esta errado..."); */
	 
	 double area = pi * raio * raio;
	 raio = 10;
	 area = pi * raio * raio;
	  System.out.println("O valor da Area é: "+  area  +"m².");
	
}
}
