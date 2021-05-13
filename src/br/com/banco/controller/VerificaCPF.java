package br.com.banco.controller;

public class VerificaCPF {
	public static boolean verifica(String cpf) {
		if (cpf.length() != 11) {
			return false;
		} else {
			int verificador1 = 0, verificador2 = 0, somaDigitoVerificador1 = 0, somaDigitoVerificador2 = 0;
			char[] cpfChar = cpf.toCharArray();
			int[] cpfInt = new int[11];
			for (int i = 0; i < cpfChar.length; i++) {
				cpfInt[i] = cpfChar[i] - 48;
			}
			int multiplicador = 11;
			for (int i = 0; i < 10; i++) {
				if (i < 9) {
					somaDigitoVerificador1 += (cpfInt[i] * (multiplicador - 1));
				}
				somaDigitoVerificador2 += (cpfInt[i] * multiplicador);
				multiplicador--;
			}
			verificador1 = somaDigitoVerificador1 % 11 < 10 ? 11 - somaDigitoVerificador1 % 11 : 0;
			verificador2 = somaDigitoVerificador2 % 11 < 10 ? 11 - somaDigitoVerificador2 % 11 : 0;
			if (verificador1 == cpfInt[9] && verificador2 == cpfInt[10]) {
				return true;
			}
		}
		return false;
	}

	
		



}
