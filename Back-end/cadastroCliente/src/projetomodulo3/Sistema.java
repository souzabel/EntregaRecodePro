package projetomodulo3;

public class Sistema {
	
	public static void main(String[] args) {
		CadastroCliente cliente = new CadastroCliente();
		cliente.bemVindo();
		cliente.preencherDados();
		
		CadastroViagem viagem = new CadastroViagem();
		viagem.informarOrigem();
		viagem.informarDestino();
		viagem.escolherData();
		viagem.informarPagamento();
		
		cliente.dadosCliente();
		viagem.dadosViagem();
	}
}
