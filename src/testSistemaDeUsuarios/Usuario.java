package testSistemaDeUsuarios;

public class Usuario {

	
	private String nombreUsuario;
	private Integer idUsuario;
	private Integer edad;

	public Usuario(String nombreUsuario, Integer idUsuario, Integer edad) {
		this.nombreUsuario = nombreUsuario;
		this.idUsuario = idUsuario;
		this.setEdad(edad);
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", idUsuario=" + idUsuario + ", edad=" + edad + "]";
	}
	
	
	
	
	
	
}
