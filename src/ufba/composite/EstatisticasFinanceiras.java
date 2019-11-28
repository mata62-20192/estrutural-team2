package ufba.composite;

public class EstatisticasFinanceiras {
	// Custo de uma EUquipe
	public static void imprimeCustoProjeto(Membro membro) {
		System.out.println("Custo de " + membro.getNome() + ": " + membro.getSalario());
	}
	
}