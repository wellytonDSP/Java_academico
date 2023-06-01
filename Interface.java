package trabalho01;
import java.util.ArrayList;
import java.util.Scanner;
public class Interface {
	
	Scanner scan = new Scanner(System.in);
	
	// Menu
	public int menuPrincipal() {
		System.out.println("------------------------------------");
		System.out.println("------------   MENU   --------------");
		System.out.println("------------------------------------");
		System.out.println("1 - Cadastrar Aluno");
		System.out.println("2 - Listar Aluno");
		System.out.println("3 - Procurar Aluno por Código");
		System.out.println("4 - Excluir");
		System.out.println("5 - Sair");

		int alternativa = scan.nextInt();
		
		
		
		while (alternativa > 5 || alternativa <= 0) {

			System.out.println("------------------------------------");
			System.out.println("------------   MENU   --------------");
			System.out.println("------------------------------------");
			System.out.println("1 - Cadastrar Aluno");
			System.out.println("2 - Listar Aluno");
			System.out.println("3 - Procurar Aluno por Código");
			System.out.println("4 - Excluir");

			System.out.println("5 - SAIR ");
			alternativa = scan.nextInt();

		}
		return alternativa;
	}
	
	// Lê o codigo do aluno!
	public int lerCodigoAluno() {
		System.out.println("Qual é o codigo?");
		int codigo = scan.nextInt();
		return codigo;
	}
	
	// Lê o sexo do aluno!
	public int lerSexoAluno() {
		System.err.println("Qual é o sexo? 1 - Masculino / 2 - Feminino");
		int sexo = scan.nextInt();
		scan.nextLine();
		return sexo;
	}
	
	// Lê o nome do aluno!
	public String lerNomeAluno() {
		System.err.println("Qual é o nome é sobrenome?");
		String nome = scan.nextLine();
		return nome;
	}
	
	// Lê o email do aluno!
	public String lerEmailAluno() {
		System.err.println("Qual é o email?");
		String email = scan.nextLine();
		return email;
	}
	
	// Lê o peso do aluno!
	public double lerPesoAluno() {
		System.err.println("Qual é o peso?");
		double peso = scan.nextDouble();
		return peso;
	}
	
	// Lê o altura do aluno!
	public double lerAlturaAluno() {
		System.err.println("Qual é altura?");
		double altura = scan.nextDouble();
		return altura;
	}
	
	// Mostra aluno em um toString!
	public void mostraAluno(Aluno aluno) {
		
		System.out.println(aluno.toString());
		
	}
	
	// Cadastra aluno
	public Aluno novoAluno() {
		
		int codAluno;
		int sexoAluno;
		String nomeAluno;
		String emailAluno;
		double pesoAluno;
		double alturaAluno;
		
		// Manda para o metodo ler codigo dessa classe mesmo
		codAluno = lerCodigoAluno();
		while (codAluno <= 0) {
			codAluno = lerCodigoAluno();  
		}
		
		// Manda para o metodo ler sexo dessa classe mesmo
		sexoAluno = lerSexoAluno();
		while ((sexoAluno != 1) && (sexoAluno != 2)) {
			sexoAluno = lerSexoAluno();  
		}
		
		// Manda para o metodo ler nome dessa classe mesmo
		nomeAluno = lerNomeAluno();
		while (nomeAluno.indexOf(' ') == -1) {
			nomeAluno = lerNomeAluno();  
		}
		
		// Manda para o metodo ler email dessa classe mesmo
		emailAluno = lerEmailAluno();
		while (emailAluno.indexOf('@') == -1) {
			emailAluno = lerEmailAluno();   
		}
		
		// Manda para o metodo ler peso dessa classe mesmo
		pesoAluno = lerPesoAluno();
		while (pesoAluno <= 0) {
			pesoAluno = lerPesoAluno();
		}
		
		// Manda para o metodo ler altura dessa classe mesmo
		
		alturaAluno = lerAlturaAluno();
		while (alturaAluno <= 0) {
			alturaAluno = lerAlturaAluno();
		}
		
		//Instancia um objeot aluno da classe aluno que recebe os dados obtidos acima!
		
		Aluno alunos = new Aluno(codAluno,nomeAluno,emailAluno,pesoAluno,alturaAluno,sexoAluno);
		
		
		// Retorna o objeto aluno
		return alunos;
		
	}
	
	
	// Metodo que busca o metodo lista Aluno na classe controlaAluno
	public void listaAluno(ArrayList<Aluno>alunos) {
		// Mostra os alunos adicionados no array list
		for(Aluno aluno : alunos) {
			System.out.println(aluno.toString());
		}
	}
	
	
	
	//Metodo motra uma mensagem 
	public void mostraMensagem(String msg) {
		System.out.println(msg);
	}
}
