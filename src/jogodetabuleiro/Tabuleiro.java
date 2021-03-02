package jogodetabuleiro;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	public Tabuleiro(int linhas, int colunas) {
		if (linhas <1 || colunas <1) {
			throw new TabuleiroExcecao("Quantidade de linha e Colunas menores que 1");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		
		pecas = new Peca[linhas][colunas];
	}
	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Peca peca(int linha, int coluna) {
		if (!posicaoExistente(linha,coluna)) {
			throw new TabuleiroExcecao("Posição não existe!");
		}
		return pecas[linha][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		if (!posicaoExistente(posicao)) {
			throw new TabuleiroExcecao("Posição não existe!");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void ColocarPeca(Peca peca, Posicao posicao) {
		if(pecanaPosicao(posicao)) {
			throw new TabuleiroExcecao("Já tem uma peça na posição!");
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao; 
	}
	
	public boolean posicaoExistente(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >=0 && coluna< colunas;
		
	}
	
	public boolean posicaoExistente(Posicao posicao) {
		return posicaoExistente(posicao.getLinha(), posicao.getColuna());	
	}
	
	public boolean pecanaPosicao(Posicao posicao) {
		if (!posicaoExistente(posicao)) {
			throw new TabuleiroExcecao("Posição não existe!");
		}
		return peca(posicao) != null;
	}
}

