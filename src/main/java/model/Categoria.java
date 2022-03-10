package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "Categoria")
public class Categoria {

	private String nome;
	
	private List<String> produto;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getProdutos() {
		return produto;
	}

	public void setProdutos(List<String> produtos) {
		this.produto = produtos;
	}
	
	
	
	
	
}
