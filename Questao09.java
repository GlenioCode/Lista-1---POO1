/*Desenvolva um programa que receba o valor dos catetos de um 
triângulo, calcule e mostre o valor da hipotenusa. */ 

import java.util.Scanner; // Importando a classe Scanner
class Questao09{
	public static void main (String[]args){
		
		//Criando um objeto Scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vamaos Calcular o Valor da Hipotenosa ! ! !");
		
		//Perguntando o valor do primeiro cateto
		System.out.print("Digite o valor do primeiro cateto: ");
		int cateto1 = scanner.nextInt();
		
		//Perguntando o valor do segundo cateto
		System.out.print("Digite o valor do segundo cateto: ");
		int cateto2 = scanner.nextInt();
		
		//Calculando o valor da hipotenusa
		//Fórmula: c^2 = a^2 + b^2
		// c: raiz quadrada a^2 + b^2
		
		double hipotenusa = Math.pow((cateto1 * cateto1) + (cateto2 * cateto2), (1.0 / 2.0));
		//int c = hipotenusa * hipotenusa;
		
		// Exibindo dados
		System.out.println("O Valor da Hipotenusa é: " + hipotenusa);
		
		
	}
}
 