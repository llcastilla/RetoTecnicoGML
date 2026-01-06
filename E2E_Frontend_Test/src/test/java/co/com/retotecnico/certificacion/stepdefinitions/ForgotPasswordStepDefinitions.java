package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.SolicitudEnviada;
import co.com.retotecnico.certificacion.tasks.AbrirLaPagina;
import co.com.retotecnico.certificacion.tasks.IngresarAForgotPassword;
import co.com.retotecnico.certificacion.tasks.SolicitarRecuperacionContrasena;
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

public class ForgotPasswordStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que se encuentra en el portal principal de The Internet")
    public void accederAlPortal() {
        leonardo.wasAbleTo(
                AbrirLaPagina.principal()
        );
    }

    @When("solicita la recuperación de contraseña con el correo {string}")
    public void solicitarRecuperacion(String correo) {
        leonardo.attemptsTo(
                IngresarAForgotPassword.ahora(),
                SolicitarRecuperacionContrasena.conCorreo(correo)
        );
    }

    @Then("el sistema debería procesar la solicitud de recuperación")
    public void validarSolicitud() {
        leonardo.should(
                seeThat(
                        SolicitudEnviada.exitosamente(),
                        is(true)
                )
        );
    }


}
