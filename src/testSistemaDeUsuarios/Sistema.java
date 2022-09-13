package testSistemaDeUsuarios;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

	
	private String nombreDelSistema;
	private final Integer CANTIDAD_MAXIMA_USUARIOS;
	private List<Usuario> usuariosRegistrados;
	private List<Usuario> usuariosLogueados;
	private List<Usuario> usuariosBloqueados;
	private Integer contadorDeUsuariosLogueados;
	private Integer contadorDeUsuariosBloqueados;
	

	public Sistema(String nombreDelSistema, Integer CANTIDAD_MAXIMA_USUARIOS) {
		this.nombreDelSistema = nombreDelSistema;
		this.CANTIDAD_MAXIMA_USUARIOS = CANTIDAD_MAXIMA_USUARIOS;
		usuariosRegistrados = new ArrayList<>();
		usuariosLogueados = new ArrayList<>();
		usuariosBloqueados = new ArrayList<>();
		this.contadorDeUsuariosLogueados = 0;
		this.contadorDeUsuariosBloqueados = 0;
	}

	public String getNombreDelSistema() {
		return nombreDelSistema;
	}

	public void setNombreDelSistema(String nombreDelSistema) {
		this.nombreDelSistema = nombreDelSistema;
	}
	
	public Integer getCANTIDAD_MAXIMA_USUARIOS() {
		return CANTIDAD_MAXIMA_USUARIOS;
	}
	
	public void agregarNuevoUsuario(Usuario nuevoUsuario) {
		if(this.verificarSiElUsuarioYaEstaRegistrado(nuevoUsuario.getNombreUsuario()) == false) {
		usuariosRegistrados.add(nuevoUsuario);
		}
	}
	
	public Boolean verificarSiElUsuarioYaEstaRegistrado(String nombreUsuario) {
		Boolean UsuarioYaRegistrado = false;
		
		for (Usuario usuario : usuariosRegistrados) {
			if(usuario.getNombreUsuario().equals(nombreUsuario)) {
				UsuarioYaRegistrado = true;
			}
		}
		
		return UsuarioYaRegistrado;
	}

	public Usuario buscarUsuarioRegistradoPorID(Integer idUsario) {
		Usuario usuarioABuscar = new Usuario("", 0, 0);
		
		for (Usuario usuario : usuariosRegistrados) {
			if(usuario.getIdUsuario().equals(idUsario)) {
				usuarioABuscar = usuario;
					return usuarioABuscar;
			}
		}
		return null;
	}

	public Boolean loguearUsuario(Usuario nuevoUsuario) {
		Boolean usuarioLogeadoCorrectamente = false;
		
		if(this.verificarSiElUsuarioYaEstaRegistrado(nuevoUsuario.getNombreUsuario()) == true) {
			usuariosLogueados.add(nuevoUsuario);
			usuarioLogeadoCorrectamente = true;
			contadorDeUsuariosLogueados++;
		}
		return usuarioLogeadoCorrectamente;
	}
	
	public Usuario buscarUsuarioLogueadoPorID(Integer idUsario) {
		Usuario usuarioABuscar = new Usuario("", 0, 0);
		
		for (Usuario usuario : usuariosLogueados) {
			if(usuario.getIdUsuario().equals(idUsario)) {
				usuarioABuscar = usuario;
					return usuarioABuscar;
			}
		}
		return null;
	}

	public void BloquearUsuario(Usuario nuevoUsuario) {
		usuariosBloqueados.add(nuevoUsuario);
		contadorDeUsuariosBloqueados++;
	}
	
	public Usuario buscarUsuarioBloqueadoPorID(Integer idUsario) {
		Usuario usuarioABuscar = new Usuario("", 0, 0);
		
		for (Usuario usuario : usuariosBloqueados) {
			if(usuario.getIdUsuario().equals(idUsario)) {
				usuarioABuscar = usuario;
					return usuarioABuscar;
			}
		}
		return null;
	}

	public Integer calcularCantidadDeUsuariosLogueados() {
		return contadorDeUsuariosLogueados;
	}
	
	public Integer calcularCantidadDeUsuariosBloqueados() {
		return contadorDeUsuariosBloqueados;
	}

	public Integer calcularPorcentajeDeUsuariosLogueados() {
		return contadorDeUsuariosLogueados * 100 / CANTIDAD_MAXIMA_USUARIOS;
	}

	public Integer calcularEdadPromedioDeUsuariosRegistrados() {
		Integer totalEdadUsuarios = 0;
		
		for (Usuario usuario : usuariosRegistrados) {
			totalEdadUsuarios += usuario.getEdad();
		}
		return totalEdadUsuarios / CANTIDAD_MAXIMA_USUARIOS;
	}
	
	
	
}
