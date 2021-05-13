package br.com.banco.modelo;

import java.time.LocalDate;
import java.util.HashMap;

import br.com.banco.controller.CodigoTransacoes;
import br.com.banco.controller.Transacao;

public class ContaCorrente extends Cliente {

	private static double jurosAoMes = .02;
	private static double jurosPorTransacao = .01;
	private static int quantidadeClienteCc;
	private double valor;
	private String agencia = "0542";
	private int conta = 50001;
	private String complementoAg = "- 3";
	private HashMap<String, Transacao> transacoes;

	public ContaCorrente(String nomeCompleto, String cpf, LocalDate dataNascimento, String rg, double valor) {
		super(nomeCompleto, cpf, dataNascimento, rg);
		this.valor = valor;
		quantidadeClienteCc++;
		this.conta += quantidadeClienteCc;
		this.complementoAg = this.conta + " " + complementoAg;
		this.transacoes = new HashMap<String, Transacao>();
	}

	public void setTransaco(String tipoTransacao) {
		
	    
		this.transacoes.put(CodigoTransacoes.geraCodigo(), new Transacao(tipoTransacao));
	}
	
	public void transacoes() {
		for (String codigo : this.transacoes.keySet()) {
			System.out.println(codigo  + " " +this.transacoes.get(codigo));
		}
	}

}
