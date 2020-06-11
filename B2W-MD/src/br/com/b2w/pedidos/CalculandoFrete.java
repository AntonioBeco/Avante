package br.com.b2w.pedidos;

public class CalculandoFrete {

	private double totalFrete;

	public void registra(TaxadoFrete tf) {
		double valor = tf.getValorFrete();
		this.totalFrete += valor;
	}

	public double getTotalFrete() {
		return totalFrete;
	}
}
