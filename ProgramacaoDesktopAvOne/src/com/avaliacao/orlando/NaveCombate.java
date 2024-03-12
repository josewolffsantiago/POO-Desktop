package com.avaliacao.orlando;

public class NaveCombate extends NaveEspacial {
	private String armamento;
	private int vitima;
	
		

	
	public NaveCombate(String nome, double velocidadeMaxima, double velocidade, int numeroTripulantes,
			double combustivel, String armamento, int vitima) {
		super(nome, velocidadeMaxima, velocidade, numeroTripulantes, combustivel);
		this.armamento = armamento;
		this.vitima = vitima;
	}

	public String armamento() {
		this.armamento = "Metralhadora de Bolinhas";
		return "A nave " + nome + " está equipada com um(a) " + armamento;
	}

	public String atacar() {
		this.vitima = vitima + 1;
		return "Nesta hora, o " + this.armamento + " entrou em ação e fez mais uma vítima";
	}	



	@Override
	public String toString() {
		return "Nave " + nome + ", e está com a velocidade de " + velocidadeMaxima + " Km/h, com a quantidade de "
				+ numeroTripulantes + " pessoas trabalhando e possui o total de " + combustivel + " litros de combutível.\nEsta nave está armado com o letal " + 
				this.armamento + " e fez o total de " + vitima + " vítima(s)";
	}
	@Override
	public String toStringDestruida() {
		return "Nave " + nome + ", tem a velocidade máxima de " + velocidadeMaxima+ + " Km/h e está com a velocidade atual de " + velocidade + " Km/h, com a quantidade de "+ numeroTripulantes + " pessoas trabalhando e possui o total de " + combustivel + " litros de combutível.\nEsta nave está armado com o letal " + 
				this.armamento + " e esta nave está irreparável";
	}
	


}
