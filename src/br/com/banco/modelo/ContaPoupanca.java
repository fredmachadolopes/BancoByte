package br.com.banco.modelo;

import java.time.LocalDate;
import java.util.HashMap;

import br.com.banco.controller.CodigoTransacoes;
import br.com.banco.controller.Transacao;
import br.com.banco.intefaces.MetodosContas;

public class ContaPoupanca extends Cliente implements MetodosContas {
	
	private static double jurosAoMes = .01;
	private static double jurosPorTransacao = .005;
	private static int quantidadeClienteCp;
	private double valor;
	private String agencia = "0542-8";
	private int conta = 1300001;
	private String numeroConta;
	private HashMap<String, Transacao> transacoes;

	public ContaPoupanca(String nomeCompleto, String cpf, LocalDate dataNascimento, String rg, double valor) {
		super(nomeCompleto, cpf, dataNascimento, rg);
		
		this.valor = valor;
		quantidadeClienteCp++;
		this.conta += quantidadeClienteCp;
		this.numeroConta = this.conta + " - 3";
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
	public static int getQuantidadeClienteCp() {
		return quantidadeClienteCp;
	}
	@Override
	public double verSaldo() {
		
		return this.valor;
	}

	@Override
	public String getAgencia() {
		
		return this.agencia;
	}

	@Override
	public String getNumeroConta() {
	
		return this.numeroConta;
	}

	@Override
	public void depositar(double valor) {
		if(valor > 0) {
			this.valor+= valor;
		}else {
			System.out.println("Este valor de deposito não é permitido R$ " + valor);
		}
		
	}

	@Override
	public double sacar(double valor) {
		if(verSaldo() > valor + valor * jurosPorTransacao) {
			this.valor -= valor +  valor * jurosPorTransacao;
			
			System.out.println("O valor R$ " +valor+ " foi retirado da conta");
			return valor;
		}else {
			System.out.println("Saldo insuficiente");
			return 0;
		}
	}

}
