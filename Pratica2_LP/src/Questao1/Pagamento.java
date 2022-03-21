package Questao1;
import java.util.Scanner;
public class Pagamento {
	
	Scanner ler = new Scanner(System.in);
	static int op() {

        Scanner ler = new Scanner(System.in);
        int op;
        

        System.out.println("Selecione a opção de pagamento ");
        System.out.println("1 - Á Vista");
        System.out.println("2 - 2 Vezes");
        System.out.println("3 - 3 Vezes");

        op = ler.nextInt();
        System.out.println("Total gasto pelo cliente\n");
        return (op);
    }

    float aVista(float vlr) {
        System.out.println("Total R$: " + vlr);
        System.out.println("Total a pagar R$: " + vlr * 0.9);

        return (0);
    }

    float duasVezes(float vlr) {
        System.out.println("Total R$: " + vlr);
        System.out.println("Total a pagar R$: " + vlr / 2);

        return (0);
    }

    float tresVezes(float vlr) {

        int parcelas;

        System.out.println("Total R$: " + vlr);

        do {

            System.out.println("Informe a quantidade de parcelas :\n");
            parcelas = ler.nextInt();

        } while ((parcelas > 6) || (parcelas < 3));

        System.out.println("Parcelas de R$:\n " + parcelas + (vlr * 1.03) / parcelas);

        return (0);

    }

    public static void main(String[] args) {

        Scanner ler1 = new Scanner(System.in);

        float vlrCompra;
        int opcao;

        System.out.println("Informe o total da compra: \n");
        vlrCompra = ler1.nextFloat();

        System.out.println("Escolha nova forma de pagamento\n");
      
        
        switch(op()) {
        int op = op();
                
            case 1:
                System.out.println("Pagamento a vista: \n");
                vlrCompra = ler.nextFloat();
                break;

        
        }

    }

}

