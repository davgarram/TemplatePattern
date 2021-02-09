package com.javacodegeeks.patterns.templatepattern;

public class GeneraNumeros {
	public static float generarFloat() 
	{
		return 5; //Siempre devuelve el mismo numero. En un caso real devolvería un número aleatorio o algo así
	}
	public static String generarString()
	{
		return "HolaMundo";
	}
	public static float copiarFloat(GeneraNumeros g) 
	{
		return g.generarFloat(); //Debería acceder de forma estatica, pero así puedo probarlo con Mockito
	}
}
