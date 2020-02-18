package Aula03;

public class Caneta {
	
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	boolean status() {
		System.out.println("Modelo " + this.modelo);
		System.out.println("Ponta " + this.ponta);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Carga " + this.carga);
		
		if(tampada == false) {
			System.out.println("A caneta não esta tampada");
		}else {
			System.out.println("A caneta esta tampada");
		}
		return tampada;
	}
	
	void rabiscar() {
		if(this.tampada == true) {
			System.out.println("ERRO! Não e possivel rabiscar!!!");
		}else {
			System.out.println("Estou rabiscando");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
		
	}
	
}
