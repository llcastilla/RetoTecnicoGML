package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.TituloOnloadEventError;
import co.com.retotecnico.certificacion.tasks.AbrirLaPagina;
import co.com.retotecnico.certificacion.tasks.IngresarAOnloadEventError;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class OnloadEventErrorStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que Leonardo accede a la página JavaScript onload event error")
    public void queLeonardoAccedeALaPagina() {
        leonardo.wasAbleTo(
                AbrirLaPagina.principal(),
                IngresarAOnloadEventError.ahora()
        );
    }

    @Then("debería visualizar correctamente la página a pesar del error JavaScript")
    public void deberiaVisualizarLaPagina() {
        leonardo.should(
                seeThat(
                        TituloOnloadEventError.es(),
                        equalTo("Page with JavaScript errors on load")
                )
        );
    }
}
