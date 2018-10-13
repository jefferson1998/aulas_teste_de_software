package ifpe.edu.br.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ifpe.edu.br.objetos.Cachorro;
import ifpe.edu.br.objetos.Gato;

class testeNull {
	
private Cachorro cachorro;
private Gato gato;

	@Test
	void testSeNaoENull() {
		cachorro = new Cachorro();
		assertNotNull(cachorro);
	}

	@Test
	void testSeENull2() {
		gato = null;		
		assertNull(gato);
	}
	
}
