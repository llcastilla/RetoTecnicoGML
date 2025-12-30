package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.tasks.InteractuarChallengingDOM;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class ChallengingDOMStepDefinitions {

    @Managed(driver = "firefox")
    WebDriver navegador;

    Actor leonardo = Actor.named("Leonardo");

    @Before
    public void configurar() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que Leonardo ingresa a Challenging DOM")
    public void ingresarChallengingDOM() {
        leonardo.attemptsTo(InteractuarChallengingDOM.ahora());
    }

    @Then("debería interactuar con los botones correctamente")
    public void interactuarBotones() {
        System.out.println("✅ Interacciones completadas en Challenging DOM");
    }
}
