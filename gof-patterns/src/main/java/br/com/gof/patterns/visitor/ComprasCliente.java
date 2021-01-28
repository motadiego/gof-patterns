package br.com.gof.patterns.visitor;

import java.util.List;

public class ComprasCliente implements Relatorio {
	private Cliente cliente;
	private List<Item> items;
	
	
	public ComprasCliente() {
		
	}
	
	
	public ComprasCliente(Cliente cliente, List<Item> items) {
		super();
		this.cliente = cliente;
		this.items = items;
	}


	public Object gerarRelatorio(FormatoVisitante fv) {
		fv.visitarTitulo("Compras de " + cliente.getNome());
		fv.visitarParagrafo("CPF " + cliente.getCPF());
		fv.visitarParagrafo("Cliente desde " + cliente.getDataCadastro());
		fv.visitarTabela();
		fv.visitarTabelaCabecalho("Produto", "Data", "Valor");
		for (Item i : items) {
			fv.visitarTabelaLinha(i.getProduto(), i.getDataCompra(), i.getValor());
		}
		fv.visitarTabelaFim();
		return fv.getResultado();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}	
}
