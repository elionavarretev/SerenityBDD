package bel.enavarrete.auto.Definition;

import static org.junit.Assert.assertEquals;

import bel.enavarrete.auto.Steps.esikaSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class esikaDefinition {

	@Steps esikaSteps esikaSteps;
	

	@Given("^que un invitado y entra a la web esika$")
	public void queUnInvitadoYEntraALaWebesika(){
		esikaSteps.Browser();
	}


	@Given("^además, selecciona ([^\"]*) y selecciona ([^\"]*)$")
	public void ademásSeleccionaPerfumesYSeleccionaMaderosa(String strCategoria, String strTipo) {
		esikaSteps.seleccionarCategoria(strCategoria);
		esikaSteps.seleccionarMaderosa(strTipo);
	}

	@When("^se dirige a la ficha del producto ([^\"]*)$")
	public void seDirigeALaFichaDelProducto(String strCualquiera){
		esikaSteps.ingresarFichaDelProducto(strCualquiera);
	}

	@When("^agrega ([^\"]*) adicional$")
	public void agregaAdicional(String strCantidad){
		esikaSteps.agregarCantidad(strCantidad);
	}

	@Then("^agrega a la bolsa$")
	public void agregaALaBolsa() {
		esikaSteps.seleccionarAgregarBolsa();
	}

	@Then("^se registra como ([^\"]*)$")
	public void seRegistraComoInvitadoYDar(String strInvitado){
		esikaSteps.seleccionarIrPagarPopPup();
		esikaSteps.seleccionarIrPagar();
		esikaSteps.ingresarComoInvitado(strInvitado);
	}

	@Then("^se registra la dirección de ([^\"]*) y anula la compra$")
	public void seRegistraLaDirecciónDeYAnulaLaCompra(String strEnvio) {
		esikaSteps.ingresarDireccionEnvio(strEnvio);
		esikaSteps.seleccionarAnulaCompra();
		String mensaje[] = esikaSteps.obtenerMensajeConfirmaEliminacion().split("\n");
		
		assertEquals("El producto ha sido eliminado de tu Carrito.", mensaje[1].trim());	
	}


}
