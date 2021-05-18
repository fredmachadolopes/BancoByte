package br.com.projeto.banco;



import java.time.LocalDate;

import br.com.banco.controller.AprovacaoCliente;
import br.com.banco.controller.CodigoTransacoes;
import br.com.banco.controller.GerarCPF;
import br.com.banco.controller.TransferenciaBancaria;
import br.com.banco.enumClientes.TiposDeConta;
import br.com.banco.modelo.ContaCorrente;
import br.com.banco.modelo.ContaPoupanca;
import br.com.postgre.conexao.ConnectionFactory;


public class BancoMain {

	public static void main(String[] args) {
		
		
		
		GerarCPF novo = new GerarCPF();
		
		ContaCorrente cliente = (ContaCorrente) AprovacaoCliente.recebendoDados("Paty Lopes", 
				"67627672637", novo.newCPF(), 300, TiposDeConta.CONTA_CORRENTE, LocalDate.of(1988, 10, 10));
		ContaPoupanca cliente2 = (ContaPoupanca) AprovacaoCliente.recebendoDados("Lucas Lopes", 
				"6612732637", novo.newCPF(), 300, TiposDeConta.CONTA_POUPANCA, LocalDate.of(2016, 10, 10));
		
		System.out.println(cliente);
		System.out.println(cliente2);
		
		
		
		TransferenciaBancaria t = new TransferenciaBancaria();
		
		t.Tranferencia(cliente2, 100, cliente);
		
		
		System.out.println(cliente2.verSaldo());
		System.out.println(cliente.verSaldo());

		
		cliente2.transacoes();

	
	}

}
