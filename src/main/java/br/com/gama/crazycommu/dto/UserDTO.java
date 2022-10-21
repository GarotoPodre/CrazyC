package br.com.gama.crazycommu.dto;

import java.util.List;

import br.com.gama.crazycommu.model.Veiculo;

public class UserDTO {
	
	private String nome;
	private String login;
	private List<VeiculoDTO> veiculos;
	private long id;
	
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
	public List<VeiculoDTO> getVeiculos() {
		return veiculos;
	}
	public void setVeiculos(List<VeiculoDTO> veiculos) {
		this.veiculos = veiculos;
	}
	
	
	

}
