package Questao2;
import java.util.Scanner;
public class MatrizDiagonal {
	 public static void main (String[] args){
		 int[] [] vetor = new int [4][4];
		 int impar = 1;
		 
		 for(int i=0; i<4; i++)
		 {
			for(int j=0;j<4; j++)
			{
				vetor[i][j] = impar;
				
				if(i==j)
					System.out.printf("%d\t", vetor[i][j]);
				else
					System.out.printf("O\t");
				impar += 2;
			}
				
			System.out.printf("\n");		
		 
		 
	   
	 }
}
}
	

