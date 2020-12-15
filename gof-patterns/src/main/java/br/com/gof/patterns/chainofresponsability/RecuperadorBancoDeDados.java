package br.com.gof.patterns.chainofresponsability;

public class RecuperadorBancoDeDados extends RecuperadorArquivo  {
	
	
	public RecuperadorBancoDeDados(RecuperadorArquivo proximo) {
		super(proximo);
	}

	@Override
	protected Arquivo recuperaArquivo(String nome) {
		// busca o arquivo no banco de dados
		//Dao dao = new Dao();
		//Arquivo a = dao.buscaArquivoNoBanco(nome);
		//if(a != null) {
		//	return a;
		//}
		return null;
	}

	protected Arquivo chamarProximo(String nome) {
		Arquivo a = super.chamarProximo(nome);
		return a;
	}
}
