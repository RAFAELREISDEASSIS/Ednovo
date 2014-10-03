package br.com.caellum.ed.vetores;

import br.com.caellum.ed.Aluno;

public class Vetor {

	private Aluno[] alunos = new Aluno[10000000];
	
	private int totalDeAlunos = 0;
	
	private boolean posicaoOcupada(int posicao) {
		return posicao < this.alunos.length && posicao >= 0;		
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalDeAlunos;		
	}
	
	private void garantaEspaco() {
		if(this.totalDeAlunos == this.alunos.length){
			Aluno[] novaArray = new Aluno[this.alunos.length * 2];
			for (int i = 0; i < this.alunos.length; i++) {
				novaArray[i] = this.alunos[i];
			}
			this.alunos = novaArray;
		}
	}
	
	public void adiciona(Aluno aluno) {
		
//		for (int i = 0; i < this.alunos.length; i++) {
//			if (this.alunos[i] == null) {
//				this.alunos[i] = aluno;
//				break;
//			}
//		}
		
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		garantaEspaco();
		if(!this.posicaoValida(posicao)){
			throw new IllegalArgumentException("Posição inválida");
		}
		
		for(int i = this.totalDeAlunos - 1; i >= posicao; i-=1){
			this.alunos[i + 1] = this.alunos[i];
		}
		
		this.alunos[posicao] = aluno;
		this.totalDeAlunos++;
	}
	
	public Object pega(int posicao) {
 
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição insválida");
		}
		return this.alunos[posicao];
	}
	
	public void remove(int posicao) {
		
		if (!posicaoOcupada(posicao)){
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = posicao; i < this.totalDeAlunos - 1; i++){
			this.alunos[i] = this.alunos[i+1];
		}
		totalDeAlunos--;
	}
		
	public boolean contem(Aluno aluno){
		
		for (int i = 0; i < this.totalDeAlunos; i++){
			if(aluno.equals(this.alunos[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int tamanho(){
		return this.totalDeAlunos;		
	}
	
	public String toString() {
		if (this.totalDeAlunos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for (int i = 0; i < this.totalDeAlunos - 1; i++) {
			builder.append(this.alunos[i]);
			builder.append(", ");
		}
		
		builder.append(this.alunos[this.totalDeAlunos - 1]);
		builder.append("]");
		
		return builder.toString();
	}
	
}