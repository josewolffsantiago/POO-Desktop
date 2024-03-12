package com.avaliacao.orlando;

public abstract class NaveEspacial {
	
	protected String nome;
	protected double velocidadeMaxima;
	protected double velocidade;
	protected int numeroTripulantes;
	protected double combustivel;
		
	
	
	public NaveEspacial(String nome, double velocidadeMaxima, double velocidade, int numeroTripulantes, double combustivel) {		
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidade = velocidade;
		this.numeroTripulantes = numeroTripulantes;
		this.combustivel = combustivel;
	}
	
	//método para acelerar

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}	

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public double acelerar() {
		return this.velocidade++;
	}

	public double desacelerar() {
		return this.velocidade--;
	}
	public double abastecer(double litros) {
		return this.combustivel = this.combustivel + litros;
	}
	public double viajar(double distancia) {
		return this.combustivel = this.combustivel - distancia * 0.5;		
	}	
	public String toString() {
		return "Nave: " + nome + ", tem a velocidade máxima de " + velocidadeMaxima+ " Km/h e está com a velocidade de " + velocidade + " Km/h, com a quantidade de "
				+ numeroTripulantes + " pessoas trabalhando e possui o total de " + combustivel + " litros de combutível.]";
	}
	public String toStringDestruida();
	
	

}
