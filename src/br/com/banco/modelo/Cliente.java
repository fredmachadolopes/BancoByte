package br.com.banco.modelo;

import java.time.LocalDate;

public abstract class Cliente {

	private String nomeCompleto;
	private String cpf; 
	private LocalDate dataNascimento;
	private String rg;
	public Cliente(String nomeCompleto, String cpf, LocalDate dataNascimento, String rg) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public String getCpf() {
		return cpf;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public String getRg() {
		return rg;
	}
	@Override
	public String toString() {
		return "Cliente: " + nomeCompleto  + ", dataNascimento: " + dataNascimento + ", CPF: " + cpf + ", RG: "
				+ rg;
	}
	
	
	
	
	
}
