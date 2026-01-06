package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.TituloVentanaActual;
import co.com.retotecnico.certificacion.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class MultipleWindowsStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    private String ventanaPrincipal;

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que Leonardo accede a la funcionalidad Multiple Windows")
    public void queLeonardoAccedeAMultipleWindows() {
        leonardo.wasAbleTo(
                AbrirLaPagina.principal(),
                IngresarAMultipleWindows.ahora()
        );

        ventanaPrincipal = navegador.getWindowHandle();
    }

    @When("abre una nueva ventana")
    public void abreUnaNuevaVentana() {
        leonardo.attemptsTo(
                AbrirNuevaVentana.ahora(),
                CambiarANuevaVentana.ahora()
        );
    }

    @Then("debería visualizar correctamente la nueva ventana")
    public void deberiaVerNuevaVentana() {
        leonardo.should(
                seeThat(
                        TituloVentanaActual.es(),
                        equalTo("New Window")
                )
        );

        leonardo.attemptsTo(
                VolverAVentanaPrincipal.conId(ventanaPrincipal)
        );
    }
}
