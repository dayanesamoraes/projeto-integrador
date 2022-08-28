
public class main {
	public static void main(String[] args) {
		
		Candidato candidato = new Candidato("João","TCTC", 69);
		
		Pesquisa_Candidato Busca1 = new Pesquisa_Candidato(132, candidato);
		
		Pesquisa pesquisa1 = new Pesquisa("Deyvison", Busca1);
		
		
		System.out.println("Pesquisa Eleitoral\n");
		System.out.println("Candidato: " + pesquisa1.getBusca().getCandidato().getNome() + " / Votos: " + pesquisa1.getBusca().getNumeroVotos());
		
	}

}