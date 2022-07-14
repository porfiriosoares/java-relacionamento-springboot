package br.com.arq.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "contato")
public class Contato implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContato;

	@JsonProperty(value = "nome-aluno")
	@Column(name = "nomeAluno", length = 50)
	private String nomeAluno;

	@JsonProperty(value = "caixa-Postal")
	@Column(name = "caixaPostal", length = 50)
	private String caixaPostal;
	private String cidade;
	private String bairro;
	private String telefone;

	@OneToOne(cascade = CascadeType.ALL)
	// id na frente e classe (chave primaria) idAluno
	// Tabela na frente e id depois chave estrangeira...
	@JoinColumn(name = "alunoId", referencedColumnName = "idAluno")
	private Aluno aluno;

	public Contato() {
		// TODO Auto-generated constructor stub
	}

	public Contato(Long idContato, String nomeAluno, String caixaPostal, String cidade, String bairro, String telefone,
			Aluno aluno) {
		super();
		this.idContato = idContato;
		this.nomeAluno = nomeAluno;
		this.caixaPostal = caixaPostal;
		this.cidade = cidade;
		this.bairro = bairro;
		this.telefone = telefone;
		this.aluno = aluno;
	}

	public Contato(Long idContato, String nomeAluno, String caixaPostal, String cidade, String bairro,
			String telefone) {
		super();
		this.idContato = idContato;
		this.nomeAluno = nomeAluno;
		this.caixaPostal = caixaPostal;
		this.cidade = cidade;
		this.bairro = bairro;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Contato [idContato=" + idContato + ", nomeAluno=" + nomeAluno + ", caixaPostal=" + caixaPostal
				+ ", cidade=" + cidade + ", bairro=" + bairro + ", telefone=" + telefone + ", aluno=" + aluno + "]";
	}

	public Long getIdContato() {
		return idContato;
	}

	public void setIdContato(Long idContato) {
		this.idContato = idContato;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getCaixaPostal() {
		return caixaPostal;
	}

	public void setCaixaPostal(String caixaPostal) {
		this.caixaPostal = caixaPostal;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

}
