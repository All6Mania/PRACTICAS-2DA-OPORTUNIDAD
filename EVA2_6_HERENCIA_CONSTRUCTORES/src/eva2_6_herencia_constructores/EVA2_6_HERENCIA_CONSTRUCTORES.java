package eva2_6_herencia_constructores;

public class EVA2_6_HERENCIA_CONSTRUCTORES {

	public EVA2_6_HERENCIA_CONSTRUCTORES() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Clase animal");
		Animal animal = new Animal();
		animal.comer();
		animal.respirar();
		
		System.out.println("Clase mamifero");
		Mamifero mamifero = new Mamifero();
	}

}
