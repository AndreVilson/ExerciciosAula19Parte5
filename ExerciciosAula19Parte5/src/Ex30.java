package exercicios.aula19;

import java.util.Scanner;

/*Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo
que nos vetor B e C serão armazenados o valores pares e ímpares de
A, respectivamente.*/

public class Ex30 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite a posição " + i + " : ");
			vetorA[i] = scan.nextInt();
		}

		int posicaoB = 0;
		int posicaoC = 0;

		System.out.println("vetorA");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);

			if (vetorA[i] % 2 == 0) {
				vetorB[posicaoB] = vetorA[i];
				posicaoB++;
			} else {
				vetorC[posicaoC] = vetorA[i];
				posicaoC++;
			}
		}

		System.out.println(" ");
		System.out.println("vetorB");
		for (int i = 0; i < posicaoB; i++) {
			System.out.print(" " + vetorB[i]);
		}
		System.out.println(" ");
		System.out.println("vetorC");
		for (int i = 0; i < posicaoC; i++) {
			System.out.print("  " + vetorC[i]);
		}

	}

}
