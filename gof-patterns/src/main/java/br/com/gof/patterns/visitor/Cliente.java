package br.com.gof.patterns.visitor;

import java.util.Date;

public class Cliente {
	private String nome;
	private String CPF;
	private String dataCadastro;
	
	public Cliente() {
		
	}
	
	
	public Cliente(String nome, String CPF, String dataCadastro) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.dataCadastro = dataCadastro;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cpf) {
		this.CPF = cpf;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
