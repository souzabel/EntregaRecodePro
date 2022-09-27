package crud;

import java.util.Arrays;

import modelo.Agencia;
import modelo.Parceiros;
import modelo.Compras;
import modelo.Itens_compra;
import modelo.Produtos;
import modelo.Permissoes;
import modelo.Usuario;

public class Principal {

	public static void main(String[] args) {

		Permissoes p1 = new Permissoes(1, "comum");
		Permissoes p2 = new Permissoes(2, "administrador");

		Usuario u1 = new Usuario(1, "Ana", "ana@email", "1234", p2);
		Usuario u2 = new Usuario(2, "Pedro", "pedro@email", "4567", p1);
		Usuario u3 = new Usuario(3, "José", "jose@email", "7891", p1);

		System.out.println(u1.mostrar());
		System.out.println(u2.mostrar());
		System.out.println(u3.mostrar());

		Parceiros a1 = new Parceiros(1, "Joana");
		Parceiros a2 = new Parceiros(2, "Marcos");

		Agencia e1 = new Agencia(1, "Recode");
		Agencia e2 = new Agencia(2, "Recode");

		Produtos l1 = new Produtos(1, "Vila Mar", 50, "20/05/2000", e1, a2);
		Produtos l2 = new Produtos(2, "Copacabana", 45, "25/05/2010", e2, a1);

		Compras c1 = new Compras(1, "01/08/2022", u3);

		Itens_compra i1 = new Itens_compra(1, 3, c1, l1);
		Itens_compra i2 = new Itens_compra(2, 1, c1, l2);

		c1.getItens().addAll(Arrays.asList(i1));
		c1.getItens().addAll(Arrays.asList(i2));

		System.out.println("\n\nUsuario: " + c1.getUsuario().getNome());

		for (Itens_compra i : c1.getItens()) {
			System.out.println("Produtos: " + i.getProdutos().getNome() + " quantidade: " + i.getQtd_itens() + " valor: "
					+ i.getValor());

		}

		System.out.println(" \nValor compra: " + c1.getValor());

	}

}
