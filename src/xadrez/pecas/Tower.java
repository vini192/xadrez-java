package xadrez.pecas;

import jogodetabuleiro.Tabuleiro;
import xadrez.Color;
import xadrez.PecadeXadrez;

public class Tower extends PecadeXadrez{

	public Tower(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
		
	}
	
	@Override
	public String toString() {
		return "T";
	}

}
