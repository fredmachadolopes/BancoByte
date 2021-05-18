package br.com.banco.controller;

import br.com.banco.intefaces.MetodosContas;
import br.com.banco.modelo.Cliente;

public class TransferenciaBancaria {
	
	public void Tranferencia(MetodosContas envia, double valor,MetodosContas  recebe) {
		if(envia.sacar(valor) == valor) {
			recebe.depositar(valor);
			envia.setTransaco("Tranferencia bancaria para " + ((Cliente) recebe).getNomeCompleto() + " no valor R$" + valor);
		}else {
			System.out.println("Saldo insuficiente, verique o valor e tente novamente.");
		}
	}

}
