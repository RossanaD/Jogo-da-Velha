
public class JogadorVirtual extends Jogador {

	public JogadorVirtual(char id) {
		super('O');
	}
	
	public int inteligencia() {
		int inteligencia;
		inteligencia = (int) ((Math.random() * 3) - 0);
		return inteligencia;
	}
	
	public int[] jogar() {
		int[] vetvirtual = new int[2];
		vetvirtual[0] = inteligencia();
		vetvirtual[1] = inteligencia();
		return vetvirtual;
		
	}
}
