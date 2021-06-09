/*
 * 2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

package orientacaoObjeto;

public class Aviao {
	private String modelo, companhia;
	private int ano, horasVoo;
	private boolean liberadoParaVoo;
	
	public Aviao (String model, String cia, int a, int hsV) {
		this.setModelo(model);
		this.setCompanhia(cia);
		this.setAno(a);	
		this.setHorasVoo(hsV);
	}
	
	// getters e setters
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCompanhia() {
		return companhia;
	}
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getHorasVoo() {
		return horasVoo;
	}
	public void setHorasVoo(int horasVoo) {
		this.horasVoo = horasVoo;
	}
	public boolean isLiberadoParaVoo() {
		return liberadoParaVoo;
	}
	public void setLiberadoParaVoo(boolean liberadoParaVoo) {
		this.liberadoParaVoo = liberadoParaVoo;
	}
	
	//metodos
	public void liberaAviao () {
		setLiberadoParaVoo(true);
	}
}
