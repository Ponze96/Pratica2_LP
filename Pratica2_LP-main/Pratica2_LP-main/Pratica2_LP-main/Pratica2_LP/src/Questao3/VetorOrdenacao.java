package Questao3;
import java.util.Scanner;
public class VetorOrdenacao {

	public static void main(String[] args) {
		int[] vetor = new int [10];
		int aux;
		Scanner entrada = new Scanner(System.in);
		for (int i=0;i<10;i++) {
			System.out.printf("\nDigite Posicao =%d", i+1);
		vetor[1] = entrada.nextInt();
	}
			for(int i=0; i<10; i++) {
				for(int j=0; j<9; j++) {
					if(vetor[j]> vetor[j+1]) {
						aux=vetor[j];
						vetor[j] = vetor [j+1];
						vetor[j+1] = aux;
					}
				}
			}

	}

}
