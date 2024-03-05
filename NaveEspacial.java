package com.avaliacao.orlando;

public class NaveEspacial {
	
	protected String nome;
	protected double velocidadeMaxima;
	protected int numeroTripulantes;
	protected double combustivel;
		
	//método para acelerar
	
	public NaveEspacial(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel) {		
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		this.numeroTripulantes = numeroTripulantes;
		this.combustivel = combustivel;
	}
	
	public double acelerar(double velocidade) {
		return this.velocidadeMaxima + velocidade;
	}

	public double desacelerar(double velocidade) {
		return this.velocidadeMaxima - velocidade;
	}
	public double abastecer(double litros) {
		return this.combustivel = litros;
	}
	public double viajar(double distancia) {
		return this.combustivel = distancia * 0.5;
		
	}	
	public String toString() {
		return "Nave [nome: " + nome + ", e está com a velocidade de " + velocidadeMaxima + "Km/h, com a quantidade de "
				+ numeroTripulantes + "pessoas trabalhando e possui o total de " + combustivel + " litros de combutível.]";
	}
	

}
