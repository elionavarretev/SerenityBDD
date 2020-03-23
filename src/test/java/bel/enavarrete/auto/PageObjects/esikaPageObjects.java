package bel.enavarrete.auto.PageObjects;


import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://lbel.tiendabelcorp.com/pe/search/?text=bio")

public class esikaPageObjects extends PageObject{

	String lnkMaderosa = "/html/body/main/div[1]/header/nav[3]/div/ul[2]/li[2]/div[2]/div/div[1]/div[2]/ul/li[1]/a";
	String btnCompraOnline = "//*[@id='addToCartButton_200089222']";  
	String btnIrAlProducto = "/html/body/main/div[4]/div/div[2]/div/div/div[2]/div[1]/div";

	String btnSeguirComprando = "//*[@id='addToCartLayer']/a[2]";
	String lnkFichaProducto = "product_productName_200079595";
	
	String txtCantidad = "pdpAddtoCartInput";
	String btnAgregarBolsa = "addToCartButton";
	String btnIrBolsa = "/html/body/main/div[1]/header/nav[1]/div/div/div[2]/div/ul/li[2]/div/div[2]/div/a/div[2]";
	String btnIrPagarPopup = "//*[@id='addToCartLayer']/a[1]";
	
	String btnIrPagar = "/html/body/main/section[1]/div/div/div[1]/div/div[2]/div/div/div/div[1]";
					    
	String lblopcional = "/html/body/main/section[1]/div/div/div[2]/div/div[3]/div[3]/div";
	String txtNombre = "guest.firstName";
	String txtApellido = "guest.lastName";
	String txtEmail = "guest.email";
	String txtConfirmarEmail = "guest.confirm.email";
	String chkAceptoAutorizacion = "//*[@id='guestForm']/div[7]/div/input";
	String btnIniciarComoInvitado = "//*[@id='guestForm']/div[8]/button";
	
	String cmbDepartamento = "address.regionIsoParent2";
	String cmbProvincia = "address.regionIsoParent1";
	String cmbDistrito = "address.regionIso";
	String txtDireccion = "address.line1";
	String txtPiso = "address.line2";
	String txtReferencia = "address.referencia";
	String txtTelefono = "address.phone";
	String btnContinuar = "addressSubmit";
	String btnIrATienda = "//*[@id=\"_2_eqL1nhjcAHh9GEklzlA6\"]/div[1]/div[3]";
	String txtBuscar = "js-site-search-input";
	
	String btnEliminar = "/html/body/main/section[1]/div/div/div[1]/div/ul/li[2]/table/tbody/tr/td/li[1]/div[8]/div/a/span";
	String lblEtiquetaEliminar = "/html/body/main/div[2]/div/div/div";
	String btnBuscar = "/html/body/main/div[1]/header/nav[2]/div/div[2]/div/div/div[2]/div/div/div/form/div/div/span/button";
	
	public void seleccionarCategoria(String strCategoria) {
		Serenity.takeScreenshot();
		 Actions builder = new Actions(getDriver());
		 WebElementFacade Element =find(By.linkText(strCategoria)); 
		 builder.moveToElement(Element).build().perform();
		Serenity.takeScreenshot();
	}
	
	public void seleccionarMaderosa(String strTipo) {
		WebElementFacade Element =find(By.linkText(strTipo)); 
		Element.click();
		Serenity.takeScreenshot();
	}
	
	public void seleccionarCompraOnline() {
		find(By.xpath(btnCompraOnline)).click();		
		Serenity.takeScreenshot();
	}
	
	public void seleccionarSeguirComprando() {		
		find(By.xpath(btnSeguirComprando)).click();		
		Serenity.takeScreenshot();
	}
	
	public void ingresarFicha(String strCualquiera) {
		WebElementFacade Element =find(By.linkText(strCualquiera)); 
		Element.click();
		Serenity.takeScreenshot();
	}
	
	public void agregarCantidad(String strCantidad) {
		find(By.id(txtCantidad)).clear();
		find(By.id(txtCantidad)).sendKeys(strCantidad);	
		Serenity.takeScreenshot();
	}
	
	public void seleccionarAgregarBolsa() {		
		find(By.id(btnAgregarBolsa)).click();		
		Serenity.takeScreenshot();
	}
	
	public void seleccionarIrBolsa() {		
		find(By.id(btnIrBolsa)).click();		
		Serenity.takeScreenshot();
	}
	
	public void seleccionarIrPagarPopPup() {		
		find(By.xpath(btnIrPagarPopup)).click();		
		Serenity.takeScreenshot();
	}
	
	public void seleccionarIrPagar() {		
		getDriver().get("https://compra.tiendabelcorp.com/pe/cart/checkout");
		Serenity.takeScreenshot();
	}
	
	public void seleccionarIrBolsaCompra() {		
		getDriver().get("https://compra.tiendabelcorp.com/pe/cart");
		Serenity.takeScreenshot();
	}
	
	public void ingresarNombre(String strNombre) {		
		find(By.id(txtNombre)).sendKeys(strNombre);	
		Serenity.takeScreenshot();
	}
	
	public void ingresarApellido(String strApellido) {		
		find(By.id(txtApellido)).sendKeys(strApellido);	
		Serenity.takeScreenshot();
	}
	
	public void ingresarEmail(String strEmail) {		
		find(By.id(txtEmail)).sendKeys(strEmail);	
		Serenity.takeScreenshot();
	}
	
	public void ingresarConfirmarEmail(String strConfirmarEmail) {		
		find(By.id(txtConfirmarEmail)).sendKeys(strConfirmarEmail);	
		Serenity.takeScreenshot();
	}
	
	public void seleccionarAceptoAutorización() {		
		find(By.id(chkAceptoAutorizacion)).click();
	}
	
	public void seleccionarIniciarComoInvitado() {		
		find(By.xpath(btnIniciarComoInvitado)).click();
	}
	
	public void SeleccionarDepartamento(String strDepartamento) {
		find(By.id(cmbDepartamento)).click();
		find(By.id(cmbDepartamento)).selectByVisibleText(strDepartamento);
		Serenity.takeScreenshot();
	}
	
	public void SeleccionarProvincia(String strProvincia) {
		find(By.id(cmbProvincia)).click();
		find(By.id(cmbProvincia)).selectByVisibleText(strProvincia);
		Serenity.takeScreenshot();
	}
	
	public void SeleccionarDistrito(String strDistrito) {
		find(By.id(cmbDistrito)).click();
		find(By.id(cmbDistrito)).selectByVisibleText(strDistrito);
		Serenity.takeScreenshot();
	}
	
	public void ingresarDireccion(String strDireccion) {		
		find(By.id(txtDireccion)).sendKeys(strDireccion);	
	}
	
	public void ingresarPiso(String strPiso) {		
		find(By.id(txtPiso)).sendKeys(strPiso);	
		Serenity.takeScreenshot();
	}
	
	public void ingresarReferencia(String strReferencia) {		
		find(By.id(txtReferencia)).sendKeys(strReferencia);	
		Serenity.takeScreenshot();
	}
		
	public void ingresarTelefono(String strTelefono) {		
		find(By.id(txtTelefono)).sendKeys(strTelefono);	
		Serenity.takeScreenshot();
	}
	
	public void seleccionarContinuar() {		
		find(By.id(btnContinuar)).click();
		Serenity.takeScreenshot();
	}
	
	public void seleccionarEliminar() {		
		find(By.xpath(btnEliminar)).click();
		Serenity.takeScreenshot();
	}
	
	public String obtenerMensajeConfirmaEliminacion() {		
		return find(By.xpath(lblEtiquetaEliminar)).getText();
	}

	public void seleccionarIrATienda() {
		if(find(By.xpath(btnIrATienda)).waitUntilVisible() .isVisible()) {
			find(By.xpath(btnIrATienda)).click();
		}
	}

	public void ingresarDato(String strDato) {
		find(By.id(txtBuscar)).sendKeys(strDato);
		find(By.xpath(btnBuscar)).click();
	}
}
