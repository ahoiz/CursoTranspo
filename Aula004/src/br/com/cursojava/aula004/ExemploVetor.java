package br.com.cursojava.aula004;

public class ExemploVetor {

	public static void main(String[] args) {

		int[] numeros = new int[3]; // por conven��o � mais comum colocar
									// colchetes no tipo
		String nomes[] = new String[5]; // mas pode colocar no nome tambem - n�o
										// esquecer de dimensionar, a capacidade
										// nao muda mais
		int[] notas = { 10, 9, 8 }; // sem o "new", pode utilizar apenas na
									// iniciali�ao da variavel
		String[] frutas = new String[] { "Banana", "Abacaxi",
				"Morango" }; /*
								 * com o new, pode usar sempre que quiser
								 * redeclarar
								 */
		frutas = new String[] { "Ma��", "Laranja", "Uva" };
		// notas = {10,10,10} -> da erro se quiser mudar o cont�do
		notas = new int[] { 10, 10, 10 }; // n�o da erro
		numeros[0] = 10;
		numeros[1] = 3;
		numeros[2] = 7;
		for (int i = 0; i < nomes.length; i++) {

			nomes[1] = "Nome " + (i + 1);

		}

		for (int i = 0; i < notas.length; i++) {
			int atual = notas[i];
			System.out.println(atual);
		}
		for (String atual : frutas) {
			System.out.println(atual);
		}

		for (String atual : frutas) {
			if (atual.equals("Laranja")) {
				System.out.println(atual);
			}
		}

	}

}
