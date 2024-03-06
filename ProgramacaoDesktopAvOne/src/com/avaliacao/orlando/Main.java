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

				System.out.println("Digite o número de funcionários no interior da Nave:");
				int numeroTripulantes = scanner.nextInt();

				System.out.println("Digite o valor em litros de combustível no abastecimento:");
				double combustivel = scanner.nextDouble();

				System.out.println("Digite a capacidade máxima de carga");
				double capacidadeCarga = scanner.nextDouble();

				System.out.println("Digite o peso da carga que será transportada:");
				double carga = scanner.nextDouble();
				if (carga <= capacidadeCarga) { // Atestar que o usuário não irá colocar mais carga do que o permitido
												// na aeronave
					System.out.println("Peso permitido dentro da nave, pode prosseguir com o carregamento.");
				} else {
					System.out.println("Peso acima do permitido dentro da Nave, perigo de queda, tente novamente");
					break;
				}

				NaveCarga naveCargueiro = new NaveCarga(nome, 0, numeroTripulantes, combustivel, capacidadeCarga,
						carga);

				System.out.println("Digite a distância a percorrer: ");
				double distancia = scanner.nextDouble();
				if (distancia * 2 <= combustivel) {

				} else {
					System.out.println("Quantidade de combustível é insuficiente para a viagem. \n Tente novamente.");
					break;
				}
				naveCargueiro.viajar(distancia); //Método para atualizar o combustivel da nave		
				

				System.out.println("Digite a acelaração da Nave: ");
				double velocidade = scanner.nextDouble();

				naveCargueiro.setVelocidadeMaxima(velocidade);
				
				System.out.println(naveCargueiro.toString( ) + "\n");

				while (true) {
					System.out.println("Troque alguns parâmetros da sua nave" + naveCargueiro.nome + ": \n1- Acelerar \n2- Desacelerar \n3- Abastecer \n4- Carregar");
					int opcaoUser = scanner.nextInt();

					switch (opcaoUser) {
					case 1: {
						naveCargueiro.acelerar();
						System.out.println("Nave aumentou a velocidade para " + naveCargueiro.getVelocidadeMaxima() + " Km/h" );

						break;

					}
					case 2: {
						naveCargueiro.desacelerar();
						System.out.println("Nave diminui a velocidade para " + naveCargueiro.getVelocidadeMaxima() + " Km/h" );
						break;
					}
					case 3: {
						System.out.println("Sua nave possui cerca de " + naveCargueiro.combustivel + " litros. Digite a quantidade de abastecimento:");
						double abastecimento = scanner.nextDouble();
						naveCargueiro.abastecer(abastecimento);
						System.out.println("Sua nave possui " + naveCargueiro.combustivel + " litros de combustível. Faça uma boa viagem");
						break;
					}
						
					case 4: {
						System.out.println("Sua nave tem " + naveCargueiro.getCapacidadeCarga() + " Kg de capacidade máxima. A nave suporta cerca de "
								+ (naveCargueiro.getCapacidadeCarga() - naveCargueiro.getCarga()) + " Kg de carga sem superar o limite.\nDigite a carga adicional:");
						double cargaAdicional = scanner.nextDouble();
						if (cargaAdicional <= (naveCargueiro.getCapacidadeCarga() - naveCargueiro.getCarga())) {
							naveCargueiro.carregar(cargaAdicional);
							System.out.println("Carga carregada com sucesso. A Nave Cargueiro está transportando " + naveCargueiro.getCarga() + " Kg");							
						} else {
							System.out.println("Carga não suportada pela nave");
							break;
						}						
						break;
					}
					default:
						throw new IllegalArgumentException("Unexpected value: " + opcaoUser);
					}
				}

				// System.out.println("Deseja acelerar ou desacelerar a nave? \n1- Acelerar \n2-
				// Desacelerar"); //para acionar o MÉTODO ACELERAR OU DESACELERAR
				// int opcaoAcelerar = scanner.nextInt();

				// if (opcaoAcelerar == 1) {
				// naveCargueiro.acelerar();
				// } if (opcaoAcelerar == 2) {
				// naveCargueiro.desacelerar();
				// }

				//System.out.println(naveCargueiro.toString());

				//break;

			case 2: // Nave de Passageiro
				System.out.println("Você selecionou uma nave de Passageiro. \nDigite o nome da Nave: ");
				Scanner namePassenger = new Scanner(System.in);
				String nomePassenger = namePassenger.nextLine();

				System.out.println("Digite o número de funcionários no interior da Nave:");
				int numeroTripulantesPass = scanner.nextInt();

				System.out.println("Digite o valor em litros de combustível no abastecimento:");
				double combustivelPass = scanner.nextDouble();

				System.out.println("Digite o número de passagens vendidas");
				int passageiros = scanner.nextInt();

				System.out.println("Digite a distância a percorrer: ");
				double distanciaPass = scanner.nextDouble();
				if (distanciaPass * 2 < combustivelPass) {

				} else {
					System.out.println("Quantidade de combustível é insuficiente para a viagem. \n Tente novamente.");
					break;
				}

				NavePassageiros navePassenger = new NavePassageiros(nomePassenger, 0, numeroTripulantesPass,
						combustivelPass, passageiros);

				System.out.println("Digite a acelaração da Nave: ");
				double velocidadePass = scanner.nextDouble();

				navePassenger.setVelocidadeMaxima(velocidadePass);

				System.out.println("Deseja acelerar ou desacelerar a nave? \n1- Acelerar \n2- Desacelerar"); // para
																												// acionar
																												// o
																												// MÉTODO
																												// ACELERAR
																												// OU
																												// DESACELERAR
				int opcaoAcelerarPass = scanner.nextInt();

				if (opcaoAcelerarPass == 1) {
					navePassenger.acelerar();
				}
				if (opcaoAcelerarPass == 2) {
					navePassenger.desacelerar();
				}

				System.out.println("\n" + navePassenger.toString());

				break;
			case 3: // Nave de Combate

				System.out.println("Você selecionou uma nave de Combate. \nDigite o nome da Nave: ");
				Scanner nameComb = new Scanner(System.in);
				String nomeComb = nameComb.nextLine();

				System.out.println("Digite o número de funcionários no interior da Nave:");
				int numeroTripulantesComb = scanner.nextInt();

				System.out.println("Digite o valor em litros de combustível no abastecimento:");
				double combustivelComb = scanner.nextDouble();

				NaveCombate naveGuerra = new NaveCombate(nomeComb, 0.0, numeroTripulantesComb, combustivelComb,
						"teste");

				System.out.println("Digite a distância a percorrer: ");
				double distanciaComb = scanner.nextDouble();
				if (distanciaComb * 2 < combustivelComb) {

				} else {
					System.out.println("Quantidade de combustível é insuficiente para a viagem. \n Tente novamente.");
					break;
				}

				System.out.println("Digite a acelaração da Nave: ");
				double velocidadeComb = scanner.nextDouble();

				naveGuerra.setVelocidadeMaxima(velocidadeComb);

				System.out.println("Deseja acelerar ou desacelerar a nave? \n1- Acelerar \n2- Desacelerar"); // para
																												// acionar
																												// o
																												// MÉTODO
																												// ACELERAR
																												// OU
																												// DESACELERAR
				int opcaoAcelerarComb = scanner.nextInt();

				if (opcaoAcelerarComb == 1) {
					naveGuerra.acelerar();
				}
				if (opcaoAcelerarComb == 2) {
					naveGuerra.desacelerar();
				}

				System.out.println(
						"Sua nave de Combate está equipada com um armamento. Quer saber qual? \n1- Sim \n2- Não \n");
				int opcaoArmamento = scanner.nextInt();
				if (opcaoArmamento == 1) {
					System.out.println(naveGuerra.armamento() + "\n");
				}

				System.out.println("Um inimigo foi avistado a frente. Deseja atacar? \n1- Sim \n2- Não");
				int opcaoAtacar = scanner.nextInt();
				if (opcaoAtacar == 1) {
					System.out.println(naveGuerra.atacar() + "\n");

				} else {
					System.out.println("Sua nave de guerra não atacou e foi destruída" + "\n");
					System.out.println(naveGuerra.toStringDestruida());
					break;
				}

				System.out.println(naveGuerra.toString() + "\n");

				break;
			}
		}

	}
}
