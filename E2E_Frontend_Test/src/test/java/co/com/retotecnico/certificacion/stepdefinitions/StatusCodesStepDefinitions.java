package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.tasks.AbrirStatusCodes;
import co.com.retotecnico.certificacion.tasks.IngresarStatusCodes;
import co.com.retotecnico.certificacion.tasks.VerificarStatusCodes;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class StatusCodesStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que Leonardo ingresa a la página principal de The Internet status")
    public void queLeonardoIngresaALaPaginaPrincipalDeTheInternet() {
        leonardo.wasAbleTo(AbrirStatusCodes.paginaPrincipal());
    }

    @When("selecciona la opción Status Codes")
    public void seleccionaLaOpcionStatusCodes() {
        leonardo.attemptsTo(IngresarStatusCodes.ahora());
    }

    @Then("verifica todos los status codes disponibles")
    public void verificaTodosLosStatusCodesDisponibles() {
        leonardo.attemptsTo(VerificarStatusCodes.todos());
    }
}
