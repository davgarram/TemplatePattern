/**
 * 
 */
package com.javacodegeeks.patterns.templatepattern;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mockitoSession;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.logging.Logger;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author David Garcia Ramos
 *
 */

class GeneraNumerosTest {
	
	@Mock
	private static GeneraNumeros g=Mockito.mock(GeneraNumeros.class);
	private static Logger trazador=Logger.getLogger(GeneraNumerosTest.class.getName());
	private static GeneraNumeros probado;
	//Aqui se inyectan mocks, pero no hay nada que inyectar
		
	//Aqui se declaran capturadores de argumentos, pero no se va a emplear ninguno
	//@Captor
	//private ArgumentCaptor<Float> floatCaptor;	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		trazador.info("Iniciando Pruebas");
		//Cada vez que alguien pida el número se va a devolver un 5
		Mockito.when(g.getFloat()).thenReturn((float) 6.0);
		probado=new GeneraNumeros();
	}
	@BeforeEach
	void setUpBeforeEach() throws Exception {

		//Reinicia el valor del Generador
		probado.setFloat((float) 8);
	}
	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		trazador.info("Pruebas terminadas");
	}
	@DisplayName("Prueba Copiar Float")
	@Test
	public void CopiarFloatTest() {
		assertEquals((float) 6.0,GeneraNumeros.copiarFloat(g),"Error, no se ha copiado el numero");
		trazador.info("Copiado float con exito");
	}
	@DisplayName("Prueba Generar Cadena")
	@Test
	public void GenerarStringTest() {
		//Este test está diseñado para fallar!
		if (GeneraNumeros.generarString()!="HelloWorld") 
		{
			fail("No se ha devuelto la cadena correcta");
			
		}
		//Redundancia para probar que se conocen
		assertFalse(GeneraNumeros.generarString()!="HelloWorld");
		assertTrue(GeneraNumeros.generarString()=="HelloWorld");
		trazador.info("String Generada con Exito");
	}
	@DisplayName("Prueba Cambiar Float")
	@Test
	public void SetFloatTest() {
		probado.setFloat((float) 12.0);
		assertNotEquals((float) 8.0,probado.getFloat(),"Error, no se ha cambiado con exito");
		assertEquals((float) 12.0,probado.getFloat(),"Error, no se ha cambiado con exito al valor correcto");
		Mockito.verifyZeroInteractions(g); //No se debe tocar el mock en este test
		trazador.info("Copiado float con exito");
	}
	@DisplayName("Prueba Conseguir Float")
	@Test
	public void GetFloatTest() {
		fail("No se ha implementado todavía");
	}


}
