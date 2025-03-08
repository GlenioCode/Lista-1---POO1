import java.util.Scanner; // Importando a classe Scanner
class Questao07{
	public static void main (String[]args){
		//Faça um programa para calcular e exibir a área de um 
		//triângulo de base b e altura h
		// Fórmula: (area=(b*h)/2
		// A base e a altura devem ser fornecidas pelo usuário
		
		// Criando um objeto Scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos Calcular a Àrea de um Triângulo ! ! !");
		
		//Pergutando a base e a altura para o usuário
		System.out.print("Digite a base do Triângulo: ");
		double base = scanner.nextDouble();
		
		System.out.println("Digite a altura do Triângulo: ");
		double altura = scanner.nextDouble();
		
		//Calculando a área do triângulo
		
		double area = (base*altura)/2;
		
		//Exibindo a área do triângulo
		
		System.out.println("A Área do Triângulo é: " + area);
		
		//
		
	}
}