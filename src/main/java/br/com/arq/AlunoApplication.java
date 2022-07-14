package br.com.arq;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.arq.entity.Aluno;
import br.com.arq.entity.Disciplina;
import br.com.arq.repository.AlunoRepository;

@SpringBootApplication
public class AlunoApplication {

// implements CommandLineRunner{
	
	//@Autowired
	// private AlunoRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(AlunoApplication.class, args);
	}

	/*
	@Override
	public void run(String... args) throws Exception {
		try {
			Aluno aluno = new Aluno(null, "lucio","lucio@gmail.com","ativo");
			Set<Disciplina> disciplinas = new HashSet<>();
			disciplinas.add(new Disciplina(null, "java", 6.));
			disciplinas.add(new Disciplina(null, "oracle", 7.5));
			
			for(Disciplina item : disciplinas) {
				item.setAluno(aluno);
			}/// As duas disciplinas irão setar (visualizar) o aluno
			
			aluno.setDisciplinas(disciplinas);
			repository.save(aluno);
			System.out.println("Aluno Gravado");
			
		} catch (Exception ex) {
			
			System.out.println("Error :" + ex.getMessage());
			
		}
		
	}

	*/
}
