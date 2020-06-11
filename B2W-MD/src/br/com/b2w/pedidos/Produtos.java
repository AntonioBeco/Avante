package br.com.b2w.pedidos;

import java.util.ArrayList;
import java.util.List;

public class Produtos {
	public static void main(String[] args) {
		
		
		List<Central> produto = new ArrayList<Central>();
		produto.add(new Central("mesa", 1200.0, 12));
		produto.add(new Central("HD 1tb", 210.0, 80));
		produto.add(new Central("mouse", 82.0, 24));
		produto.add(new Central("monitor", 2000.0, 0));
		produto.add(new Central("teclado", 130.0, 14));
		produto.add(new Central("note lenovo", 2900.0, 0));
		produto.add(new Central("note hp", 3130.0, 14));
		
		produto.forEach(p -> System.out.println(p.getValorMinimo()));
	}
	

}
