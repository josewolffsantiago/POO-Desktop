package com.avaliacao.orlando;

public abstract class NaveEspacial {
	
	protected String nome;
	protected double velocidadeMaxima;
	protected int numeroTripulantes;
	protected double combustivel;
		
	
	
	public NaveEspacial(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel) {		
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		this.numeroTripulantes = numeroTripulantes;
		this.combustivel = combustivel;
	}
	
	//método para acelerar
	
	
	
	public double acelerar() {
		return this.velocidadeMaxima++;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double desacelerar() {
		return this.velocidadeMaxima --;
	}
	public double abastecer(double litros) {
		return this.combustivel = this.combustivel + litros;
	}
	public double viajar(double distancia) {
		return this.combustivel = this.combustivel - distancia * 0.5;		
	}	
	public String toString() {
		return "Nave: " + nome + ", e está com a velocidade de " + velocidadeMaxima + "Km/h, com a quantidade de "
				+ numeroTripulantes + " pessoas trabalhando e possui o total de " + combustivel + " litros de combutível.]";
	}
	public String toStringDestruida();
	
	

}
