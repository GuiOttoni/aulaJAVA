package modelo;

public class Elevador 
{
	private int totalAndares;
	private int capacidadePessoas;
	private int andarAtual;
	private int qtdePessoas;
	
	public Elevador(){
		
	}

	public Elevador(int totalAndares, int capacidadePessoas, int andarAtual, int qtdePessoas) {
		super();
		this.totalAndares = totalAndares;
		this.capacidadePessoas = capacidadePessoas;
		this.andarAtual = andarAtual;
		this.qtdePessoas = qtdePessoas;
	}

	public void setAll(int totalAndares, int capacidadePessoas, int andarAtual, int qtdePessoas)
	{
		this.totalAndares = totalAndares;
		this.capacidadePessoas = capacidadePessoas;
		this.andarAtual = andarAtual;
		this.qtdePessoas = qtdePessoas;
	}
	
	public String getAll()
	{
		return "Elevador [totalAndares=" + totalAndares + ", capacidadePessoas=" + capacidadePessoas + ", andarAtual="
				+ andarAtual + ", qtdePessoas=" + qtdePessoas + "]";
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getQtdePessoas() {
		return qtdePessoas;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public void setQtdePessoas(int qtdePessoas) {
		this.qtdePessoas = qtdePessoas;
	}


}
