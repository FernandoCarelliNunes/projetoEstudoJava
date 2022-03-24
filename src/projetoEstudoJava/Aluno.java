package projetoEstudoJava;

import java.util.Objects;

public class Aluno {

	
	private String nome;
	private int idade;
	private String serie;
	private String dataNascimento;
	private String dataInicio;
	private String nomeEscola;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	
	public void retornaDados() {
		
		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(dataInicio, dataNascimento, idade, nome, nomeEscola, serie);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataInicio, other.dataInicio) && Objects.equals(dataNascimento, other.dataNascimento)
				&& idade == other.idade && Objects.equals(nome, other.nome)
				&& Objects.equals(nomeEscola, other.nomeEscola) && Objects.equals(serie, other.serie);
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", serie=" + serie + ", dataNascimento=" + dataNascimento
				+ ", dataInicio=" + dataInicio + ", nomeEscola=" + nomeEscola + "]";
	}
	
	
}
