package com.avaliacao.orlando;

public class NavePassageiros extends NaveEspacial {
	private int numeroPassageiros;
	
	
	
	public NavePassageiros(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel,
			int numeroPassageiros) {
		super(nome, velocidadeMaxima, numeroTripulantes, combustivel);
		this.numeroPassageiros = numeroPassageiros;
	}
	
	

	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}



	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}


	
	public void embarcar(int numero) {
		this.numeroPassageiros = this.numeroPassageiros + numero;
	}
	@Override
	public String toString() {
		return "Nave " + nome + ", e está com a velocidade de " + velocidadeMaxima + " Km/h, com a quantidade de "
				+ numeroTripulantes + " pessoas trabalhando e possui o total de " + combustivel + " litros de combutível. \nEsta nave está com o total de " + 
				numeroPassageiros + " passageiros sentados.]";
	}
}
