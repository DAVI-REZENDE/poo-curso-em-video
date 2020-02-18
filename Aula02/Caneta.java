package Aula02;

public class Caneta {
	
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	boolean status() {
		System.out.println("Modelo " + this.modelo);
		System.out.println("Ponta " + this.ponta);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Carga " + this.carga);
		
		if(tampada == false) {
			System.out.println("A caneta esta destampada");
		}else {
			System.out.println("A caneta esta tampada");
		}
		return tampada;
	}
	
	public void rabiscar() {
		if(this.tampada == true) {
			System.out.println("ERRO! Não e possivel rabiscar!!!");
		}else {
			System.out.println("Estou rabiscando");
		}
	}
	
	protected void tampar() {
		this.tampada = true;
	}
	
	protected void destampar() {
		this.tampada = false;
		
	}
	
}
