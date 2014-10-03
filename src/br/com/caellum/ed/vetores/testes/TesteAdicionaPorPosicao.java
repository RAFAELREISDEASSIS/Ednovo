package br.com.caellum.ed.vetores.testes;

import br.com.caellum.ed.Aluno;
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
		
		lista.adiciona(a1);
		lista.adiciona(0, a2);
		lista.adiciona(1, a3); //teste posição 3 (Posição inválida)
		
		System.out.println(lista);

	}

}
