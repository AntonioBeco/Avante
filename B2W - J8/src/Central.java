import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Central {
	private String tipo;
	private double valorMinimo;
	private double comissao;
	private double frete = + 12.50;
	private int vendidos;

	public Central(String tipo, double valorMinimo, int vendidos) {
		this.tipo = tipo;
		this.valorMinimo = valorMinimo;
		this.vendidos = vendidos;

	}

	public String getTipo() {
		return tipo;
	}

	public double getValorMinimo() {
		return valorMinimo;
	}

	public double getComissao() {
		return comissao;
	}

	public double getFrete() {
		return frete;
	}

	public int getVendidos() {
		return vendidos;
	}

	// public class OperacoesCentral {
	public static void main(String[] args) {
		List<Central> produto = new ArrayList<Central>();
		produto.add(new Central("mesa", 1200.0, 12));
		produto.add(new Central("HD 1tb", 210.0, 80));
		produto.add(new Central("mouse", 82.0, 24));
		produto.add(new Central("monitor", 2000.0, 0));
		produto.add(new Central("teclado", 130.0, 14));
		produto.add(new Central("note lenovo", 2900.0, 0));
		produto.add(new Central("note hp", 3130.0, 14));

		produto.sort(Comparator.comparing(Central::getTipo));

		produto.forEach(p -> System.out.println( p.getTipo()));
		
		produto.stream()
		.filter(p -> p.getVendidos() >= 1)
		.forEach(p -> System.out.println(p.getTipo()));
		
	

	}

}
