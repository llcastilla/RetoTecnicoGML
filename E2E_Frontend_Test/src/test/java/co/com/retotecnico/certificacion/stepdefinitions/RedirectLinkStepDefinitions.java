package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.MensajeRedireccion;
import co.com.retotecnico.certificacion.tasks.AbrirLaPagina;
import co.com.retotecnico.certificacion.tasks.IngresarARedirectLink;
import co.com.retotecnico.certificacion.tasks.ValidarRedireccion;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;

public class RedirectLinkStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que Leonardo esta ingresando al portal principal de The Internet")
    public void queLeonardoIngresaAlPortalPrincipal() {
        leonardo.wasAbleTo(AbrirLaPagina.principal());
    }

    @When("accede a la funcionalidad Redirect Link")
    public void accedeARedirectLink() {
        leonardo.attemptsTo(IngresarARedirectLink.ahora());
    }

    @When("selecciona la redirección con código {string}")
    public void seleccionaLaRedireccionConCodigo(String codigo) {
        leonardo.attemptsTo(ValidarRedireccion.conCodigo(codigo));
    }

    @Then("debería visualizar un mensaje que tiene {string}")
    public void deberiaVisualizarMensaje(String mensajeEsperado) {
        leonardo.should(
                seeThat(
                        MensajeRedireccion.es(),
                        containsString(mensajeEsperado)
                )
        );
    }
}
