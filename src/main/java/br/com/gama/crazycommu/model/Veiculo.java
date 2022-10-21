package br.com.gama.crazycommu.model;

public class Veiculo {
	private String nome;
	private String modelo;
	private String tipo;
	
	
	
	public Veiculo() {}
	
	public Veiculo(String nome, String modelo, String tipo) {
		super();
		this.nome = nome;
		this.modelo = modelo;
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
