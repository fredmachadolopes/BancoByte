package br.com.banco.intefaces;

import br.com.banco.controller.CodigoTransacoes;
import br.com.banco.controller.Transacao;

public interface MetodosContas {
	

	public void setTransaco(String tipoTransacao);
	
	public void transacoes();


	public double verSaldo() ;

	public String getAgencia() ;

	public int getConta();

	
	public void depositar(double valor) ;
	
	public double sacar(double valor);


}
