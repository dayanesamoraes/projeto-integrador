public class Pesquisa {
	private String nome;
	private String cpf;
	private String Telefone;
	private String Endereco;
	private Pesquisa_Candidato Busca;
		
	
	public Pesquisa(String nome, Pesquisa_Candidato busca) {
		this.nome = nome;
		Busca = busca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public Pesquisa_Candidato getBusca() {
		return Busca;
	}
	public void setBusca(Pesquisa_Candidato busca) {
		Busca = busca;
	}
	


}