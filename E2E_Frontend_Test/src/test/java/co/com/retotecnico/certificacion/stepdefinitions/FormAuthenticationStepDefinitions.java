package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.LoginExitoso;
import co.com.retotecnico.certificacion.tasks.AbrirLaPagina;
import co.com.retotecnico.certificacion.tasks.Autenticarse;
import co.com.retotecnico.certificacion.tasks.CerrarSesion;
import co.com.retotecnico.certificacion.tasks.IngresarAFormAuthentication;
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

public class FormAuthenticationStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que Leonardo accede al portal de The Internet")
    public void accederPortal() {
        leonardo.wasAbleTo(
                AbrirLaPagina.principal()
        );
    }

    @When("inicia sesión con el usuario {string} y la contraseña {string}")
    public void iniciarSesion(String usuario, String contrasena) {
        leonardo.attemptsTo(
                IngresarAFormAuthentication.ahora(),
                Autenticarse.conCredenciales(usuario, contrasena)
        );
    }

    @Then("debería autenticarse correctamente y cerrar sesión")
    public void validarLoginYCerrarSesion() {
        leonardo.should(
                seeThat(LoginExitoso.confirmado(), is(true))
        );

        leonardo.attemptsTo(
                CerrarSesion.ahora()
        );
    }


}
