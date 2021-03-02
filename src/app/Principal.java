package app;


import xadrez.PartidaXadrez;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PartidaXadrez partida = new PartidaXadrez();
		
		UI.printTabuleiro(partida.getPecas());
		
	}

}
	