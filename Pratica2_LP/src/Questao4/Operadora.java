package Questao4;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

    public class Operadora {
        public static void main(String[] args) {
            String nomPassageiro, horas, numCpf, dataVoo;
            int options=0, numVoo, numPoltrona;
            int [] poltrona = new int [100];

            Scanner ler = new Scanner(System.in);
            Random aleatorio = new Random();

            while (options!=4){
                System.out.println("O que deseja fazer: \n1 � Cadastrar Passageiro \n2 � Check-in \n3 � Cancelar Voo \n4 � Sair");
                options=ler.nextInt();

                if(options == 1){
                    System.out.println("Informe o seu nome: ");
                    nomPassageiro = ler.next();
                    System.out.println("Informe o seu CPF: ");
                    numCpf = ler.next();
                    System.out.println("Informe a data do seu voo: ");
                    dataVoo = ler.next();
                    System.out.println("Informe o hor�rio do seu voo: ");
                    horas = ler.next();
                    System.out.println("Cadastro realizado com sucesso!");
                    System.out.println(nomPassageiro +" o numero do seu voo � " + aleatorio.nextInt(999));
                    System.out.print("");
                    System.out.println("----------------------------------------------------------------");
                    //break;
                }else if(options == 2){
                    System.out.println("Informe o seu CPF: ");
                    numCpf = ler.next();
                    System.out.println("Informe o n�mero do seu voo: ");
                    numVoo = ler.nextInt();
                    System.out.println("Informe a sua poltrona: ");
                    numPoltrona = ler.nextInt();
                  while(poltrona[numPoltrona-1] == numPoltrona){
                    System.out.println("Poltrona ja ocupada");
                    System.out.println("Informe um novo numero para sua poltrona: ");
                    numPoltrona = ler.nextInt();
                  }
                  poltrona[numPoltrona-1] = numPoltrona;
                  System.out.println("Check-in realizado com sucesso!");
                  System.out.print("");
                  System.out.println("----------------------------------------------------------------");
                }else if(options == 3){
                  System.out.println("Informe o seu CPF: ");
                  numCpf = ler.next();
                  System.out.println("Informe o n�mero do seu voo: ");
                  numVoo = ler.nextInt();
                  System.out.println("Informe a sua poltrona: ");
                  numPoltrona = ler.nextInt();
                  while(numPoltrona <= 100){
                  if(poltrona[numPoltrona-1] == numPoltrona){
                  poltrona[numPoltrona-1] = poltrona[0];
                  System.out.println("Voo cancelado com sucesso!");
                  break;
                  }else
                  System.out.println("Poltrona n�o possui nenhum passageiro cadastrado, informe o n�mero correto: ");
                  numPoltrona = ler.nextInt();
                  }
                  System.out.print("");
                  System.out.println("----------------------------------------------------------------");
                }else if(options == 4){
                    System.out.println("Opera��o finalizada com sucesso!");
                    System.out.print("");
                    System.out.println("----------------------------------------------------------------");
                }else{
                    System.out.println("Op��o invalida!");
                    System.out.print("");
                    System.out.println("----------------------------------------------------------------");
                }
            }
        }
    }