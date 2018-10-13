package ifpe.edu.br.testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static  java.time.Duration.ofSeconds;

class testeTimeoutPreemptively {

	@Test
	void testTimeoutPreemptively() {	
			assertTimeoutPreemptively(ofSeconds(3), 
					() -> {
						Thread.sleep(5000);
						System.out.println("Mensagem número 1");
					}
			);
	}
	
	@Test
	void testTimeoutPreemptively2() {	
			assertTimeoutPreemptively(ofSeconds(7), 
					() -> {
						Thread.sleep(5000);
						System.out.println("Mensagem número 2");
					}
			);
	}

}
