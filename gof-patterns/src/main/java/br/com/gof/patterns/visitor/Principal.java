package br.com.gof.patterns.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {	
	
	public static void main(String[] args) {
		List<Item> items = instaciarItems(); 
		Cliente cliente = new Cliente("Lucas macedo", "9323232983983", "20/09/1988");
		
		Relatorio relatorio = new ComprasCliente(cliente , items);
		FormatoVisitante fv = new VisitanteHtml();
		String resultado = (String) relatorio.gerarRelatorio(fv);
		System.out.println(resultado);
	}

	private static List<Item> instaciarItems() {
		List<Item> items = new ArrayList<Item>();
		Item item1 = new Item("Produto 1" , "27/01/2021", 50.0);
		Item item2 = new Item("Produto 2" , "27/01/2021", 20.0);
		Item item3 = new Item("Produto 3" , "27/01/2021", 200.0);
		items.addAll(Arrays.asList(item1, item2, item3));
		return items;
	}
}
