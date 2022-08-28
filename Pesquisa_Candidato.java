public class Pesquisa_Candidato {
	private int NumeroVotos;	
	private Candidato Candidato;
	
	public Pesquisa_Candidato(int numeroVotos, Candidato candidato) {
		NumeroVotos = numeroVotos;
		Candidato = candidato;
	}	
	
	public int getNumeroVotos() {
		return NumeroVotos;
	}
	public void setNumeroVotos(int numeroVotos) {
		NumeroVotos = numeroVotos;
	}
	public Candidato getCandidato() {
		return Candidato;
	}
	public void setCandidato(Candidato candidato) {
		Candidato = candidato;
	}
	

}