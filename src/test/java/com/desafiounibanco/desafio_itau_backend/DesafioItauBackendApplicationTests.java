package com.desafiounibanco.desafio_itau_backend;

import com.desafiounibanco.desafio_itau_backend.domain.Transacao;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DesafioItauBackendApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testTransacao() {
		Transacao transacao = new Transacao(100.0, OffsetDateTime.now());

		assertEquals(100.0, transacao.getValor(), 0.01);

		transacao.setValor(200.75);

		assertEquals(200.75, transacao.getValor(), 0.01);

		System.out.println("Passou!");

	}
}
