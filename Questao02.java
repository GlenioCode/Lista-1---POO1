import java.util.Scanner; // Importando a classe Scanner
class Questao02{
	public static void main (String[]args){
		// Criando um objeto Scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos somar quatro números inteiros");
		
		// perguntando o primeiro número
		System.out.print("Digite o primeiro número: ");
		int numero1 = scanner.nextInt();
		
		// perguntando o segundo número
		System.out.print("Digite o segundo número: ");
		int numero2 = scanner.nextInt();

		// perguntando o terceiro número
		System.out.print("Digite o terceiro número: ");
		int numero3 = scanner.nextInt();
		
		
		// perguntando o quarto número
		System.out.print("Digite o quarto número: ");
		int numero4 = scanner.nextInt();
		
		// somando os números
		
		int soma = numero1 + numero2 + numero3 + numero4;
		
		// Exibindo a soma total
		System.out.println("A soma dos números é: " + soma);
		
	
	}
}