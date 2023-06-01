package trabalho01;

import java.util.ArrayList;

public class ControlaAluno {
	/**
	 * Representa a base de dados dos alunos. Será substituido no futuro por banco
	 * de dados
	 */
	
	//Declarando objeto array list da classe Aluno
	private ArrayList<Aluno> alunos = new ArrayList<>();

	
	//Puxando o metodo listarTodos da classe Interface
	public ArrayList<Aluno> listarTodos() {
		return this.alunos;
	}
	
	// Cadastra o aluno
	public boolean cadastrarAluno(Aluno aluno) {
		//Verifica se tem algum valor no array
		boolean alunoExistente = verificarAlunoExistente(aluno);

		if (alunoExistente) {
			return false;           // não deu para cadastrar
		} else {			
			this.alunos.add(aluno); // Cadastra o aluno, adicionando o objeto no Array List
			return true;
		}
	}

	/**
	 * Função interna que verifica se um cliente já existe pelo mesmo código.
	 * 
	 */
	public boolean verificarAlunoExistente(Aluno aluno) {
		
		for (Aluno alu: alunos) {
			if (alu.equals(aluno)) {
				return true;
			}
		}
		return false;
	}	
	
	// Metodo que busca o codigo digitado no array list
	public Aluno buscaAlunoCodigo(int codigo_busca) {
	    for (Aluno aluno : alunos) {
	        if (aluno.getCodigo() == codigo_busca) {
	            return aluno; // retorna o aluno encontrado
	        }
	    }
	    return null; // retorna null se nenhum aluno for encontrado
	}
	
	public boolean removeAlunoCodigo(int codigo_busca) {
		
		for (Aluno aluno : alunos) {
            if (aluno.getCodigo() == (codigo_busca)) {
            	alunos.remove(aluno);
            	return true; // retorna o aluno encontrado
            }
        }
        return false;
	}

}
