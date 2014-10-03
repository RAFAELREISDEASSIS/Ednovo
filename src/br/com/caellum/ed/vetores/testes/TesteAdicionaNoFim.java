package br.com.caellum.ed.vetores.testes;

import br.com.caellum.ed.Aluno;
import br.com.caellum.ed.vetores.Vetor;

public class TesteAdicionaNoFim {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista);

	}

}
