package br.com.gama.crazycommu.model;

import java.util.List;

import br.com.gama.crazycommu.model.Veiculo;

public class User{
	
	private long id;
	private String nome;
	private String login;
	private List<Veiculo> veiculos;
		
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public List<Veiculo> getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	
	
	

}
