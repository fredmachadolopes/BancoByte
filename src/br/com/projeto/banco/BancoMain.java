package br.com.projeto.banco;



import java.time.LocalDate;

import br.com.banco.controller.AprovacaoCliente;
import br.com.banco.controller.CodigoTransacoes;
import br.com.banco.controller.GerarCPF;
import br.com.banco.enumClientes.TiposDeConta;
import br.com.banco.modelo.ContaCorrente;
import br.com.postgre.conexao.ConnectionFactory;


public class BancoMain {

	public static void main(String[] args) {
		
		
		
		GerarCPF novo = new GerarCPF();
		
		ContaCorrente cliente = (ContaCorrente) AprovacaoCliente.recebendoDados("Fred Lopes", "67627672637", novo.newCPF(), 300, TiposDeConta.CONTA_CORRENTE, LocalDate.of(1988, 10, 10));
		
		System.out.println(cliente);
		
		cliente.transacoes();
		
		System.out.println(new ConnectionFactory().conectandoPostgres());
		
		

	
	}

}
