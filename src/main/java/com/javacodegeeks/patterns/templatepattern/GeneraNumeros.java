package com.javacodegeeks.patterns.templatepattern;

public class GeneraNumeros {
	private float a=0;
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
		return g.getFloat(); 
	}
	private float getFloat() {
		// TODO Auto-generated method stub
		return a;
	}
	private void setFloat(float b) 
	{
		a=b;
	}
	
}
