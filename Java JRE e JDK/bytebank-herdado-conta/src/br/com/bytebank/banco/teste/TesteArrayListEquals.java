package br.com.bytebank.banco.teste;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
	public static void main(String[] args) {
		
		

		    ArrayList<Conta> lista = new ArrayList<Conta>();

		    Conta cc1 = new ContaCorrente(11, 11);
		    Conta cc2 = new ContaCorrente(22, 22);
		    Conta cc3 = new ContaCorrente(22, 22);

		    lista.add(cc1);
		    lista.add(cc2);

		    for(Conta conta : lista){
		        System.out.println(conta);
		    }
	        System.out.println();
	        System.out.println("-------------------------");
	        System.out.println();
	        
		    
		    System.out.println(lista.contains(cc3));
	}
}
