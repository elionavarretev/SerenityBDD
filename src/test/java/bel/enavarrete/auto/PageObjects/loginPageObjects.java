package bel.enavarrete.auto.PageObjects;

import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://nuevoqas.somosbelcorp.com/")

public class loginPageObjects extends PageObject{

	String txtUsuario = "txtUsuario";
	String txtContrasenia = "txtContrasenia";  
	String ddlPais = "ddlPais";
	String btnIngresar = "btnLogin";
	
	
	
	public void ingresarUsuario(String strUsuario) {		
		find(By.id(txtUsuario)).sendKeys(strUsuario);	
		Serenity.takeScreenshot();
	}
	
	public void ingresarContrasenia(String strContrasenia) {		
		find(By.id(txtContrasenia)).sendKeys(strContrasenia);	
		Serenity.takeScreenshot();
	}
	
	public void seleccionarIngresar() {		
		find(By.id(btnIngresar)).click();
		Serenity.takeScreenshot();
	}
	
	public void SeleccionarPais(String strPais) {
		find(By.id(ddlPais)).click();
		find(By.id(ddlPais)).selectByVisibleText(strPais);
		Serenity.takeScreenshot();
	}
	
	public void SeleccionarCerrarSesion() {
	 Actions builder = new Actions(getDriver());
	 WebElementFacade Element =find(By.linkText("Cerrar sesión")); 
	 builder.moveToElement(Element).build().perform();
	 Serenity.takeScreenshot();
	}
}
