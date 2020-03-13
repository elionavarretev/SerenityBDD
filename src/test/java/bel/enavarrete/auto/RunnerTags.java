/**
 * @since 02|/11/2018
 */
package bel.enavarrete.auto;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


/**
 * Ejecuta específicamente features con los tags que se determinen
 * @since 31/03/2018
 * @author enavarrete
 *
 */

@CucumberOptions (features = "src/test/resources/features/Producto.feature", tags = "@caso", snippets= SnippetType.CAMELCASE)

@RunWith(CucumberWithSerenity.class)

public class RunnerTags {

}