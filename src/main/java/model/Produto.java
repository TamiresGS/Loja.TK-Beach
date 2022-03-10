package model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "Produto")
public class Produto {
	
	private String nome;
	
	private String descricao;
	
	private String cor;
	
	private String tamanho;
	
	private int quantidade;
	
	private List<String> categoria;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public List<String> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<String> categoria) {
		this.categoria = categoria;
	}
	

}

