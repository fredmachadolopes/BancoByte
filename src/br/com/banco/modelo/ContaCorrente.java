package br.com.banco.modelo;

import java.time.LocalDate;
import java.util.HashMap;

import br.com.banco.controller.CodigoTransacoes;
import br.com.banco.controller.Transacao;
import br.com.banco.intefaces.MetodosContas;

public class ContaCorrente extends Cliente implements MetodosContas {

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
    @Override
	public void setTransaco(String tipoTransacao) {
		
	    
		this.transacoes.put(CodigoTransacoes.geraCodigo(), new Transacao(tipoTransacao));
	}
    @Override
	public void transacoes() {
		for (String codigo : this.transacoes.keySet()) {
			System.out.println(codigo  + " " +this.transacoes.get(codigo));
		}
	}

	public static int getQuantidadeClienteCc() {
		return quantidadeClienteCc;
	}
	@Override
	public double verSaldo() {
		return valor;
	}
	@Override
	public String getAgencia() {
		return agencia;
	}
	@Override
	public int getConta() {
		return conta;
	}

	@Override
	public void depositar(double valor) {
		
		
		if(valor > 0) {
			this.valor+= valor;
		}else {
			System.out.println("Este valor de saldo não é permitido R$ " + valor);
		}
	}
	@Override
	public double sacar(double valor) {
		if(verSaldo() > valor) {
			this.valor -= valor;
			System.out.println("O valor R$ " +valor+ " foi retirado da conta");
			return valor;
		}else {
			System.out.println("Saldo insuficiente");
			return 0;
		}
	}

}
