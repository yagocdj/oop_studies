import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestCase {

	@Test
	void teste1() {
		Participante joao = 	new Participante("joao@gmail.com", "joao", 17);
		Participante maria = 	new Participante("maria@gmail.com", "maria", 30);
		Participante pedro = 	new Participante("pedro@gmail.com", "pedro", 70);
		assertEquals(500.0, joao.getValorPago(1000.0));
		assertEquals(1000.0, maria.getValorPago(1000.0));
		assertEquals(800.0, pedro.getValorPago(1000.0));
	}

	@Test
	void teste2() {
		Convidado paulo = 		new Convidado("paulo@gmail.com", "paulo",  17, "empresa1");
		Convidado katia = 		new Convidado("katia@gmail.com", "katia",  30, "empresa2");
		Convidado antonio =		new Convidado("antonio@gmail.com", "antonio",  70, "empresa3");
		assertEquals(0.0, paulo.getValorPago(1000.0));
		assertEquals(500.0, katia.getValorPago(1000.0));
		assertEquals(300.0, antonio.getValorPago(1000.0));
	}
}
