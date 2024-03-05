package com.avaliacao.orlando;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		while (true) {
			System.out.print(
					"Selecione o tipo de Nave Espacial: \n1 - Nave de Carga \n2 - Nave de Passageiros \n3 - Nave de Combate \n");
			Scanner scanner = new Scanner(System.in);
			int opcao = scanner.nextInt();

			switch (opcao) {
			case 1: // Nave de Carga

				System.out.println("Você selecionou uma nave de carga. \nDigite o nome da Nave: ");
				Scanner name = new Scanner(System.in);
				String nome = name.nextLine();
				// Scanner scann = new Scanner(System.in);

				System.out.println("Digite o número de funcionários no interior da Nave:");
				// Scanner scann = new Scanner(System.in);
				int numeroTripulantes = scanner.nextInt();

				System.out.println("Digite o valor em litros de combustível no abastecimento:");
				// Scanner scann = new Scanner(System.in);
				double combustivel = scanner.nextDouble();

				System.out.println("Digite a capacidade máxima de carga");
				// Scanner scanner = new Scanner(System.in);
				double capacidadeCarga = scanner.nextDouble();

				System.out.println("Digite o peso da carga que será transportada:");
				// Scanner scanner = new Scanner(System.in);
				double carga = scanner.nextDouble();
				if (carga <= capacidadeCarga) { // Atestar que o usuário não irá colocar mais carga do que o permitido
												// na aeronave
					System.out.println("Peso permitido dentro da nave, pode prosseguir com o carregamento.");
				} else {
					System.out.println("Peso acima do permitido dentro da Nave, perigo de queda, tente novamente");
					break;
				}
				
				System.out.println("Digite a acelaração da Nave: ");
				/// Scanner scanner = new Scanner(System.in);
				double velocidade = scanner.nextDouble();

				System.out.println("Digite a distância a percorrer: ");
				// Scanner scanner = new Scanner(System.in);
				double distancia = scanner.nextDouble();
				if (distancia * 2 < combustivel) {

				} else {
					System.out.println("Quantidade de combustível é insuficiente para a viagem. \n Tente novamente.");
					break;
				}
				NaveCarga naveCargueiro = new NaveCarga(nome, velocidade, numeroTripulantes, combustivel,
						capacidadeCarga, carga);
				System.out.println(naveCargueiro.toString());

				break;
				
			case 2: // Nave de Passageiro
				System.out.println("Você selecionou uma nave de Passageiro. \nDigite o nome da Nave: ");
				Scanner namePassenger = new Scanner(System.in);
				String nomePassenger = namePassenger.nextLine();
				// Scanner scann = new Scanner(System.in);

				System.out.println("Digite o número de funcionários no interior da Nave:");
				// Scanner scann = new Scanner(System.in);
				int numeroTripulantesPass = scanner.nextInt();

				System.out.println("Digite o valor em litros de combustível no abastecimento:");
				// Scanner scann = new Scanner(System.in);
				double combustivelPass = scanner.nextDouble();

				System.out.println("Digite o número de passagens vendidas");
				// Scanner scanner = new Scanner(System.in);
				int passageiros = scanner.nextInt();

				System.out.println("Digite a acelaração da Nave: ");
				/// Scanner scanner = new Scanner(System.in);
				double velocidadePass = scanner.nextDouble();

				System.out.println("Digite a distância a percorrer: ");
				// Scanner scanner = new Scanner(System.in);
				double distanciaPass = scanner.nextDouble();
				if (distanciaPass * 2 < combustivelPass) {

				} else {
					System.out.println("Quantidade de combustível é insuficiente para a viagem. \n Tente novamente.");
					break;
				}

				NavePassageiros navePassenger = new NavePassageiros(nomePassenger, velocidadePass, numeroTripulantesPass, combustivelPass, passageiros);
				
				System.out.println(navePassenger.toString());

				
				break;
			case 3:

				break;

			default:
				break;
			}
		}

	}
}
