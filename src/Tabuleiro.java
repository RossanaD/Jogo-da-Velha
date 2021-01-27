
public class Tabuleiro {

	private char pecaDefault = '#';
	private char[][] tabuleiro;
	private int QtPecas;
	

public Tabuleiro(int dimencaoDoTabuleiro, char pecaDefault) {
	tabuleiro = new char[dimencaoDoTabuleiro][dimencaoDoTabuleiro];
}

public boolean adicionarPeca(char peca, int i, int j) {
	boolean adicionarpeca = false;
	
				tabuleiro[i][j] = peca;
				adicionarpeca = true;	
		
	return adicionarpeca;	
}

public void removerPeca(int i, int j) {
	tabuleiro[i][j] = '#';
}

public void inicializarTabuleiro() {
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			tabuleiro[i][j] = pecaDefault;
			System.out.print("|"+tabuleiro[i][j]+"|");
		}
		System.out.println("");
	}
}

public String toString() {
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print("|"+tabuleiro[i][j]+"|");
		}
		System.out.println("");
	}
	return tabuleiro.toString();
}

public char getPeca(int i, int j) {
	
	return tabuleiro[i][j];

	
}

public int getQtPecas() {
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			if(tabuleiro[i][j] == 'X' || tabuleiro[i][j] == 'O') {
				QtPecas += 1;
			}
		}
	}
	return QtPecas;
	
	
}
}
