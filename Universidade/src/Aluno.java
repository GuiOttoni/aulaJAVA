
public class Aluno 
{
	private String nome;
	private String cpf;
	private int rm;
	private Endereco endereco;

	public Aluno(String _nome, String _cpf, int _rm)
	{
		nome = _nome;
		cpf = _cpf;
		rm = _rm;
	}
	
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public int getRm() {
		return rm;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", cpf=" + cpf + ", rm=" + rm + ", endereco=" + endereco + "]";
	}
	
}
