import java.util.Scanner;

public class ProgramaNome {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor, digite seu nome:");
		String nome = leitor.nextLine();
		System.out.println("Que legal que seu nome é: " + nome);
		leitor.close();
	}

}
