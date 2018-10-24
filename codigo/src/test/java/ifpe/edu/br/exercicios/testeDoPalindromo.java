package ifpe.edu.br.exercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ifpe.edu.br.objetos.Calculadora;
import ifpe.edu.br.objetos.Palavra;

class testeDoPalindromo {

private final Palavra palavra = new Palavra();
	
	@Test
	void testePolidromoVerdadeiro() {
		assertEquals(true, palavra.palindromo("ovo"));
	}
	
	@Test
	void testePolidromoFalso() {
		assertEquals(false, palavra.palindromo("ardo"));
	}
	
	@Test
	void testePolidromoNotNull() {
		assertNotNull(palavra.palindromo("palavra"));
	}
	
	@Test
	void testePolidromoNull() {
		assertEquals(false, palavra.palindromo(null));
	}
	
	@Test
	void testePolidromoObjetosIguais() {
		assertSame(palavra,palavra);
	}
	
	@Test
	void testePolidromoObjetosNaoIguais() {
		var palavra1 = new Palavra();
		assertNotSame(palavra1,palavra);
	}

	
}
