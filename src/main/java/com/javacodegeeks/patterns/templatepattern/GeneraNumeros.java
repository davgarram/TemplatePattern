package com.javacodegeeks.patterns.templatepattern;

public class GeneraNumeros {
	private float a=0;
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
		return g.getFloat(); 
	}
	public float getFloat() {
		// TODO Auto-generated method stub
		return a;
	}
	public void setFloat(float b) 
	{
		a=b;
	}
	
}
