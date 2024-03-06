package com.avaliacao.orlando;

public class NaveCarga extends NaveEspacial{
	private double capacidadeCarga;
	private double carga;
	
	
	
	public double getCarga() {
		return carga;
	}



	public void setCarga(double carga) {
		this.carga = carga;
	}



	public NaveCarga(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel,
			double capacidadeCarga, double carga) {
		super(nome, velocidadeMaxima, numeroTripulantes, combustivel);
		this.capacidadeCarga = capacidadeCarga;
		this.carga = carga;
	}



	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}


	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}



	public void carregar(double carregar) {
		this.carga = this.carga + carregar;		
	}
	
	
	
	@Override
	public String toString() {
		return "Nave " + nome + " é uma nave de CARGA e está com a velocidade de " + velocidadeMaxima + " Km/h, com a quantidade de "
				+ numeroTripulantes + " pessoas trabalhando e possui o total de " + combustivel + " litros de combutível. \nEsta nave possui cerca de " +
				capacidadeCarga + " Kg de capacidade e está carregando cerca de " + carga + " Kg de carga";
	}
}
