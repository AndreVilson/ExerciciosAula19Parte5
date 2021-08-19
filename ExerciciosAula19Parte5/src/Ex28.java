package exercicios.aula19;

import java.util.Scanner;

/*Ler um vetor A com 10 elementos e construir um vetor B de mesmo
tipo e tamanho e com os mesmos elementos de A, sendo que estes
deverão estar invertidos, ou seja, o primeiro elemento de A passa a
ser o último de B, o segundo elemento de A passa a ser o penúltimo
de B e assim por diante.*/
public class Ex28 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite a posição " + i + " : ");
			vetorA[i] = scan.nextInt();

			vetorB[vetorA.length - i - 1] = vetorA[i];
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
