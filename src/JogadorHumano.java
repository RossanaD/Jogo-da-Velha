import java.util.Scanner;
public class JogadorHumano extends Jogador {


	public JogadorHumano(char id) {
		super('X');
	}
	
	public int[] jogar() {
		Scanner teclado = new Scanner(System.in);
		int[] vet = new int[2];
		System.out.println("Digite a Linha:");
		vet[0] = teclado.nextInt();
		System.out.println("Digite a Coluna:");
		vet[1] = teclado.nextInt();
		
		return vet;
		
	}
}
