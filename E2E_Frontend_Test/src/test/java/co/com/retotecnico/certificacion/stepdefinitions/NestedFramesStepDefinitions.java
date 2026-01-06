package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.TextoFrameActual;
import co.com.retotecnico.certificacion.tasks.AbrirLaPagina;
import co.com.retotecnico.certificacion.tasks.CambiarAFrame;
import co.com.retotecnico.certificacion.tasks.IngresarANestedFrames;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;

public class NestedFramesStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("se entra portal principal de The Internet")
    public void queLeonardoIngresaAlPortalPrincipalDeTheInternet() {
        leonardo.wasAbleTo(AbrirLaPagina.principal());
    }

    @When("accede a la funcionalidad Nested Frames")
    public void accedeALaFuncionalidadNestedFrames() {
        leonardo.attemptsTo(IngresarANestedFrames.ahora());
    }

    @When("navega al frame izquierdo")
    public void navegaAlFrameIzquierdo() {
        leonardo.attemptsTo(
                CambiarAFrame.jerarquia("frame-top", "frame-left")
        );
    }

    @When("navega al frame central")
    public void navegaAlFrameCentral() {
        leonardo.attemptsTo(
                CambiarAFrame.jerarquia("frame-top", "frame-middle")
        );
    }

    @When("navega al frame derecho")
    public void navegaAlFrameDerecho() {
        leonardo.attemptsTo(
                CambiarAFrame.jerarquia("frame-top", "frame-right")
        );
    }

    @When("navega al frame inferior")
    public void navegaAlFrameInferior() {
        leonardo.attemptsTo(
                CambiarAFrame.jerarquia("frame-bottom")
        );
    }

    @Then("debería visualizar el texto {string} en el frame")
    public void deberiaVisualizarElTextoEnElFrame(String textoEsperado) {
        leonardo.should(
                seeThat(
                        TextoFrameActual.es(),
                        containsString(textoEsperado)
                )
        );
    }

}
