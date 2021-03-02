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
	
	private void iniciarPartida() {
		tabuleiro.ColocarPeca(new Tower(tabuleiro, Color.BRANCO), new Posicao(2,1));
		tabuleiro.ColocarPeca(new Rei(tabuleiro, Color.PRETO), new Posicao(0,4));
		tabuleiro.ColocarPeca(new Rei(tabuleiro, Color.BRANCO), new Posicao(7,4));
		
		
	}
}
