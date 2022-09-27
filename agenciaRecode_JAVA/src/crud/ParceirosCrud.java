package crud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import dao.ParceirosDAO;
import modelo.Parceiros;

public class ParceirosCrud {

	public static void main(String[] args) {

		ParceirosDAO autorDAO = new ParceirosDAO();

		Scanner s = new Scanner(System.in);
		int opcao = 0;
		int posicao = 0;

		int id = 0;
		String nome = "";

		List<Parceiros> autores = new ArrayList<Parceiros>();

		do {
			System.out.println("=== CRUD PARCEIROS ===");
			System.out.println("1 - Cadastrar parceiros");
			System.out.println("2 - Consultar parceiros");
			System.out.println("3 - Atualizar parceiros");
			System.out.println("4 - Deletar parceiros");
			System.out.println("0 - Sair");
			opcao = s.nextInt();
			s.nextLine();

			switch (opcao) {
			case 1:
				// CREATE
				System.out.println("Digite o nome do autor(a): ");
				nome = s.nextLine();

				Parceiros a1 = new Parceiros(id, nome);

				parceirosDAO.save(a1);

				parceiro.addAll(Arrays.asList(a1));

				id++;

				System.out.println("\n***  Cadastrou  ***\n");

				break;
			case 2:
				// READ
				for (Parceiros a : parceiros) {
					System.out.println("Id: " + a.getId() + " Nome: " + a.getNome());
				}
				System.out.println("consultou");
				break;
			case 3:
				// UPDATE
				System.out.println("Digite o id do parceiro: ");
				posicao = s.nextInt();
				s.nextLine();
				System.out.println("Digite o nome do parceiro: ");
				nome = s.nextLine();

				Parceiros a2 = new Parceiros(posicao, nome);

				for (int i = 0; i < parceiros.size(); i++) {
					if (posicao == parceiros.get(i).getId()) {
						System.out.println("\nVoc� atualizou o autor: " + parceiros.get(i).getNome());
						Collections.replaceAll(autores, autores.get(i), a2);
					}
				}

				System.out.println("atualizou");
				break;
			case 4:
				// DELETE
				System.out.println("Digite o id do parceiro: ");
				posicao = s.nextInt();

				for (int i = 0; i < parceiros.size(); i++) {
					if (posicao == parceiros.get(i).getId()) {
						System.out.println("\nVocê removeu o parceiro: " + parceiros.get(i).getNome());
						parceiros.remove(i);
					}
				}

				break;
			default:
				System.out.println(opcao != 0 ? "opção invalida, digite novamente." : "");
				break;

			}

		} while (opcao != 0);

		System.out.println("Até mais!");
		s.close();
	}

}
