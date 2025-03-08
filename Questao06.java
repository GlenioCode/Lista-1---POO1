import java.util.Scanner; // Imporatando a classe Scanner
class Questao06{
	public static void main (String[]args){
		
		//Criando um objeto Scanner para Ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos Calcular a Àrea de Uma Circunferência ! ! !");
		
		//Faça um programa para calcular e exibir a área de uma circunferência
		// Fórmula: A= 3,14(pi) * Raio^2
		// O raio deve ser fornecido pelo usuário.
		
		// Perguntando o valor do Raio ao usuário
		System.out.println("Digite o valor do Raio: ");
		double raio = scanner.nextDouble(); // Lê um número  (raio)
		
		//Calculando a Àrea da Circunferência
		
		double area = 3.14 * raio  * raio;
		
		//Exibindo o resultado
		
		System.out.println("A Àrea da Circunferência é de: " + area);
		
		
	
		
	}
}