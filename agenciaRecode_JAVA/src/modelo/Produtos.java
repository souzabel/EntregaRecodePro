package modelo;

public class Produtos {
	// Atributos
	private int id;
	private String nome;
	private double preco;
	private String pacote;

	private Agencia agencia;
	private Parceiros parceiros;

	// Construtores
	public Produtos() {
	}

	public Produtos(int id, String nome, double preco, String pacote, Agencia agencia, Parceiros parceiros) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.pacote = pacote;
		this.agencia = agencia;
		this.parceiros = parceiros;
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getPacote() {
		return pacote;
	}

	public void setPacote(String pacote) {
		this.pacote = pacote;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Parceiros getParceiros() {
		return parceiros;
	}

	public void setParceiros(Parceiros parceiros) {
		this.parceiros = parceiros;
	}
	// ToString

	@Override
	public String toString() {
		return "Produtos [id=" + id + ", nome=" + nome + ", preco=" + preco + ", pacote=" + pacote + ", agencia="
				+ agencia + ", parceiros=" + parceiros + "]";
	}

}
