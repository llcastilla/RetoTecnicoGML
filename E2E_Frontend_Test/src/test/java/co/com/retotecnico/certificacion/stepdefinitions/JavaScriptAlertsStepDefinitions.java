package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.MensajeResultado;
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
import static org.hamcrest.CoreMatchers.containsString;

public class JavaScriptAlertsStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que Leonardo accede a la sección JavaScript Alerts")
    public void queLeonardoAccedeAJavaScriptAlerts() {
        leonardo.wasAbleTo(
                AbrirLaPagina.principal(),
                IngresarAJavaScriptAlerts.ahora()
        );
    }

    @When("interactúa con todos los tipos de alertas JavaScript")
    public void interactuaConTodasLasAlertas() {
        leonardo.attemptsTo(
                AceptarJSAlert.ahora(),
                GestionarJSConfirm.completo(),
                GestionarJSPrompt.completo()
        );
    }

    @Then("debería visualizar los mensajes correspondientes a cada interacción")
    public void deberiaVerLosMensajes() {
        leonardo.should(
                seeThat(
                        MensajeResultado.mostrado(),
                        containsString("You entered")
                )
        );
    }
}
