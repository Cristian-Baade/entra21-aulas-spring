package br.com.entra21.backend.spring.projeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Entra21Application implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbc;
	
	public static void main(String[] args) {
		SpringApplication.run(Entra21Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//O codigo abaixo esta funcional,só não o ligamos para evitar que ele respondesse toda vez que fosse inicializado
		////String sql = "INSERT INTO programador (name, qtd_linguagem) VALUES (?, ?)"; 
		//int result = jdbc.update(sql, "Rubem", 10);
		
	}

}
