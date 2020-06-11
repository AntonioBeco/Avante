package br.com.b2w.pedidos;

public class Central {
	private String tipo;
	private double valorMinimo;
	private double comissao;
	private double frete = 0.02;
	private int vendidos;

	public Central(String tipo, double valorMinimo, int vendidos) {

	}
	
	

	public double getValor() {
		return valorMinimo;
	}

	public void setValor(double valor) {
		this.valorMinimo = valor;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getVendidos() {
		return vendidos;
	}


	public void setVendidos(int vendidos) {
		this.vendidos = vendidos;
	}


	public double getFrete() {
		return frete;
	}


	public void setFrete(double frete) {
		this.frete = frete;
	}

	public static Object stream() {
		return null;
	}



	public char[] getValorMinimo() {
		// TODO Auto-generated method stub
		return null;
	}


}
