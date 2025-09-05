package br.com.ana.cm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.ana.cm.modelo.Campo;

class CampoTeste {

	private Campo campo;
	
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3,3);
	}	
	
	@Test
	void testeVizinhoRealDistancia1() {
		Campo vizinho = new Campo(3, 4);
		
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}

}
