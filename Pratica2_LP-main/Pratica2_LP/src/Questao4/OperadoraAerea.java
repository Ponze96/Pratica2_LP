package Questao4;

import java.util.Scanner;
import java.util.Random;

public class OperadoraAerea {

	Scanner scan = new Scanner(System.in);
	String Nome, CPF, dataVoo, horario;
	int Random;
	int numeroVoo;
	int opcao;
	int escolha = 0;
	
	do {	
		System.out.println("Escolha");
		System.out.println("1 - Cadastrar Passageiro");
		System.out.println("2 - Check in");
		System.out.println("3 - Cancelar Voo");
		System.out.println("4 - Sair");
		
		Scanner scan = new Scanner (System.in);
		opcao = scan.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println();("Digite seu nome");
			Nome = scan.next();
			System.out.println("Digite seu CPF");
		    CPF = scan.next();
			System.out.println(" Digite a data do Voo");
			dataVoo = scan.next();
			System.out.println(" Digite o horario");
			horario = scan.next();
			System.out.println("Cadastro efetuado com sucesso");
		}
}
