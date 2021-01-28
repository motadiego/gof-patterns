package br.com.gof.patterns.visitor;

public class Item {
	
	private String produto;
	private String dataCompra;
	private Double valor; 
		
	public Item() {
		
	}
	

	public Item(String produto, String dataCompra, Double valor) {
		super();
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.valor = valor;
	}


	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
