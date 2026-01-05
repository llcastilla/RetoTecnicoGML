package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.OpcionSeleccionada;
import co.com.retotecnico.certificacion.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class DropdownStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que ingresa al portal principal de The Internet")
    public void ingresarAlPortal() {
        leonardo.wasAbleTo(AbrirLaPagina.principal());
    }

    @When("accede a la opción Dropdown")
    public void accederADropdown() {
        leonardo.attemptsTo(IngresarADropdown.ahora());
    }

    @And("selecciona la opción {string}")
    public void seleccionarOpcion(String opcion) {
        leonardo.attemptsTo(SeleccionarOpcionDropdown.conTexto(opcion));
    }

    @Then("debería visualizar que la opción {string} quedó seleccionada")
    public void validarOpcionSeleccionada(String opcionEsperada) {
        leonardo.should(
                seeThat(
                        OpcionSeleccionada.actual(),
                        equalTo(opcionEsperada)
                )
        );
    }
}
