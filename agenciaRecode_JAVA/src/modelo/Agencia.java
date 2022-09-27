package modelo;

public class Agencia {
	// Atributos
	private int id;
	private String nome;

	// Contrutores
	public Agencia() {
	}

	public Agencia(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	// Getters e Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	// ToString

	@Override
	public String toString() {
		return "Agencia [id=" + id + ", nome=" + nome + "]";
	}

}
