package br.com.banco.controller;

import java.time.LocalDate;

import br.com.banco.modelo.Cliente;
import br.com.banco.modelo.ContaCorrente;
import br.com.banco.modelo.TiposDeConta;

public class AprovacaoCliente {
	
	public static Cliente recebendoDados(String nome, String rg, String cpf, 
			double valor, TiposDeConta tipoConta, LocalDate dataNascimento) {
		boolean abrirConta = false;
		if((nome.length() > 8) && (VerificaCPF.verifica(cpf)) && (valor > 99)) {
			abrirConta = true;
		}if(tipoConta.equals(TiposDeConta.CONTA_CORRENTE) && abrirConta) {
			 
			ContaCorrente novoCliente = new ContaCorrente(nome, cpf, dataNascimento, rg, valor);
			novoCliente.setTransaco("Criacao da conta Corrente");
			return novoCliente;
		}else if(tipoConta.equals(TiposDeConta.CONTA_POUPANCA) && abrirConta) {
			
		}
		
		
		return null;
	}

}
