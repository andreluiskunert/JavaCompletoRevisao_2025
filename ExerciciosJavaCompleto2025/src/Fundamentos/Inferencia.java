package Fundamentos;

public class Inferencia {
 public static void main(String[] args) {
	System.out.println(" ---- Inferencia----");
	System.out.println();
	double a = 4.5;
	System.out.println("O valor de A é :" + a + ";");
	// 2ªParte _sabado
	a = 12.57;
	System.out.println("O valor de A é :" + a + ";");
	a = 12;
	System.out.println("O valor de A é :" + a + " valor inteiro;");
	var b = 4.5;
	System.out.println("O valor de B é :" + b + ";");
	var c = "Texto";
	System.out.println("Qual é o valor de C :" + c + ";");
	c = "Outro Texto";
	System.out.println("Qual é o valor de C :" + c + ";");
	double d; // variável declarada;
	d = 300.000; //  variável  inicializada 
	System.out.println("Se Deus me abençoe com o valor de " + d + " ficaria super feliz...traria minha mãe morar comigo.." ); //  variável  usada
	var f =  250; // 250.00R$ // valor inteiro;
	// f = 250.500;
	/* 
	 Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Type mismatch: cannot convert from double to int

	at Fundamentos.Inferencia.main(Inferencia.java:24)
	 */
	System.out.println("Se conseguir pelos "+ f + "ja ficaria feliz... mais sei que pobre nunca tem nada só os ricos tem..");
	 
	  
	System.out.println("The End");
}
}
