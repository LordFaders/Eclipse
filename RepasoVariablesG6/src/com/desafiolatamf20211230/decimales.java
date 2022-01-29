package com.desafiolatamf20211230;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class decimales {

	public static void main(String[] args) {
		
		double numero = 2;
	    double raiz = Math.sqrt(numero);
	    
	    System.out.println("La raíz cuadrada de " + numero + "es: " + raiz);
	    
	    //Utilizando la clase decimalFormat  Ojo Importar la clase java.text.DecimalFormat
	    
	    DecimalFormat df = new DecimalFormat("#.00");
	    System.out.println("La raíz cuadrada de " + numero + "es: " + df.format(raiz)); 
	    
	    //Utilizando la clase String format
	    
	    System.out.println("La raíz cuadrada de " + numero + "es: " + String.format("%.3f", raiz));
	    
	    //Utilizando la clase Math.round
	    
	    System.out.println("La raíz cuadrada de " + numero + "es: " + (double)Math.round(raiz * 100) / 100);
	    
	    //Utilizando la clase BigDecimal OJO Importar clases java.math.BigDecimal y java.math.RoundingMode//
	     
	    BigDecimal bd = new BigDecimal(raiz);
	    bd = bd.setScale(6, RoundingMode.HALF_UP);
	    System.out.println("La raíz cuadrada de " + numero + "es: " + bd.doubleValue());
	    
	} 

}
 