package Builders;

import modelo.Elevador;

public class ElevadorBuilder 
{
	private int totalAndares;
	private int capacidadePessoas;
	private int andarAtual;
	private int qtdePessoas;

	public ElevadorBuilder setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
		return this;
	}
	public ElevadorBuilder setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
		return this;
	}
	public ElevadorBuilder setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
		return this;
	}
	public ElevadorBuilder setQtdePessoas(int qtdePessoas) {
		this.qtdePessoas = qtdePessoas;
		return this;
	}
	
	public Elevador Build(){
		return new Elevador(this.totalAndares,
							this.capacidadePessoas,
							this.andarAtual,
							this.qtdePessoas);
	}

	
	
	
}
