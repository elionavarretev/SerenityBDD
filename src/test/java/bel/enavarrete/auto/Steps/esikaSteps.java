package bel.enavarrete.auto.Steps;

import bel.enavarrete.auto.PageObjects.esikaPageObjects;
import net.thucydides.core.annotations.Step;

public class esikaSteps {
	
	esikaPageObjects ebayObjects;
	
	@Step
	public void Browser() {
		ebayObjects.open();
		try {
		Thread.sleep(10000);
		}
		catch (Exception e) {
			//Do Nothing =P
		}
	}

	@Step
	public void seleccionarCategoria(String strCategoria) {
		ebayObjects.seleccionarCategoria(strCategoria);
	}
	
	@Step
	public void seleccionarMaderosa(String strTipo) {
		ebayObjects.seleccionarMaderosa(strTipo);
	}
	
	@Step
	public void seleccionarCompraOnline() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
		}
		ebayObjects.seleccionarCompraOnline();
	}
	
	@Step
	public void seleccionarSeguirComprando() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		ebayObjects.seleccionarSeguirComprando();
	}
	
	@Step
	public void ingresarFichaDelProducto(String strCualquiera) {
		ebayObjects.ingresarFicha(strCualquiera);
	}
	
	@Step
	public void agregarCantidad(String strCantidad) {
		ebayObjects.agregarCantidad(strCantidad);
	}
	
	@Step
	public void seleccionarAgregarBolsa() {		
		ebayObjects.seleccionarAgregarBolsa();
	}
	
	@Step
	public void seleccionarIrBolsa() {		
		ebayObjects.seleccionarIrBolsa();
	}
	
	@Step
	public void seleccionarIrPagarPopPup() {		
		ebayObjects.seleccionarIrPagarPopPup();
	}
	
	@Step
	public void seleccionarIrPagar() {		
		ebayObjects.seleccionarIrPagar();
	}
	
	@Step
	public void ingresarComoInvitado(String strInvitado) {	
		String[] arrInvitado = strInvitado.split(";");
		ebayObjects.ingresarNombre(arrInvitado[0].trim());
		ebayObjects.ingresarApellido(arrInvitado[1].trim());
		ebayObjects.ingresarEmail(arrInvitado[2].trim());
		ebayObjects.ingresarConfirmarEmail(arrInvitado[3].trim());
		
		ebayObjects.seleccionarIniciarComoInvitado();
	}
	
	
	@Step
	public void ingresarDireccionEnvio(String strEnvio) {	
		String[] arrEnvio = strEnvio.split(";");
		ebayObjects.SeleccionarDepartamento(arrEnvio[0]);
		ebayObjects.SeleccionarProvincia(arrEnvio[1]);
		ebayObjects.SeleccionarDistrito(arrEnvio[2]);
		ebayObjects.ingresarDireccion(arrEnvio[3]);
		ebayObjects.ingresarPiso(arrEnvio[4]);
		ebayObjects.ingresarReferencia(arrEnvio[5]);
		ebayObjects.ingresarTelefono(arrEnvio[6]);
		
		ebayObjects.seleccionarContinuar();
	}
	
	@Step
	public void ingresarNombre(String strNombre) {		
		ebayObjects.ingresarNombre(strNombre);
	}
	
	@Step
	public void ingresarApellido(String strApellido) {		
		ebayObjects.ingresarApellido(strApellido);
	}
	
	@Step
	public void ingresarEmail(String strEmail) {		
		ebayObjects.ingresarEmail(strEmail);
	}
	
	@Step
	public void ingresarConfirmarEmail(String strConfirmarEmail) {		
		ebayObjects.ingresarConfirmarEmail(strConfirmarEmail);
	}
	
	@Step
	public void seleccionarAceptoAutorización() {		
		ebayObjects.seleccionarAceptoAutorización();
	}
	
	@Step
	public void seleccionarIniciarComoInvitado() {		
		ebayObjects.seleccionarIniciarComoInvitado();
	}
	
	@Step
	public void SeleccionarDepartamento(String strDepartamento) {		
		ebayObjects.SeleccionarDepartamento(strDepartamento);
	}

	@Step
	public void seleccionarAnulaCompra() {		
		ebayObjects.seleccionarIrBolsaCompra();
		ebayObjects.seleccionarEliminar();
	}
	
	@Step
	public String obtenerMensajeConfirmaEliminacion() {		
		return ebayObjects.obtenerMensajeConfirmaEliminacion();
	}
}
