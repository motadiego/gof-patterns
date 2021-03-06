package br.com.gof.patterns.chainofresponsability;

public class Principal {
	public static void main(String[] args) {
		RecuperadorArquivo remoto = new RecuperadorServidorRemoto(null);
		RecuperadorArquivo bancoDeDados = new RecuperadorBancoDeDados(remoto);
		RecuperadorArquivo cache = new RecuperadorCacheMemoria(bancoDeDados);
		
		Arquivo recuperado = cache.recuperar("Teste");
		System.out.println("Arquivo recuperado: " +recuperado);	
	}
}
