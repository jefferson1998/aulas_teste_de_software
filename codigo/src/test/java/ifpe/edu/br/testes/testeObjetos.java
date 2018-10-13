package ifpe.edu.br.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ifpe.edu.br.objetos.Cachorro;
import ifpe.edu.br.objetos.Gato;

class testeObjetos {

	@Test
	void testSeNaoSaoOMesmoObjeto() {
		var cachorro = new Cachorro();
		var gato = new Gato();
		
		assertNotSame(cachorro, gato);
	}
	
	@Test
	void testSeSaoOMesmoObjeto() {
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		
		assertSame(cachorro, gato);
	}
	
	@Test
	void testSeSaoOMesmoObjeto2() {
		Cachorro cachorro = new Cachorro();
		Cachorro cachorro2 = cachorro;
		
		assertSame(cachorro, cachorro2);
	}

}
