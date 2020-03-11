package bel.enavarrete.auto.Steps;

import org.openqa.selenium.interactions.Actions;

import bel.enavarrete.auto.PageObjects.loginPageObjects;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class loginSteps {
	loginPageObjects loginObjects;
	
	
	
	@Step
	public void Browser() {
		loginObjects.open();
		try {
		Thread.sleep(10000);
		}
		catch (Exception e) {
			//Do Nothing =P
		}
	}
	
	@Step
	public void ingresarUsuario(String strUsuario) {		
		loginObjects.ingresarUsuario(strUsuario);
	}
	
	@Step
	public void ingresarContrasenia(String strContrasenia) {		
		loginObjects.ingresarContrasenia(strContrasenia);
	}
	
	@Step
	public void seleccionarIngresar() {		
		loginObjects.seleccionarIngresar();
	}
	
	@Step
	public void SeleccionarPais(String strPais) {
		loginObjects.SeleccionarPais(strPais);
	}
	
	@Step
	public void IngresarDatosLogin(String strPais, String strUsuario,String strContrasenia ) {
		Browser();
		loginObjects.SeleccionarPais(strPais);
		loginObjects.ingresarUsuario(strUsuario);
		loginObjects.ingresarContrasenia(strContrasenia);
	}
	
	@Step
	public void SeleccionarCerrarSesion() {
		loginObjects.SeleccionarCerrarSesion();
	}
}
