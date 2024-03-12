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

				System.out.println("Você selecionou uma nave de carga. Você irá atribuir todos os parâmetros da sua nave. \nDigite o nome da Nave: ");
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
				NaveCarga naveCargueiro = new NaveCarga(nome, 0, 0, numeroTripulantes, combustivel, capacidadeCarga,
						carga);
				

				System.out.println("Digite a distância a percorrer: ");
				double distancia = scanner.nextDouble();
				if (distancia * 2 <= combustivel) {

				} else {
					System.out.println("Quantidade de combustível é insuficiente para a viagem. \n Tente novamente.");
					break;
				}
				naveCargueiro.viajar(distancia); //Método para atualizar o combustivel da nave		
				

				System.out.println("Digite a velocidade máxima da Nave: ");
				double velocidade = scanner.nextDouble();

				naveCargueiro.setVelocidadeMaxima(velocidade);
				
				System.out.println(naveCargueiro.toString( ) + "\n");

				while (true) { //Modo do usuário para utilizar a aeronave
					System.out.println("Troque alguns parâmetros da sua nave " + naveCargueiro.getNome() + ": \n1- Acelerar \n2- Desacelerar \n3- Abastecer \n4- Carregar \n5- Nova Jornada");
					int opcaoUser = scanner.nextInt();

					switch (opcaoUser) {
					case 1: {
						if( naveCargueiro.getVelocidade() < naveCargueiro.getVelocidadeMaxima()) {
						naveCargueiro.acelerar();
						System.out.println("Nave aumentou a velocidade para " + naveCargueiro.getVelocidade() + " Km/h" );
						} else { 
							System.out.println("Nave atingiu a velocidade máxima");
						}
						break;
						

					}
					case 2: {
						naveCargueiro.desacelerar();
						System.out.println("Nave diminui a velocidade para " + naveCargueiro.getVelocidade() + " Km/h" );
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
					case 5: {
						System.out.println("Sua nave " + naveCargueiro.getNome() + " já percorreu " + distancia + ". \nDigite uma nova jornada:");
						double distanciaAdicionalCarga = scanner.nextDouble();
						naveCargueiro.viajar(distanciaAdicionalCarga); //Método para atualizar o combustivel da nave
						distancia = distancia + distanciaAdicionalCarga; 
						System.out.println(naveCargueiro.toString());
						break;
					}
						
					default:
						System.out.println("Opção inválida, desligando a nave\n");
						System.out.println(naveCargueiro.toString());
						System.exit(0);
						break;
					}
					
				}

			case 2: // Nave de Passageiro
				System.out.println("Você selecionou uma nave de Passageiro. Você irá atribuir todos os parâmetros da sua nave. \nDigite o nome da Nave: ");
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

				NavePassageiros navePassenger = new NavePassageiros(nomePassenger, 0, 0, numeroTripulantesPass,
						combustivelPass, passageiros);

				System.out.println("Digite a velocidade máxima da Nave: ");
				double velocidadePass = scanner.nextDouble();

				navePassenger.setVelocidadeMaxima(velocidadePass);
				
				navePassenger.viajar(distanciaPass); //Método para atualizar o combustivel da nave	

				System.out.println(navePassenger.toString( ) + "\n");

				while (true) {
					System.out.println("Troque alguns parâmetros da sua nave" + navePassenger.getNome() + ": \n1- Acelerar \n2- Desacelerar \n3- Abastecer \n4- Embarcar Passageiros \n5- Nova Jornada");
					int opcaoUser = scanner.nextInt();

					switch (opcaoUser) {
					case 1: {
						if( navePassenger.getVelocidade() < navePassenger.getVelocidadeMaxima()) {
						navePassenger.acelerar();
						System.out.println("Nave aumentou a velocidade para " + navePassenger.getVelocidade() + " Km/h" );
						} else { 
							System.out.println("Nave atingiu a velocidade máxima");
						}
						break;
					}
					case 2: {
						navePassenger.desacelerar();
						System.out.println("Nave diminui a velocidade para " + navePassenger.getVelocidade() + " Km/h" );
						break;
					}
					case 3: {
						System.out.println("Sua nave possui cerca de " + navePassenger.combustivel + " litros. Digite a quantidade de abastecimento:");
						double abastecimento = scanner.nextDouble();
						navePassenger.abastecer(abastecimento);
						System.out.println("Sua nave possui " + navePassenger.combustivel + " litros de combustível. Faça uma boa viagem");
						break;
					}
						
					case 4: {
						System.out.println("Sua nave tem " + navePassenger.getNumeroPassageiros() + " pessoas embarcadas. \nDigite a quantidade de pessoas que irão embarcar:");
						int embarqueAdicional = scanner.nextInt();
						navePassenger.embarcar(embarqueAdicional);
						System.out.println("Embarque realizado com sucesso. A Nave está transportando " + navePassenger.getNumeroPassageiros() + " pessoas");							
											
						break;
					}
					case 5: {
						System.out.println("Sua nave " + navePassenger.getNome() + " já percorreu " + distanciaPass + ". \nDigite uma nova jornada:");
						double distanciaAdicionalPass = scanner.nextDouble();
						navePassenger.viajar(distanciaAdicionalPass); //Método para atualizar o combustivel da nave
						distanciaPass = distanciaPass + distanciaAdicionalPass; 
						System.out.println(navePassenger.toString());
						break;
					}
					default:
						System.out.println("Opção inválida, desligando a nave\n");
						System.out.println(navePassenger.toString());
						System.exit(0);
						break;
					}
					
				}
			
			case 3: // Nave de Combate

				System.out.println("Você selecionou uma nave de Combate. Você irá atribuir todos os parâmetros da sua nave. \nDigite o nome da Nave: ");
				Scanner nameComb = new Scanner(System.in);
				String nomeComb = nameComb.nextLine();

				System.out.println("Digite o número de funcionários no interior da Nave:");
				int numeroTripulantesComb = scanner.nextInt();

				System.out.println("Digite o valor em litros de combustível no abastecimento:");
				double combustivelComb = scanner.nextDouble();

				NaveCombate naveGuerra = new NaveCombate(nomeComb, 0.0, 0, numeroTripulantesComb, combustivelComb,
						"teste",0);

				System.out.println("Digite a distância a percorrer: ");
				double distanciaComb = scanner.nextDouble();
				if (distanciaComb * 2 < combustivelComb) {

				} else {
					System.out.println("Quantidade de combustível é insuficiente para a viagem. \n Tente novamente.");
					break;
				}

				System.out.println("Digite a velocidade máxima da Nave: ");
				double velocidadeComb = scanner.nextDouble();

				naveGuerra.setVelocidadeMaxima(velocidadeComb);

				naveGuerra.viajar(distanciaComb); //Método para atualizar o combustivel da nave	

				System.out.println(naveGuerra.toString( ) + "\n");

				while (true) {
					System.out.println("Troque alguns parâmetros da sua nave" + naveGuerra.getNome() + ": \n1- Acelerar \n2- Desacelerar \n3- Abastecer \n4- Ver Armamento \n5- Atirar \n6- Nova Jornada");
					int opcaoUser = scanner.nextInt();

					switch (opcaoUser) {
					case 1: {
						naveGuerra.acelerar();
						System.out.println("Nave aumentou a velocidade para " + naveGuerra.getVelocidade() + " Km/h" );

						break;

					}
					case 2: {
						naveGuerra.desacelerar();
						System.out.println("Nave diminui a velocidade para " + naveGuerra.getVelocidade() + " Km/h" );
						break;
					}
					case 3: {
						System.out.println("Sua nave possui cerca de " + naveGuerra.combustivel + " litros. Digite a quantidade de abastecimento:");
						double abastecimento = scanner.nextDouble();
						naveGuerra.abastecer(abastecimento);
						System.out.println("Sua nave possui " + naveGuerra.combustivel + " litros de combustível. Faça uma boa viagem");
						break;
					}
					
					case 4: {
						System.out.println(naveGuerra.armamento() + "\n");
						
						break;
					}
						
					case 5: {
						System.out.println("Um inimigo foi avistado a frente. Deseja continuar com o ataque? \n1- Sim \n2- Não");
						int opcaoAtacar = scanner.nextInt();
						if (opcaoAtacar == 1) {
							System.out.println(naveGuerra.atacar() + "\n");
							System.out.println(naveGuerra.toString() + "\n");

						} else {
							System.out.println("Sua nave de guerra não atacou e foi destruída" + "\n");
							System.out.println(naveGuerra.toStringDestruida());
							break;
						}
						
						break;
					}
					case 6: {
						System.out.println("Sua nave " + naveGuerra.getNome() + " já percorreu " + distanciaComb + ". \nDigite uma nova jornada:");
						double distanciaAdicionalComb = scanner.nextDouble();
						naveGuerra.viajar(distanciaAdicionalComb); //Método para atualizar o combustivel da nave
						distanciaComb = distanciaComb + distanciaAdicionalComb; 
						System.out.println(naveGuerra.toString());
						break;
					}
					default:
						System.out.println("Opção inválida, desligando a nave\n");
						System.out.println(naveGuerra.toString());
						System.exit(0);
						break;
					}
					
				}



			}
		}

	}
}
