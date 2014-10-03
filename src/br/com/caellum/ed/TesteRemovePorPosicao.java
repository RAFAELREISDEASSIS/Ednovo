package br.com.caellum.ed;

import br.com.caellum.ed.vetores.Vetor;

public class TesteRemovePorPosicao {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
	
		
		Vetor lista = new Vetor();
		
		lista.adiciona(0, a1);
		lista.adiciona(1, a2);
		
		lista.remove(0);
		lista.remove(1);
		
		System.out.println(lista);
		
	}

}
