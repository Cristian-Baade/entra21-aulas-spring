package br.com.entra21.backend.spring.projeto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table(name = "programador")
public class Programador extends MaturidadeNivel3Richardson {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Integer qtd_linguagem;

	public Programador() {
		super();
	}

	public Programador(Integer id, String name, Integer qtd_linguagem) {
		super();
		this.id = id;
		this.name = name;
		this.qtd_linguagem = qtd_linguagem;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQtd_linguagem() {
		return qtd_linguagem;
	}

	public void setQtd_linguagem(Integer qtd_linguagem) {
		this.qtd_linguagem = qtd_linguagem;
	}

}
