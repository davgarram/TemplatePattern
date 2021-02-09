package com.javacodegeeks.patterns.templatepattern;

public abstract class CalcularProducto {
	float num1;
	float num2;
	float resultado;
	public void run() 
	{
		conseguirNum1();
		conseguirNum2();
		multiplicar();
		imprimir();
	}

	void conseguirNum1() {
		 
		num1 = GeneraNumeros.generarFloat();
	}
	void conseguirNum2() {
		 
		num2 = GeneraNumeros.generarFloat();
	}
	abstract void multiplicar();
	void imprimir() 
	{
		System.out.print(resultado);
	}
	
	
	
}
