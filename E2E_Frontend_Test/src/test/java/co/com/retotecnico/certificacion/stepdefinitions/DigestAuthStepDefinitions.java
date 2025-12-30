package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.tasks.AutenticarseDigest;
import co.com.retotecnico.certificacion.questions.MensajeDigest;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;

public class DigestAuthStepDefinitions {

    @Managed(driver = "firefox")
    WebDriver navegador;

    Actor leonardo = Actor.named("Leonardo");

    @Before
    public void configurar() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que Leonardo accede a Digest Authentication")
    public void accederDigestAuth() {
        leonardo.wasAbleTo(AutenticarseDigest.conCredenciales());
    }

    @Then("debería visualizar la página de acceso exitoso")
    public void validarDigestAuth() {
        leonardo.should(
                seeThat(MensajeDigest.esVisible(), containsString("Congratulations"))
        );
    }
}
