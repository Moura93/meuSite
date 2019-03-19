package projetoexemplo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean (name = "MBCliente")

public class ClienteBean {
	
	private String cpf;
	private String nome;
	private String mensagem;
	
	public void mostrarMensagem() {
		System.out.println(getMensagem() + " - Veio da view e chegou aqui!");
		System.out.println(getNome() + " NOME COMPLETO");
		System.out.println(getCpf() + "CPF do Cliente");
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
