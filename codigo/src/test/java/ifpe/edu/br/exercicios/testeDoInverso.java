package ifpe.edu.br.exercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ifpe.edu.br.objetos.Palavra;

class testeDoInverso {
	private Palavra palavra = new Palavra();
	
	@Test
	void testeInversoVerdadeiro() {
		assertEquals("odra", palavra.inversoPalavra("ardo"));
	}
	
	@Test
	void testeInversoFalso() {
		assertNotEquals("odar", palavra.inversoPalavra("ardo"));
	}
	
	@Test
	void testeInversoNull() {
		palavra = null;
		assertNull(palavra);
	}
	
	@Test
	void testeInversoNotNull() {
		assertNotNull(palavra);
	}
	
	@Test
	void testeInversoObjetosIguais() {
		assertSame(palavra,palavra);
	}
	
	@Test
	void testeInversoObjetosNaoIguais() {
		var palavra1 = new Palavra();
		assertNotSame(palavra1,palavra);
	}
	
}
