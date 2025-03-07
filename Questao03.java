import java.util.Scanner; // Importando a classe Scanner
class Questao03{
	public static void main (String[]args){
		// Criando um objeto Scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos Calcular a Média Aritmética das Suas Notas !!!");
		
		// Perguntando a primeira nota ao usuário
		System.out.print("Digite a primeira nota: ");
		int n1 = scanner.nextInt(); // Lê uma linda de texto (n1)
		
		//Pergutando a segunda nota ao usuário
		System.out.print("Digite a segunda nota: ");
		int n2 = scanner.nextInt(); // Lê uma linha de texto (n2)
		
		//Perguntando a terceira nota ao usuário
		System.out.print("Digite a teceira nota: ");
		int n3 = scanner.nextInt(); // Lê uma linha de texto (n3)
		// Calculando a média aritimética das notas
		
		int media = n1 + n2 + n3 / 3;
		
		// Exibindo a média arimética da nota do usuário
		
		System.out.println("Sua Média Aritmética é: " + media);
		
		
	}
}