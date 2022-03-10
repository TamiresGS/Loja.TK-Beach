package model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Cadastro")
public class Cadastro {
	
	//Tela Cadastrar

	private String nomeCompleto;
	
	private String email;
	
	private String confirmaEmail;
	
	private String rua;
	
	private String logadouro;
	
	private String bairro;
	
	private String estado;
	
	private String pais;
	
	private String senha;
	
	private String confirmaSenha;

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConfirmaEmail() {
		return confirmaEmail;
	}

	public void setConfirmaEmail(String confirmaEmail) {
		this.confirmaEmail = confirmaEmail;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getLogadouro() {
		return logadouro;
	}

	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}
	
	

	
}
