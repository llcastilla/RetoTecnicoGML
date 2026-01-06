package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.EditorVisible;
import co.com.retotecnico.certificacion.tasks.AbrirLaPagina;
import co.com.retotecnico.certificacion.tasks.CerrarNotificacionConJS;
import co.com.retotecnico.certificacion.tasks.IngresarAFrames;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class FramesStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void configurarEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que Leonardo accede al portal principal")
    public void accederPortal() {
        leonardo.wasAbleTo(
                AbrirLaPagina.principal()
        );
    }

    @When("navega hasta el editor dentro de Frames")
    public void navegarAFrames() {
        leonardo.attemptsTo(
                IngresarAFrames.ahora(),
                CerrarNotificacionConJS.ahora()
        );
    }

    @Then("debería visualizar correctamente el editor embebido")
    public void validarEditor() {
        leonardo.should(
                seeThat(EditorVisible.ahora(), is(true))
        );
    }
}
