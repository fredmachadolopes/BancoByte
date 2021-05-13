package br.com.banco.controller;

import java.time.LocalDateTime;

public class Transacao {
	
	private LocalDateTime data;
	private String tipoDeTransacao;
	
	public Transacao(String tipoTransacao) {
		this.data = LocalDateTime.now();
		this.tipoDeTransacao = tipoTransacao;
	}

	@Override
	public String toString() {
		return "Transacao [data=" + data + ", tipoDeTransacao=" + tipoDeTransacao + "]";
	}

	public LocalDateTime getData() {
		return data;
	}

	public String getTipoDeTransacao() {
		return tipoDeTransacao;
	}

}
