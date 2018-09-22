package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe seu salário:");
		
		double salario = Double.parseDouble(teclado.nextLine());
		double descontoInss = salario * 0.11;
		double salarioAposInss = salario * 0.89;
		double aliquotaIr = 0;
		double salarioLiquido = 0;
		double descontoIrValor = 0;
		
		if (salarioAposInss >= 1800) {
			
			if (salarioAposInss <= 2400) {
				
				aliquotaIr = 7.5;
								
			} else if (salarioAposInss <= 3600) {
				
				aliquotaIr = 24;
				
			} else {
				
				aliquotaIr = 32;
				
			}
			
		} 
		
		descontoIrValor = salarioAposInss * aliquotaIr / 100;
		salarioLiquido = salarioAposInss - descontoIrValor;
		 
		System.out.printf("Salario inicial R$%.2f, desconto INSS R$%.2f, percental desconto IRPF %.2f%% - R$%.2f, salário líquido: %.2f.\n", salario, descontoInss, aliquotaIr, descontoIrValor, salarioLiquido);

		teclado.close();

	}

}
