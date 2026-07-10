package computadora;

public class Computadora {
	String Marca;
	String Color;
	int modelo;
	
	void prender() {
		System.out.println("La computadora" + Marca + " Se prendio");
		
	}
	
	void Apagar() {
		System.out.println("La computadora" + Marca + " Se apagó");
	}
	
	void mostrar() {
		System.out.println("MARCA: " + Marca);
		System.out.println("COLOR: " + Color);
		System.out.println("MODELO: " + modelo);
	}

}
