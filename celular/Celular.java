package celular;

public class Celular {

	boolean celular;
	String chamar;
	 
	void status() {
		if(this.celular == true) {
		System.out.println("O celular esta ligado ");
			}else {
				System.out.println("O celular esta desligado");
			}
		}
	
	boolean chamada() {
		
		if(this.celular == true) {
			System.out.println("chamando...");
		}else {
			System.out.println("ERRO! Não e possivel chamar!!");
		}
		return celular;
		
	}
	
	void ligar() {
		
		this.celular = true;
		
	}
	
	void desligar() {
		
		this.celular = false;
		
	}
}
