package bel.enavarrete.auto.PageObjects;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductosPageObjects extends PageObject{

    String txtBuscar = "/html/body/app-root/cx-storefront/header/cx-page-layout[1]/cx-page-slot[2]/belcorp-search-box/label/input";
    String txtCantidad = "/html/body/app-root/cx-storefront/cx-page-layout/cx-page-slot[1]/app-belcorp-product-summary/div/div/div[2]/div/div/div/app-belcorp-add-to-cart/div/div[1]/cx-item-counter/div/div/input";
    String btnAgregar = "/html/body/app-root/cx-storefront/cx-page-layout/cx-page-slot[1]/app-belcorp-product-summary/div/div/div[2]/div/div/div/app-belcorp-add-to-cart/div/div[2]/button";
    String txtTipoOferta = "/html/body/app-root/cx-storefront/cx-page-layout/cx-page-slot[1]/app-belcorp-product-summary/div/div/div[2]/div/div/div/div/div[3]/label/span[1]";

    public void BuscarTipoProducto(String strProducto) {
        find(By.xpath(txtBuscar)).clear();
        find(By.xpath(txtBuscar)).sendKeys(strProducto);
        Serenity.takeScreenshot();
    }

    public void SeleccionarProducto(String strProducto) {
        int row_num =1;
        String strDes ="";
        List<WebElementFacade> ul_collection = findAll(By.xpath("/html/body/app-root/cx-storefront/header/cx-page-layout[1]/cx-page-slot[2]/belcorp-search-box/div/ul"));

        for(WebElementFacade liElement  : ul_collection){
            List<WebElement> div_collection= liElement.findElements(By.xpath("li"));

            for(WebElement div1Element : div_collection)
            {

                strDes = div1Element.getText();

                if(strDes.indexOf(strProducto)>=0){
                    div1Element.click();
                    break;
                }

                row_num++;
            }


        }

    }

    public void IngresarCantidad(String strCantidad) {
        find(By.xpath(txtCantidad)).clear();
        find(By.xpath(txtCantidad)).sendKeys(strCantidad);
        Serenity.takeScreenshot();
    }

    public void SeleccionarTipoOferta() {
        find(By.xpath(txtTipoOferta)).click();
        Serenity.takeScreenshot();
    }

    public void SeleccionarAgregar() {
        find(By.xpath(btnAgregar)).click();
        Serenity.takeScreenshot();
    }
}
