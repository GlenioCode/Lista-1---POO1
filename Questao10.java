/*Essa questão pede para calcular o 
preço de um produto após aplicar um desconto de 10% */

import java.util.Scanner; // Importando a classe Scanner
class Questao10{
	public static void main(String[]args){
		
		//Criando um objeto Scanner para Ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		
		//Perguntando o preço original do produto ao usuário
		System.out.print("Digite o Preço do Produto: ");
		double precoOriginal = scanner.nextDouble();
		
		//O programa calcula 10% de desconto, ou seja, multiplica o preço por 0.10
		
		double desconto = 0.10;
		double precoDesconto = precoOriginal * desconto;
		
		//Fórmula: novo preço = preço original - (preço original * 0.10)
		double novopreco = precoOriginal - precoDesconto;
		
		//Exibindo o novo valor
		System.out.println("O Preço com Desconto é: " + novopreco);
		
	}
}