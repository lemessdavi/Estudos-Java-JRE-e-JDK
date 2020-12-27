package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TestaGuardador {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc1 = new ContaCorrente(12, 12);
		Conta cc2 = new ContaCorrente(12, 12);
		
		guardador.adiciona(cc1);
		guardador.adiciona(cc2);
		
		System.out.println(guardador.getQuantidadeDeElementos());
		System.out.println(guardador.getElementoPelaPosicao(1));
		
	}

}
