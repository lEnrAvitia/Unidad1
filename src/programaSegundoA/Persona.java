package programaSegundoA;

public class Persona {
	private String nombre;
	private byte edad;
	private float estatura;
	
	
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + "]";
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public byte getEdad() {
		return edad;
	}



	public void setEdad(byte edad) {
		this.edad = edad;
	}



	public float getEstatura() {
		return estatura;
	}



	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
}
