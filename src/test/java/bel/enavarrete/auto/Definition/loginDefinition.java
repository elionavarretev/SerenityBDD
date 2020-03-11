package bel.enavarrete.auto.Definition;

import static org.junit.Assert.assertEquals;

import bel.enavarrete.auto.Steps.loginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class loginDefinition {
	
	@Steps loginSteps loginSteps;
	

	@Given("^I select my ([^\"]*) and put my ([^\"]*) and my ([^\"]*)$")
	public void iSelectMyAndPutMyAndMy(String strPais, String strUsuario, String strContrasenia) {
		loginSteps.IngresarDatosLogin(strPais, strUsuario, strContrasenia);
	}
	
	@When("^I click on ingresar a tu cuenta$")
	public void iClickOnIngresarATuCuenta(){
		loginSteps.seleccionarIngresar();
	}
	
	@Then("^I login on system$")
	public void iLoginOnSystem(){
	    
	}
	
	@Then("^I logout on system$")
	public void iLogoutOnSystem(){
	     
		loginSteps.SeleccionarCerrarSesion();
	}
}