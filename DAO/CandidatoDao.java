package DAO;
import model.Candidato; //importar do package model a classe Candidato
import java.util.List; //importar biblioteca

public class CandidatoDao {
	//ATRIBUTOS
	private static CandidatoDao instance; //Atributo p/ função Singleton
	//Método/Função Singleton...
	public CandidatoDao getInstance() {
		if (instance == null) {
			instance = new CandidatoDao();
		}
	}
		
	//METODOS PADRÃO PARA O CRUD(DAO, banco de dados
	public void salvar(Candidato candidato){
		
	}
	
	public void atualizar(Candidato candidato){
		
	}
	
	public void excluir(int idCandidato){
		
	}
	
	public List<Candidato> listar(){
		return null;
	}
}	
