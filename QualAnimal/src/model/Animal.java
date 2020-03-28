package model;

public class Animal {
	private String nome;
	private String descricao;
	private Boolean aquatico;

	public Animal() {
		super();
	}

	public Animal(String nome, String descricao, Boolean aquatico) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.aquatico = aquatico;
	}

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

	public Boolean getAquatico() {
		return aquatico;
	}

	public void setAquatico(Boolean aquatico) {
		this.aquatico = aquatico;
	}

}
