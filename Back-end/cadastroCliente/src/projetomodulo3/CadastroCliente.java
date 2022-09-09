package projetomodulo3;

import java.util.Scanner;

public class CadastroCliente {
	protected String nome;
	protected String email;
	protected String cpf;
	protected int idade;
	
	Scanner input = new Scanner(System.in);
	public CadastroCliente() {
		
	}


	void bemVindo() {
		System.out.println("Bem vindo(a) a Tripz, a melhor do Brasil!");
		System.out.println("Destinos disponíveis: Grécia | Disney | Buenos Aires | Peru");
		System.out.println("Faça o cadastro em nosso site");
	}

	void preencherDados() {
		System.out.println("Cadastro");
		System.out.println("Digite seu nome:");
		nome = input.next();
		System.out.println("Digite sua idade:");
		idade = input.nextInt();
		System.out.println("Digite seu email:");
		email = input.next();
		System.out.println("Digite seu CPF:");
		cpf = input.next();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
 
	public int getIdade() {
		return idade;
	}
 
	public void setIdade(int idade) {
		this.idade = idade;
	}
 
	public String getEmail() {
		return email;
	}
 
	public void setEmail(String email) {
		this.email = email;
	}
 
	void dadosCliente() {
		System.out.println("Dados do cliente:");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Email: " + this.getEmail());
	}
}