package exercicios.aula19;

import java.util.Scanner;

/*Ler um vetor A com 20 elementos. Separar os elementos pares e
ímpares de A utilizando apenas um vetor extra B. Sugestão: no início
do vetor B armazene os elementos pares de A e nas posições
restantes do vetor B armazene os elementos de A que são ímpares.*/

public class Ex31 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		// int posicaoPar = 0;
		int posicaoB = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite a posição " + i + " : ");
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				vetorB[posicaoB] = vetorA[i];
				posicaoB++;

			}
		}
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				vetorB[posicaoB] = vetorA[i];
				posicaoB++;

			}
		}
		System.out.println("vetorA");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
		}
		System.out.println("");
		System.out.println("vetorB");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(" " + vetorB[i]);
		}

	}

}
