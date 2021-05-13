package br.com.banco.controller;

import java.util.Arrays;
import java.util.Random;

public class GerarCPF {
	
	private int quantidade;
	private VerificaCPF vc = new VerificaCPF();
	private Random rn = new Random();

	public GerarCPF() {
		this.quantidade = 1;
	}

	public String newCPF() {
		int[] cpf = new int[11];
		String cpf2 = "";
		while (0 < this.quantidade) {

			for (int i = 0; i < cpf.length; i++) {
				cpf[i] = rn.nextInt(10);
			}

			 cpf2 = Arrays.toString(cpf).replaceAll("\\[|\\]|,|\\s", "");

			if (vc.verifica(cpf2)) {
				
				System.out.println("CPF válido");
				this.quantidade--;
			}
		}
		return cpf2;
	}

}


