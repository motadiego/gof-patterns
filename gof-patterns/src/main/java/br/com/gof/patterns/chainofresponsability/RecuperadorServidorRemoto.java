package br.com.gof.patterns.chainofresponsability;

public class RecuperadorServidorRemoto extends RecuperadorArquivo {
	

	public RecuperadorServidorRemoto(RecuperadorArquivo proximo) {
		super(proximo);
	}

	@Override
	protected Arquivo recuperaArquivo(String nome) {
		// busca o arquivo no servidor remoto
		//Arquivo a = buscaArquivoNoServidorRemoto(nome);
		//if(a != null) {
		//	return a;
		//}
		return null;
	}

	protected Arquivo chamarProximo(String nome) {
		return null;
	}

}
