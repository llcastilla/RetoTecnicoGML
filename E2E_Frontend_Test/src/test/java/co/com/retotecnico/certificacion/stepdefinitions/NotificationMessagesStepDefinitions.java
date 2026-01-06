package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.TextoNotificacion;
import co.com.retotecnico.certificacion.tasks.AbrirLaPagina;
import co.com.retotecnico.certificacion.tasks.IngresarANotificationMessages;
import co.com.retotecnico.certificacion.tasks.ReintentarHastaVerMensaje;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;

public class NotificationMessagesStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("ingresamos al portal principal de The Internet")
    public void queLeonardoIngresaAlPortalPrincipal() {
        leonardo.wasAbleTo(AbrirLaPagina.principal());
    }

    @When("accede a la funcionalidad Notification Messages")
    public void accedeANotificationMessages() {
        leonardo.attemptsTo(IngresarANotificationMessages.ahora());
    }

    @When("intenta obtener un mensaje de éxito")
    public void intentaObtenerMensajeExitoso() {
        leonardo.attemptsTo(
                ReintentarHastaVerMensaje.conTexto("Action successful", 5)
        );
    }

    @When("intenta obtener un mensaje de error")
    public void intentaObtenerMensajeError() {
        leonardo.attemptsTo(
                ReintentarHastaVerMensaje.conTexto("Action unsuccesful", 10)
        );
    }

    @Then("debería visualizar un mensaje que contenga {string}")
    public void deberiaVisualizarMensaje(String textoEsperado) {
        leonardo.should(
                seeThat(
                        TextoNotificacion.es(),
                        containsString(textoEsperado)
                )
        );
    }
}
