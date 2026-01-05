package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.CampoTextoDeshabilitado;
import co.com.retotecnico.certificacion.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class DynamicControlsStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("ingresa al portal principal de The Internet")
    public void ingresarAlPortal() {
        leonardo.wasAbleTo(AbrirLaPagina.principal());
    }

    @When("accede a la opción Dynamic Controls")
    public void accederADynamicControls() {
        leonardo.attemptsTo(IngresarADynamicControls.ahora());
    }

    @And("elimina el checkbox")
    public void eliminarCheckbox() {
        leonardo.attemptsTo(EliminarCheckbox.ahora());
    }

    @And("agrega nuevamente el checkbox")
    public void agregarCheckbox() {
        leonardo.attemptsTo(AgregarCheckbox.ahora());
    }

    @And("habilita el campo de texto")
    public void habilitarCampo() {
        leonardo.attemptsTo(GestionarCampoTexto.conTexto("Check"));
    }

    @Then("debería visualizar que el campo de texto se encuentra deshabilitado")
    public void validarCampoDeshabilitado() {
        leonardo.should(
                seeThat(
                        CampoTextoDeshabilitado.esVisible(),
                        is(true)
                )
        );
    }

}
