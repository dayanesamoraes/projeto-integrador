package model;
public class Pesquisa {
	//ATRIBUTOS
	private String nome;
	private String telefone;
	private String endereco;
	private PesquisaCandidato busca;//relação com classe PesquisaCandidato, calcular voto
	//CONSTRUTOR
	public Pesquisa(String nomeEntrevistado, PesquisaCandidato voto) {
		this.nome = nomeEntrevistado;
		busca = voto;
	}
	//METODO GET E SET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public PesquisaCandidato getBusca() {
		return busca;
	}
	public void setBusca(PesquisaCandidato busca) {
		this.busca = busca;
	}
	
	
}