package testSistemaDeUsuarios;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class TestSistema {
	
	@Test
	public void queSePuedaAgregarUnUsuarioAUnSistema() {
		
		Sistema nuevoSistema = new Sistema("Twitter", 10);
		
		Usuario nuevoUsuario = new Usuario("El Mas KPO", 150, 25);
		
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario);
		
		
		assertEquals(nuevoUsuario,nuevoSistema.buscarUsuarioRegistradoPorID(150));
		
	}
	
	@Test
	public void queSePuedaLoguearUnUsuarioEnUnSistema() {
		
		Sistema nuevoSistema = new Sistema("Twitter", 10);
		
		Usuario nuevoUsuario = new Usuario("El Mas KPO", 150, 25);
		
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario);
		
		nuevoSistema.loguearUsuario(nuevoUsuario);
		
		
		assertEquals(nuevoUsuario,nuevoSistema.buscarUsuarioLogueadoPorID(150));
		
	}
	
	@Test
	public void queSePuedaBloquearUnUsuarioEnUnSistema() {
		
		Sistema nuevoSistema = new Sistema("Twitter", 10);
		
		Usuario nuevoUsuario = new Usuario("El Mas KPO", 150, 25);
		
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario);
		
		nuevoSistema.BloquearUsuario(nuevoUsuario);
		
		
		assertEquals(nuevoUsuario,nuevoSistema.buscarUsuarioBloqueadoPorID(150));
		
	}
	
	@Test
	public void queSePuedaCalcularLaCantidadDeUsuariosLogueadosEnUnSistema() {
		
		Sistema nuevoSistema = new Sistema("Twitter", 10);
		
		Usuario nuevoUsuario = new Usuario("El Mas KPO", 150, 25);
		Usuario nuevoUsuario2 = new Usuario("Usuario2", 140, 30);
		Usuario nuevoUsuario3 = new Usuario("Usuario3", 130, 40);
		Usuario nuevoUsuario4 = new Usuario("Usuario4", 120, 23);
		Usuario nuevoUsuario5 = new Usuario("Usuario5", 110, 18);
		Usuario nuevoUsuario6 = new Usuario("Usuario6", 160, 45);
		Usuario nuevoUsuario7 = new Usuario("Usuario7", 170, 32);
		Usuario nuevoUsuario8 = new Usuario("Usuario8", 180, 35);
		Usuario nuevoUsuario9 = new Usuario("Usuario9", 190, 28);
		Usuario nuevoUsuario10 = new Usuario("Usuario10", 125, 26);
		
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario2);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario3);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario4);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario5);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario6);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario7);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario8);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario9);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario10);
		
		
		nuevoSistema.loguearUsuario(nuevoUsuario);
		nuevoSistema.loguearUsuario(nuevoUsuario2);
		nuevoSistema.loguearUsuario(nuevoUsuario3);
		nuevoSistema.loguearUsuario(nuevoUsuario4);
		nuevoSistema.loguearUsuario(nuevoUsuario5);
		
		nuevoSistema.calcularCantidadDeUsuariosLogueados();
		
		Integer resultadoEsperado = 5;
		
		
		
		assertEquals(resultadoEsperado,nuevoSistema.calcularCantidadDeUsuariosLogueados());
		
	}
	
	@Test
	public void queSePuedaCalcularLaCantidadDeUsuariosBloqueadosEnUnSistema() {
		
		Sistema nuevoSistema = new Sistema("Twitter", 10);
		
		Usuario nuevoUsuario = new Usuario("El Mas KPO", 150, 25);
		Usuario nuevoUsuario2 = new Usuario("Usuario2", 140, 30);
		Usuario nuevoUsuario3 = new Usuario("Usuario3", 130, 40);
		Usuario nuevoUsuario4 = new Usuario("Usuario4", 120, 23);
		Usuario nuevoUsuario5 = new Usuario("Usuario5", 110, 18);
		Usuario nuevoUsuario6 = new Usuario("Usuario6", 160, 45);
		Usuario nuevoUsuario7 = new Usuario("Usuario7", 170, 32);
		Usuario nuevoUsuario8 = new Usuario("Usuario8", 180, 35);
		Usuario nuevoUsuario9 = new Usuario("Usuario9", 190, 28);
		Usuario nuevoUsuario10 = new Usuario("Usuario10", 125, 26);
		
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario2);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario3);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario4);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario5);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario6);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario7);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario8);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario9);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario10);
		
		
		nuevoSistema.BloquearUsuario(nuevoUsuario6);
		nuevoSistema.BloquearUsuario(nuevoUsuario7);
		nuevoSistema.BloquearUsuario(nuevoUsuario8);
		nuevoSistema.BloquearUsuario(nuevoUsuario9);
		nuevoSistema.BloquearUsuario(nuevoUsuario10);
		
		nuevoSistema.calcularCantidadDeUsuariosBloqueados();
		
		Integer resultadoEsperado = 5;
		
		assertEquals(resultadoEsperado,nuevoSistema.calcularCantidadDeUsuariosBloqueados());
	}
	
	@Test
	public void queSePuedaCalcularElPorcentajeDeUsuariosLogueadosEnUnSistema() {
		
		Sistema nuevoSistema = new Sistema("Twitter", 10);
		
		Usuario nuevoUsuario = new Usuario("El Mas KPO", 150, 25);
		Usuario nuevoUsuario2 = new Usuario("Usuario2", 140, 30);
		Usuario nuevoUsuario3 = new Usuario("Usuario3", 130, 40);
		Usuario nuevoUsuario4 = new Usuario("Usuario4", 120, 23);
		Usuario nuevoUsuario5 = new Usuario("Usuario5", 110, 18);
		Usuario nuevoUsuario6 = new Usuario("Usuario6", 160, 45);
		Usuario nuevoUsuario7 = new Usuario("Usuario7", 170, 32);
		Usuario nuevoUsuario8 = new Usuario("Usuario8", 180, 35);
		Usuario nuevoUsuario9 = new Usuario("Usuario9", 190, 28);
		Usuario nuevoUsuario10 = new Usuario("Usuario10", 125, 26);
		
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario2);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario3);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario4);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario5);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario6);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario7);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario8);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario9);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario10);
		
		
		nuevoSistema.loguearUsuario(nuevoUsuario);
		nuevoSistema.loguearUsuario(nuevoUsuario2);
		nuevoSistema.loguearUsuario(nuevoUsuario3);
		nuevoSistema.loguearUsuario(nuevoUsuario4);
		nuevoSistema.loguearUsuario(nuevoUsuario5);
		
		nuevoSistema.calcularPorcentajeDeUsuariosLogueados();
		
		Integer resultadoEsperado = 50;
		
		assertEquals(resultadoEsperado,nuevoSistema.calcularPorcentajeDeUsuariosLogueados());
	}
	
	@Test
	public void queSePuedaCalcularLaEdadPromedioDeUsuariosRegistradosEnUnSistema() {
		
		Sistema nuevoSistema = new Sistema("Twitter", 10);
		
		Usuario nuevoUsuario = new Usuario("El Mas KPO", 150, 25);
		Usuario nuevoUsuario2 = new Usuario("Usuario2", 140, 30);
		Usuario nuevoUsuario3 = new Usuario("Usuario3", 130, 40);
		Usuario nuevoUsuario4 = new Usuario("Usuario4", 120, 23);
		Usuario nuevoUsuario5 = new Usuario("Usuario5", 110, 18);
		Usuario nuevoUsuario6 = new Usuario("Usuario6", 160, 45);
		Usuario nuevoUsuario7 = new Usuario("Usuario7", 170, 32);
		Usuario nuevoUsuario8 = new Usuario("Usuario8", 180, 35);
		Usuario nuevoUsuario9 = new Usuario("Usuario9", 190, 28);
		Usuario nuevoUsuario10 = new Usuario("Usuario10", 125, 26);
		
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario2);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario3);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario4);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario5);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario6);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario7);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario8);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario9);
		nuevoSistema.agregarNuevoUsuario(nuevoUsuario10);
		
		
		nuevoSistema.calcularEdadPromedioDeUsuariosRegistrados();
		
		Integer resultadoEsperado = 30;
		
		assertEquals(resultadoEsperado,nuevoSistema.calcularEdadPromedioDeUsuariosRegistrados());
	}
	
	
	
	
}
