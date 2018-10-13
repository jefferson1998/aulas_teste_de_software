package ifpe.edu.br.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ifpe.edu.br.objetos.Calculadora;

class testeEquals {
private final Calculadora c = new Calculadora();
	@Test
	void testSoma () {
		assertEquals(2, 2 + 0);
	}

	@Test
	void testSubtracao() {
		assertEquals(3, 4-1);
	}

	// o terceiro valor é a diferença entre o primeiro e o segundo.
	@Test
	void testDiferencaDelta() {
		assertEquals(3, 4-1, 3);
	}
	
	@Test
	void testSomar() {
		assertEquals(4, c.somar(2, 2));
		assertEquals(4, c.somar(5, 2));
		assertEquals(5, c.somar(3, 2));
	}
	
	@Test
	void testSubtrair() {
		assertEquals(0, c.subtrair(3, 3));
		assertEquals(3, c.subtrair(6, 3));
		assertEquals(10, c.subtrair(30, 3));
	}
	
	@Test
	void testMultiplicar() {
		assertEquals(9, c.multiplicar(3, 3));
		assertEquals(18, c.multiplicar(6, 3));
		assertEquals(15, c.multiplicar(5, 3));
	}
	
	@Test
	void testDividir() {
		assertEquals(1, c.dividir(3, 3));
		assertEquals(2, c.dividir(6, 3));
		assertEquals(3, c.dividir(9, 3));

	}
	
}
