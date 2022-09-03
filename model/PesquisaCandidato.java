package model;
public class PesquisaCandidato {
	//ATRIBUTOS
	private int numeroVotos;	
	private Candidato candidato; //relação classe candidato
	private Pesquisa pesquisa; //relação classe pesquisa
	//CONSTRUTOR
	public PesquisaCandidato(int numeroVoto, Candidato candidatos) {
		numeroVotos = numeroVoto;
		candidato = candidatos;
	}
	//METODO GET E SET
	public int getNumeroVotos() {
		return numeroVotos;
	}
	public void setNumeroVotos(int numeroVotos) {
		this.numeroVotos = numeroVotos;
	}
	public Candidato getCandidato() {
		return candidato;
	}
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	public Pesquisa getPesquisa() {
		return pesquisa;
	}
	public void setPesquisa(Pesquisa pesquisa) {
		this.pesquisa = pesquisa;
	}
	
	
}