package eva2_5_herencia;

public class EVA2_5_HERENCIA {

	public EVA2_5_HERENCIA() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClase obj = new SubClase();
		obj.mensaje();

	}

}

class SuperClase{

	public void mensaje() {
		System.out.println("jelouder");
	}
}

class SubClase extends SuperClase{
	
	public SubClase() {
		
	}
}