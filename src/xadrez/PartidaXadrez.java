package xadrez;

import jogodetabuleiro.Posicao;
import jogodetabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Tower;

public class PartidaXadrez {

	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8,8);
		iniciarPartida();
	}
	
	public PecadeXadrez[][] getPecas(){
		PecadeXadrez[][] mat = new PecadeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i=0; i<tabuleiro.getLinhas();i++) {
			for(int j=0; j<tabuleiro.getColunas();j++) {
				mat[i][j] = (PecadeXadrez) tabuleiro.peca(i, j);
			}
		}
		 
		return mat;
	}
	
	private void colocarNovaPeca(char coluna, int linha, PecadeXadrez peca) {
		tabuleiro.ColocarPeca(peca, new XadrezPosicao(coluna,linha).toPosicao());
	}
	
	private void iniciarPartida() {		
		colocarNovaPeca('c', 1, new Tower(tabuleiro, Color.BRANCO));
		colocarNovaPeca('c', 2, new Tower(tabuleiro, Color.BRANCO));
		colocarNovaPeca('d', 2, new Tower(tabuleiro, Color.BRANCO));
        colocarNovaPeca('e', 2, new Tower(tabuleiro, Color.BRANCO));
        colocarNovaPeca('e', 1, new Tower(tabuleiro, Color.BRANCO));
        colocarNovaPeca('d', 1, new Rei(tabuleiro, Color.BRANCO));

        colocarNovaPeca('c', 7, new Tower(tabuleiro, Color.PRETO));
        colocarNovaPeca('c', 8, new Tower(tabuleiro, Color.PRETO));
        colocarNovaPeca('d', 7, new Tower(tabuleiro, Color.PRETO));
        colocarNovaPeca('e', 7, new Tower(tabuleiro, Color.PRETO));
        colocarNovaPeca('e', 8, new Tower(tabuleiro, Color.PRETO));
        colocarNovaPeca('d', 8, new Rei(tabuleiro, Color.PRETO));
		
	}
}
