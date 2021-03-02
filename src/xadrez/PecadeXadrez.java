package xadrez;

import jogodetabuleiro.Peca;
import jogodetabuleiro.Tabuleiro;

public class PecadeXadrez extends Peca{
	
	private Color color;

	public PecadeXadrez(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	

}
