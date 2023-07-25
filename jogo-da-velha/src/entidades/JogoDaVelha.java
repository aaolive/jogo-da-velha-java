package entidades;

public class JogoDaVelha {

	private String[][] tabuleiro = new String[3][3];

	// instancia os jogadores
	private Jogador jogadorDaPecaX = new Jogador();
	private Jogador jogadorDaPecaO = new Jogador();

	// instancia peca
	private Peca pecaX = new Peca("X");
	private Peca pecaO = new Peca("O");

	private boolean oJogoTemUmGanhador = false;
	private Jogador jogadorVencedor;

	public void vericarQualJogadorGanhou() {

		boolean pecaXApareceuNaLinha3Vezes = false;
		boolean pecaOApareceuNaLinha3Vezes = false;

		int numeroDevezesQuePecaXapareceuNaLinha = 0;
		int numeroDevezesQuePecaOapareceuNaLinha = 0;

		int numeroDeVezesQuePecaXApareceuNaColuna = 0;
		int numeroDeVezesQuePecaOApareceuNaColuna = 0;

		// verifica quem marcou ponto na mesma linha
//		for (int l = 0; l < tabuleiro.length; l++) {
//
//			// zera ocontador para as duas peças para cada linha
//			numeroDevezesQuePecaOapareceuNaLinha = 0;
//			numeroDevezesQuePecaXapareceuNaLinha = 0;
//
//			for (int c = 0; c < tabuleiro[l].length; c++) {
//
//				// conta quantas vezes a peca apaceu na linha
//				if (tabuleiro[l][c] == pecaX.getTipoDaPeca()) {
//
//					numeroDevezesQuePecaXapareceuNaLinha++;
//				} else if (tabuleiro[l][c] == pecaO.getTipoDaPeca()) {
//					numeroDevezesQuePecaOapareceuNaLinha++;
//				}
//
//				// define o jogador vencedor
//				if (numeroDevezesQuePecaOapareceuNaLinha == 3) {
//					jogadorVencedor = jogadorDaPecaO;
//					oJogoTemUmGanhador = true;
//				} else if (numeroDevezesQuePecaXapareceuNaLinha == 3) {
//					jogadorVencedor = jogadorDaPecaX;
//					oJogoTemUmGanhador = true;
//				}
//			}
//		}
		
		
		// Outra forma de verificar quem marcou ponto na linha,
		// aqui verifica para peça X
		if (tabuleiro[0][0]=="X" && tabuleiro[0][1]=="X" &&tabuleiro[0][2]=="X") {
			jogadorVencedor=jogadorDaPecaX;
			oJogoTemUmGanhador=true;
		}else if (tabuleiro[1][0]=="X" && tabuleiro[1][1]=="X" &&tabuleiro[1][2]=="X") {
			jogadorVencedor=jogadorDaPecaX;
			oJogoTemUmGanhador=true;
		}else if (tabuleiro[2][0]=="X" && tabuleiro[2][1]=="X" &&tabuleiro[2][2]=="X") {
			jogadorVencedor=jogadorDaPecaX;
			oJogoTemUmGanhador=true;
		}
		// aqui verifica para peça O
		if (tabuleiro[0][0]=="O" && tabuleiro[0][1]=="O" &&tabuleiro[0][2]=="O") {
			jogadorVencedor=jogadorDaPecaO;
			oJogoTemUmGanhador=true;
		}else if (tabuleiro[1][0]=="O" && tabuleiro[1][1]=="O" &&tabuleiro[1][2]=="O") {
			jogadorVencedor=jogadorDaPecaO;
			oJogoTemUmGanhador=true;
		}else if (tabuleiro[2][0]=="O" && tabuleiro[2][1]=="O" &&tabuleiro[2][2]=="O") {
			jogadorVencedor=jogadorDaPecaO;
			oJogoTemUmGanhador=true;
		}
		

		// conta as marcações de peças para a coluna
		// na coluna 1, 2 e 3 para peça X
//		if (tabuleiro[0][0] == "X" || tabuleiro[1][0] == "X" || tabuleiro[2][0] == "X") {
//
//			numeroDeVezesQuePecaXApareceuNaColuna++;
//		} else if (tabuleiro[0][1] == "X" || tabuleiro[1][1] == "X" || tabuleiro[2][1] == "X") {
//			numeroDeVezesQuePecaXApareceuNaColuna++;
//		} else if (tabuleiro[0][2] == "X" || tabuleiro[1][2] == "X" || tabuleiro[2][2] == "X") {
//			numeroDeVezesQuePecaXApareceuNaColuna++;
//		}
//		// aqui na coluna 1, 2 e 3 para a peça O
//		if (tabuleiro[0][0] == "O" || tabuleiro[1][0] == "O" || tabuleiro[2][0] == "O") {
//			numeroDeVezesQuePecaOApareceuNaColuna++;
//		} else if (tabuleiro[0][1] == "O" || tabuleiro[1][1] == "O" || tabuleiro[2][1] == "O") {
//			numeroDeVezesQuePecaOApareceuNaColuna++;
//		} else if (tabuleiro[0][2] == "O" || tabuleiro[1][2] == "O" || tabuleiro[2][2] == "O") {
//			numeroDeVezesQuePecaOApareceuNaColuna++;
//		}

		// Verifica quem marcou ponto na coluna inteira,
		// aqui para X
		if (tabuleiro[0][0] == "X" && tabuleiro[1][0] == "X" && tabuleiro[2][0] == "X") {
			jogadorVencedor = jogadorDaPecaX;
			oJogoTemUmGanhador = true;
		} else if (tabuleiro[0][1] == "X" && tabuleiro[1][1] == "X" && tabuleiro[2][1] == "X") {
			jogadorVencedor = jogadorDaPecaX;
			oJogoTemUmGanhador = true;
		} else if (tabuleiro[0][2] == "X" && tabuleiro[1][2] == "X" && tabuleiro[2][2] == "X") {
			jogadorVencedor = jogadorDaPecaX;
			oJogoTemUmGanhador = true;
		}
		// aqui para O
		if (tabuleiro[0][0] == "O" && tabuleiro[1][0] == "O" && tabuleiro[2][0] == "O") {
			jogadorVencedor = jogadorDaPecaO;
			oJogoTemUmGanhador = true;
		} else if (tabuleiro[0][1] == "O" && tabuleiro[1][1] == "O" && tabuleiro[2][1] == "O") {
			jogadorVencedor = jogadorDaPecaO;
			oJogoTemUmGanhador = true;
		} else if (tabuleiro[0][2] == "O" && tabuleiro[1][2] == "O" && tabuleiro[2][2] == "O") {
			jogadorVencedor = jogadorDaPecaO;
			oJogoTemUmGanhador = true;
		}

	}
	
	// Metodo para iniciar o jogo
	

}
