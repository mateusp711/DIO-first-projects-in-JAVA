package com.dio;

import com.dio.moddel.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato ();
		Livros Livros = new Livros();
		
		System.out.println(gato);
		System.out.println(Livros);
		
		/*(int a = 2;
		int b = 3;
		System.out.println("Hello World! " + (a+b));*/
	}
}

class Livros {	
	private String nome; 
	private String npag;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNpag() {
		return npag;
	}
	public void setNpag(String npag) {
		this.npag = npag;
	}
	
}