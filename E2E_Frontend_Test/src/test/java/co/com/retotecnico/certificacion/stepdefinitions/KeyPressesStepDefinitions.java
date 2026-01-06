package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.ResultadoTecla;
import co.com.retotecnico.certificacion.tasks.AbrirLaPagina;
import co.com.retotecnico.certificacion.tasks.EnviarTeclas;
import co.com.retotecnico.certificacion.tasks.IngresarAKeyPresses;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;

public class KeyPressesStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que Leonardo accede a la sección Key Presses")
    public void queLeonardoAccedeAKeyPresses() {
        leonardo.wasAbleTo(
                AbrirLaPagina.principal(),
                IngresarAKeyPresses.ahora()
        );
    }

    @When("presiona las teclas Tab, Enter y Escape")
    public void presionaLasTeclas() {
        leonardo.attemptsTo(
                EnviarTeclas.laTecla(Keys.TAB),
                EnviarTeclas.laTecla(Keys.ENTER),
                EnviarTeclas.laTecla(Keys.ESCAPE)
        );
    }

    @Then("debería visualizar el resultado de cada tecla presionada")
    public void deberiaVerResultados() {
        leonardo.should(
                seeThat(
                        ResultadoTecla.mostrado(),
                        containsString("You entered")
                )
        );
    }
}
