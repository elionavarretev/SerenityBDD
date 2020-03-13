package bel.enavarrete.auto.Steps;

import bel.enavarrete.auto.PageObjects.ProductosPageObjects;
import net.thucydides.core.annotations.Step;

public class ProductosSteps {
    ProductosPageObjects productosObjects;

    @Step
    public void BuscarTipoProducto(String strProducto) {
        productosObjects.BuscarTipoProducto(strProducto);
    }

    @Step
    public void IngresarCantidad(String strCantidad) {
        productosObjects.IngresarCantidad(strCantidad);
    }

    @Step
    public void SeleccionarTipoOferta() {
        productosObjects.SeleccionarTipoOferta();
    }

    @Step
    public void SeleccionarAgregar() {
        productosObjects.SeleccionarAgregar();
    }

    public void SeleccionarProducto(String strProducto) {
        productosObjects.SeleccionarProducto(strProducto);
    }
}
