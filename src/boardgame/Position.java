package boardgame;

public class Position {
	
	private Integer linha, coluna;
	
	
		// Constructor
	public Position(Integer linha, Integer coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	
		// Getters and Setters
	public Integer getLinha() {
		return linha;
	}

	public Integer getColuna() {
		return coluna;
	}

	
		// Method
	public void setValues(Integer linha, Integer coluna) {
		this.coluna = coluna;
		this.linha = linha;
	}


	@Override
	public String toString() {
		return linha + ", " + coluna;
	}
	
}
