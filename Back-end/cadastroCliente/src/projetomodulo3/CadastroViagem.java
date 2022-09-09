package projetomodulo3;

import java.util.Scanner;

public class CadastroViagem {
	protected String dataIda;
	protected String dataVolta;
	protected String origem;
	protected String destino;
	protected int pagamento;
	protected String x;
	Scanner input = new Scanner(System.in);
	
	public CadastroViagem() {
		
	}
	
	public void informarOrigem() {
		System.out.println("Informe o local de partida: ");
		origem = input.nextLine();
	}
	
	public void informarDestino() {
		System.out.println("Destinos disponíveis: Grécia | Disney | Buenos Aires | Peru");
		System.out.println("Informe o destino escolhido: ");
		destino = input.nextLine();
	}
	
	public void escolherData() {
		System.out.println("Informe a data de partida: ");
		dataIda = input.next();
		System.out.println("Informe a data de retorno: ");
		dataVolta = input.next();		
	}
	
	public void informarPagamento() {
		System.out.println("Formas de pagamento disponíveis: ");
		System.out.println("1 - Débito \n 2 - Crédito \n 3 - Pix\n");
		System.out.println("Informe a forma de pagamento escolhida");
		pagamento = input.nextInt();
		if (pagamento == 1) {
			System.out.println("Formas de pagamento: Cartão de crédito. ");
			this.x = "Cartão de Crédito";
		}else if (pagamento == 2) {
			System.out.println("Formas de pagamento: Cartão de débito. ");
			this.x = "Cartão de Débito";
		}else {
			System.out.println("Formas de pagamento: Pix. ");
			this.x = "Pix";
		}
		System.out.println("");
		input.close();
	}
	
	public String getDataIda() {
		return dataIda;
	}
	
	public void setDataIda(String dataIda) {
		this.dataIda = dataIda;
	}
	
	public String getDataVolta() {
		return dataVolta;
	}
	
	public void setDataVolta(String dataVolta) {
		this.dataVolta = dataVolta;
	}
	
	public String getOrigem() {
		return origem;
	}
	
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public int getFormaPagamento() {
		return pagamento;
	}
	
	public void setFormaPagamento(int pagamento) {
		this.pagamento = pagamento;
	}
	
	public void dadosViagem() {
		System.out.println("Origem: " + this.getOrigem());
		System.out.println("Destino: " + this.getDestino());
		System.out.println("Data de partida: " + this.getDataIda());
		System.out.println("Data de retorno: " + this.getDataVolta());
		System.out.println("Forma de Pagamento: " + this.x);
		System.out.println("Boa viagem!");
	}
}
