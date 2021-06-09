/*
 *1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

package orientacaoObjeto;

public class Cliente {
	
	private String nome;
	private String endereco;
	private String email;
	private int codigo;
	
	// Construtores
	
	public Cliente (int c, String n, String email) {
		this.setCodigo(c);
		this.setNome(n);
		this.setEmail(email);
	}
	
	public Cliente (int c, String n, String email, String end) {
		this.setCodigo(c);
		this.setNome(n);
		this.setEmail(email);
		this.setEndereco(end);
	}
	
	//Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	//metodos
	public boolean verificaEmail(String novoEmail) {
		if(novoEmail == this.email) return true;
		else return false;
	}
}
