package com.avaliacao.orlando;

public class NaveCombate extends NaveEspacial {
	private String armamento;
	
		
	public NaveCombate(String nome, double velocidadeMaxima, int numeroTripulantes, double combustivel,
			String armamento) {
		super(nome, velocidadeMaxima, numeroTripulantes, combustivel);
		this.armamento = armamento;
	}

	public String atacar() {
		return "Nesta hora, o " + armamento + " entrou em ação e fez mais uma vítima";
	}

	@Override
	public String toString() {
		return "Nave [nome: " + nome + ", e está com a velocidade de " + velocidadeMaxima + "Km/h, com a quantidade de "
				+ numeroTripulantes + "pessoas trabalhando e possui o total de " + combustivel + " litros de combutível. Esta nave está armado com o letal " + 
				armamento + "]";
	}
	


}
