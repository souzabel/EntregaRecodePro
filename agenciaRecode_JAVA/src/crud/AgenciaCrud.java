package crud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import modelo.Agencia;

public class AgenciaCrud {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opcao = 0;
		int posicao = 0;

		int id = 0;
		String nome = "";

		List<Agencia> editoras = new ArrayList<Agencia>();

		do {
			System.out.println("=== CRUD Agencia ===");
			System.out.println("1 - Cadastrar Agencia");
			System.out.println("2 - Consultar Agencia");
			System.out.println("3 - Atualizar Agencia");
			System.out.println("4 - Deletar Agencia");
			System.out.println("0 - Sair");
			opcao = s.nextInt();
			s.nextLine();

			switch (opcao) {
			case 1:
				// CREATE
				System.out.println("Digite o nome da agência: ");
				nome = s.nextLine();

				Agencia e1 = new Agencia(id, nome);

				agencia.addAll(Arrays.asList(e1));

				id++;

				System.out.println("\n***  Cadastrou  ***\n");

				break;
			case 2:
				// READ
				for (Agencia e : agencia) {
					System.out.println("Id: " + e.getId() + " Nome: " + e.getNome());
				}
				System.out.println("consultou");
				break;
			case 3:
				// UPDATE
				System.out.println("Digite o id da agência ");
				posicao = s.nextInt();
				s.nextLine();
				System.out.println("Digite o nome da agência: ");
				nome = s.nextLine();

				Agencia e2 = new Agencia(posicao, nome);

				for (int i = 0; i < agencia.size(); i++) {
					if (posicao == agencia.get(i).getId()) {
						System.out.println("\nVocê atualizou a agência: " + agencia.get(i).getNome());
						Collections.replaceAll(agencia, agencia.get(i), e2);
					}
				}

				System.out.println("atualizou");
				break;
			case 4:
				// DELETE
				System.out.println("Digite o id do parceiro: ");
				posicao = s.nextInt();

				for (int i = 0; i < agencia.size(); i++) {
					if (posicao == agencia.get(i).getId()) {
						System.out.println("\nVocê removeu a agência: " + agencia.get(i).getNome());
						agencia.remove(i);
					}
				}

				break;
			default:
				System.out.println(opcao != 0 ? "Opção invalida, digite novamente." : "");
				break;

			}

		} while (opcao != 0);

		System.out.println("Até mais!");
		s.close();

	}

}
