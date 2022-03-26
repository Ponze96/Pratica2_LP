package Questao1;
import java.util.Scanner;
public class Versao2 {

	public static void main1(String[] args) {
		Scanner ler = new Scanner(System.in);
		int op;
		
		System.out.println("Selecione a opção de pagamento ");
        System.out.println("1 - Á Vista");
        System.out.println("2 - 2 Vezes");
        System.out.println("3 - 3 Vezes");
        
	 }

    float aVista(float vlr) {
        System.out.println("Total R$: " + vlr);
        System.out.println("Total a pagar R$: " + vlr * 0.9);
		return vlr; 	

	}

	float duasVezes(float vlr) {
	    System.out.println("Total R$: " + vlr);
	    System.out.println("Total a pagar R$: " + vlr / 2);
		return vlr;
	}

	            
}

