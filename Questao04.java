import java.util.Scanner; // importando a classe scanner
class Questao04{
	public static void main (String[]args){
		
		// criando um objeto scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vamos Calcular a Média Ponderada das Suas Notas ! ! !");
		//perguntando as notas do usuário
		System.out.print("Digite a primeira nota: ");
		int n1 = scanner.nextInt();
		
		System.out.print("Digite a segunda nota: ");
		int n2 = scanner.nextInt();
		
		System.out.print("Digite a terceira nota: ");
		int n3 = scanner.nextInt();
		
		// pesos das notas (peso maior na primeira nota, simulando um início mais importante)
		
		int peso1 = 5;
		int peso2 = 3;
		int peso3 = 2;
		
		//média ponderada
		
		int mediaponderada = (n1*peso1) + (n2*peso2) + (n3+peso3)/ peso1 + peso2 + peso3;
		
		//exibindo dados
		System.out.println("Sua Média Ponderada é de: " + mediaponderada);
		
		
	}
	
}