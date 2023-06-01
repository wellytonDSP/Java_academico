package trabalho01;

import java.util.Objects;

public class Aluno {
	private int codigo;
	private String nome;
	private String email;
	private double peso;
	private double altura;
	private int sexo;
	Interface inter;
	
	public Aluno(int codigo, String nome, String email, double peso, double altura, int sexo) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
	}
	
	public Aluno(Aluno aluno) {
		super();
	}

	public double IMC() {
		return this.peso / this.altura;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	
	public int hashCode() {
		return Objects.hash(codigo);
	}

	public boolean equals(Object obj) {
		Aluno aluno = (Aluno) obj;
		if (this.codigo == aluno.codigo) {
			return true;
		}
		else {
			return false;
		}
	}

	public String toString() {
		return "Aluno [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", peso=" + peso + ", altura="
				+ altura + ", sexo=" + sexo + "]";
	}
}
