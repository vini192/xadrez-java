package xadrez.pecas;

import jogodetabuleiro.Tabuleiro;
import xadrez.Color;
import xadrez.PecadeXadrez;

public class Rei extends PecadeXadrez{

	public Rei(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "R";
	}

}
