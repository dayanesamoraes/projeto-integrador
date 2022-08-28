public class Candidato {
	private String Nome;
	private String Partido;
	private int Numero;
		
	public Candidato(String nome, String partido, int numero) {
		Nome = nome;
		Partido = partido;
		Numero = numero;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getPartido() {
		return Partido;
	}
	public void setPartido(String partido) {
		Partido = partido;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	
	

}
