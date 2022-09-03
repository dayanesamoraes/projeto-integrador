package model;


public class Candidato {
	//ATRIBUTOS
	private String nome;
	private String partido;
	private int numero;
	//CONSTRUTOR	
	public Candidato(String nomeCandidato, String partidoCandidato, int numeroCandidato) {
		nome = nomeCandidato;
		partido = partidoCandidato;
		numero = numeroCandidato;
	}
	//METODO GET E SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	

}