public class main {
	public static void main(String[] args) {
		//INSTANCIA CANDIDATO
		Candidato candidato = new Candidato("João","TCTC", 69);
		//INSTANCIA PESQUISA CANDIDATO BUSCA - VOTO
		PesquisaCandidato Busca1 = new PesquisaCandidato(132, candidato);
		//INSTANCIA PESQUISA
		Pesquisa pesquisa1 = new Pesquisa("Deyvison", Busca1);
		
		//IMPRIMIR NA TELA
		System.out.println("-----Pesquisa Eleitoral-----\n");
		System.out.println("Candidato: " + pesquisa1.getBusca().getCandidato().getNome() + " / Recebeu " + pesquisa1.getBusca().getNumeroVotos() +" votos ");
		
	}

}