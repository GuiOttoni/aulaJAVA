package modelo;

public class Produto {
	private int codigo;
	private double valor;
	private String descricao;
	private Fornecedor fabricante;
	public String getAll(){
		return codigo + "\n" +
				valor + "\n" + 
				descricao + "\n" + 
				fabricante.getAll();
	}
	public void setAll(int codigo, double valor, String descricao, Fornecedor fabricante) {
		this.codigo = codigo;
		this.valor = valor;
		this.descricao = descricao;
		this.fabricante = fabricante;
	}
	public Produto(int codigo, double valor, String descricao, Fornecedor fabricante) {
		super();
		this.codigo = codigo;
		this.valor = valor;
		this.descricao = descricao;
		this.fabricante = fabricante;
	}
	
	public Produto(int codigo, double valor, String descricao)
	{
		super();
		this.codigo = codigo;
		this.valor = valor;
		this.descricao = descricao;
		this.fabricante = new Fornecedor();
	}
	
	public Produto() {
		super();
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Fornecedor getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fornecedor fabricante) {
		this.fabricante = fabricante;
	}

	
	public double getDesconto()
	{
		return this.valor * 0.9;
	}
	
	public void setBasico(String _descricao, double _valor)
	{
		this.descricao = _descricao;
		this.valor = _valor;
	}
	
	public String getBasico()
	{
		return	"Valor: " + valor + "\n" + 
				"Descri��o: " + descricao + "\n";
	}
	
	public String atualizar(double aumento)
	{

		this.valor = valor*(1+(aumento/100)); 
		return "Valor atualizado! (" + valor + ")\n";
	}
}
