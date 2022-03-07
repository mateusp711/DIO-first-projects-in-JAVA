package com.dio.moddel;

public class Gato {
	
		private string nome; 
		private string cor;
		private integer idade;
		
		
		public Gato() {
		}

		public Gato(string nome, string cor, integer idade) {
			this.nome = nome;
			this.cor = cor;
			this.idade = idade;
			
		}

		public string getNome() {
			return nome;
		}

		public void setNome(string nome) {
			this.nome = nome;
		}

		public string getCor() {
			return cor;
		}

		public void setCor(string cor) {
			this.cor = cor;
		}

		public integer getIdade() {
			return idade;
		}

		public void setIdade(integer idade) {
			this.idade = idade;
		} 
		
		
		

}
