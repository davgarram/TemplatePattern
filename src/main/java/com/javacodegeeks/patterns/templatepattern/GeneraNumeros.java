package com.javacodegeeks.patterns.templatepattern;

public class GeneraNumeros {
	public static float generarFloat() 
	{
		return 5; //Siempre devuelve el mismo numero. En un caso real devolver�a un n�mero aleatorio o algo as�
	}
	public static String generarString()
	{
		return "HolaMundo";
	}
	public static float copiarFloat(GeneraNumeros g) 
	{
		return g.generarFloat(); //Deber�a acceder de forma estatica, pero as� puedo probarlo con Mockito
	}
}
