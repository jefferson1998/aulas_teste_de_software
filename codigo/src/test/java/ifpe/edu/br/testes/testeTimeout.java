package ifpe.edu.br.testes;

import static org.junit.jupiter.api.Assertions.*;
import static  java.time.Duration.ofSeconds;
import org.junit.jupiter.api.Test;

class testeTimeout {

	@Test
	void testTempo1() {
		assertTimeout(ofSeconds(3), 
				() -> {
					Thread.sleep(5000);
					System.out.println("Mensagem número 1");
				}
		);
	}
	
	@Test
	void testTempo2() {
		assertTimeout(ofSeconds(7), 
				() -> {
					Thread.sleep(5000);
					System.out.println("Mensagem número 2");
				}
		);
	}


}
