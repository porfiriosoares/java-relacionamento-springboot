package br.com.arq.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="disciplina")
public class Disciplina implements Serializable{
		
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDisciplina;
	
	@JsonProperty(value = "nome-disciplina")
	@Column(name = "nomeDisciplina", length =50)
	private String nomeDisciplina;
	
		
	@JsonProperty(value = "media")
	@Column(name = "media", length = 50)
	private Double media;
	
	@JsonBackReference(value = "disciplinas")
	@ManyToOne()
	@JoinColumn(name = "alunoId", referencedColumnName = "idAluno")
	private Aluno aluno;
	
	public Disciplina() {
		
	}

	public Disciplina(Long idDisciplina, String nomeDisciplina, Double media) {
		super();
		this.idDisciplina = idDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.media = media;
	}
		
	@Override
	public String toString() {
		return "Disciplina [idDisciplina=" + idDisciplina + ", nomeDisciplina=" + nomeDisciplina + ", media=" + media
				+ "]";
	}

	public Long getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(Long idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

}
