package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.MensajeHelloWorld;
import co.com.retotecnico.certificacion.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class DynamicLoadingStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que se ingresa al portal principal de The Internet")
    public void ingresarAlPortal() {
        leonardo.wasAbleTo(AbrirLaPagina.principal());
    }

    @When("accede a la opción Dynamic Loading")
    public void accederADynamicLoading() {
        leonardo.attemptsTo(IngresarADynamicLoading.ahora());
    }

    @And("ejecuta el ejemplo de carga dinámica tipo oculto")
    public void ejecutarEjemploOculto() {
        leonardo.attemptsTo(EjecutarEjemploOculto.ahora());
    }

    @And("regresa a la pantalla de Dynamic Loading")
    public void regresaPantallaDynamicLoading() {
        leonardo.attemptsTo(
                RegresarADynamicLoading.ahora()
        );
    }
    @And("ejecuta el ejemplo de carga dinámica renderizada")
    public void ejecutarEjemploRenderizado() {
        leonardo.attemptsTo(EjecutarEjemploRenderizado.ahora());
    }

    @Then("debería visualizar el mensaje {string} en ambos casos")
    public void validarMensaje(String mensajeEsperado) {
        leonardo.should(
                seeThat(
                        MensajeHelloWorld.visible(),
                        equalTo(mensajeEsperado)
                )
        );
    }

}
