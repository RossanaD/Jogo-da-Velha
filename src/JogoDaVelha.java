import java.util.Scanner;
public class JogoDaVelha extends JogoDeTabuleiro {
	

public JogoDaVelha(){
	super(3,'#');
	}

public boolean venceu(char idJogador) {
		boolean venceu = false;
		//horizontal
		for(int i=0;i<3;i++) {
			if(tabuleiro.getPeca(i, 0)==idJogador&&tabuleiro.getPeca(i, 1)==idJogador&&tabuleiro.getPeca(i, 2)==idJogador) {
					System.out.println("Vencedor é "+idJogador);
					venceu = true;
					break;
				}
			
		}
		//vertical
		for(int j=0;j<3;j++) {
			if(tabuleiro.getPeca(0, j)==idJogador&&tabuleiro.getPeca(1, j)==idJogador&&tabuleiro.getPeca(2, j)==idJogador) {
				System.out.println("Vencedor é "+idJogador);
				venceu = true;
				break;
			}		
		}
		//Diagonal para esquerda pra direita
		
		if(tabuleiro.getPeca(0, 0)==idJogador&&tabuleiro.getPeca(1, 1)==idJogador&&tabuleiro.getPeca(2, 2)==idJogador) {
			System.out.println("Vencedor é "+idJogador);
			venceu = true;
			
		}

		
		//diagonal direita pra esquerda
		if(tabuleiro.getPeca(0, 2)==idJogador&&tabuleiro.getPeca(1, 1)==idJogador&&tabuleiro.getPeca(2, 0)==idJogador) {
			System.out.println("Vencedor é "+idJogador);
			venceu = true;
			
		}
		
		if(tabuleiro.getQtPecas()==9) {
			System.out.println("Deu Velha");
			venceu = true;
		}
		
		return venceu;
	}
private void jogar(Jogador jogador) {
	
}
public void jogar() {
	int i;
	int j;
	Scanner teclado = new Scanner(System.in);
	tabuleiro.inicializarTabuleiro();
	boolean vence = false;
	System.out.println("");
	while(vence != true || tabuleiro.getQtPecas() == 9) {
		//while(adicionarpeca != true) {
			//i = (int) ((Math.random() * 3) - 0);
			//j = (int) ((Math.random() * 3) - 0);
			//if(tabuleiro.getPeca(i, j)=='#'&&tabuleiro.getPeca(i, j)!='X'&&tabuleiro.getPeca(i, j)!='O') {
				//tabuleiro.adicionarPeca('O', i, j);
				//adicionarpeca = true;
				//System.out.println("Jogadas do Jogador Virtual");
				//System.out.println("Linha: "+i);
				//System.out.println("Coluna: "+j);
				//tabuleiro.toString();
				//System.out.println("");
			//}
		//}
		System.out.println("Jogador: O ");
		System.out.println("Digite a Linha:");
		i = teclado.nextInt();
		System.out.println("Digite a Coluna:");
		j = teclado.nextInt();
		tabuleiro.adicionarPeca('O', i, j);
		System.out.println("Jogadas do Jogador O");
		System.out.println("Linha: "+i);
		System.out.println("Coluna: "+j);
		tabuleiro.toString();
		System.out.println("");
		vence = venceu('O');
		System.out.println("Vez do Jogador X");
		System.out.println("Digite a Linha:");
		i = teclado.nextInt();
		System.out.println("Digite a Coluna:");
		j = teclado.nextInt();
		tabuleiro.adicionarPeca('X', i, j);
		System.out.println("Jogadas do Jogador X");
		System.out.println("Linha: "+i);
		System.out.println("Coluna: "+j);
		tabuleiro.toString();
		System.out.println("");
		vence = venceu('X');
		
	}

}
}
