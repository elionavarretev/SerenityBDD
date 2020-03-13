package bel.enavarrete.auto.Definition;
import bel.enavarrete.auto.Steps.ProductosSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProductosDefenition {
    @Steps ProductosSteps productosSteps;

    @When("^I find the ([^\"]*) and ([^\"]*) select the details$")
    public void iFindAndSelectTheDetails(String strTipo, String strProducto) {
         productosSteps.BuscarTipoProducto(strTipo);
        productosSteps.SeleccionarProducto(strProducto);
    }

    @When("^I add ([^\"]*) and select the add$")
    public void iAddAndSelectTheAdd(String strCantidad) throws Throwable {
        productosSteps.IngresarCantidad(strCantidad);
        productosSteps.SeleccionarTipoOferta();
        productosSteps.SeleccionarAgregar();
    }

    @Then("^I verify my product is correct add$")
    public void iVerifyMyProductIsCorrectAdd() throws Throwable {

    }

}
