package ifpe.edu.br.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testeTrue {
private final int a = 2;
private final int b = 3;
	
	@Test
	void testSeEVerdadeiro() {
		assertTrue(a < b);
	}

	@Test
	void testSeEVerdadeiro2() {
		assertTrue(a > b, "Não passou no teste");
	}
}
