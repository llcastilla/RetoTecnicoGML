package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.MensajeAutenticacion;
import co.com.retotecnico.certificacion.tasks.AutenticarseEnBasicAuth;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;

public class BasicAuthStepDefinitions {

    @Managed(driver = "firefox")
    WebDriver navegador;

    Actor leonardo = Actor.named("Leonardo");

    @Before
    public void preparar() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que Leonardo accede a la página con autenticación básica")
    public void accederConAuth() {
        leonardo.wasAbleTo(AutenticarseEnBasicAuth.conCredencialesCorrectas());
    }

    @Then("el sistema debería permitir el acceso correctamente")
    public void validarMensaje() {
        leonardo.should(
                seeThat(
                        MensajeAutenticacion.esVisible(),
                        containsString("Congratulations")
                )
        );
    }
}
