package eva2_10_override;

public class EVA2_10_OVERRIDE {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona P1 = new Persona();
		Persona P2 = new Persona("Elian", 18);
		
		System.out.println(P1);
		System.out.println(P2);
	}

}
class Persona{
	private String nombre;
	private int edad;

	public Persona(){
		nombre = "Elian";
		edad = 18;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String toString() {
		String C = "Datos: \n" + 
				"Nombre: " + nombre + "\n" +
				"Edad: " + edad;
		return C;
	}
}
