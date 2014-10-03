package br.com.caellum.ed;

import br.com.caellum.ed.vetores.Vetor;

public class TesteAdicionaPorPosicao {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		a3.setNome("Ana");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(0, a1);
		lista.adiciona(1, a2);
		lista.adiciona(2, a3); //teste posi��o 3 (Posi��o inv�lida)
		
		System.out.println(lista);

	}

}
