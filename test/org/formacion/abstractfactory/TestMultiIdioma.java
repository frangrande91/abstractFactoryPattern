package org.formacion.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiIdioma {

	private static Preguntas preguntas;
	private static Saludos saludos;

	@Test
	public void test_es() {
		Preguntas preguntas = new PreguntasEs();
		
		assertEquals("¿qué hora es?", preguntas.preguntaHora() );
		assertEquals("¿qué tiempo hace?", preguntas.preguntaTiempo() );
		
		Saludos saludos = new SaludosEs();
		
		assertEquals("buenos días", saludos.buenosDias());
		assertEquals("buenas tardes", saludos.buenasTardes());
	}
	
	@Test
	public void test_en() {
		Preguntas preguntas = new PreguntasEn();
		
		assertEquals("what time is it?", preguntas.preguntaHora() );
		assertEquals("how is the weather?", preguntas.preguntaTiempo() );
		
		Saludos saludos = new SaludosEn();
		
		assertEquals("good morning", saludos.buenosDias());
		assertEquals("good afternoon", saludos.buenasTardes());
	}


	@Test
	public void test_multiIdioma() {
		Preguntas preguntasEs = FactoryMaker.makeFactory(FactoryMaker.CodLenguaje.ES).createPreguntas();
		Saludos saludosEs = FactoryMaker.makeFactory(FactoryMaker.CodLenguaje.ES).createSaludos();

		assertEquals("¿qué hora es?", preguntasEs.preguntaHora() );
		assertEquals("¿qué tiempo hace?", preguntasEs.preguntaTiempo() );
		assertEquals("buenos días", saludosEs.buenosDias());
		assertEquals("buenas tardes", saludosEs.buenasTardes());

		Preguntas preguntasEn = FactoryMaker.makeFactory(FactoryMaker.CodLenguaje.EN).createPreguntas();
		Saludos saludosEn = FactoryMaker.makeFactory(FactoryMaker.CodLenguaje.EN).createSaludos();

		assertEquals("what time is it?", preguntasEn.preguntaHora() );
		assertEquals("how is the weather?", preguntasEn.preguntaTiempo() );
		assertEquals("good morning", saludosEn.buenosDias());
		assertEquals("good afternoon", saludosEn.buenasTardes());
	}


}
