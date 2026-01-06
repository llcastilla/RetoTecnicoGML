package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.tasks.DescargarArchivosJQuery;
import co.com.retotecnico.certificacion.tasks.ValidarEstadoMenusJQuery;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;

public class JQueryUiMenusStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void configurarEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que Leonardo ingresa a la sección JQuery UI Menus")
    public void ingresarAJqueryUiMenus() {
        leonardo.wasAbleTo(
                Open.url("https://the-internet.herokuapp.com/jqueryui/menu")
        );
    }

    @When("valida el estado de las opciones del menú")
    public void validaEstadoOpciones() {
        leonardo.attemptsTo(
                ValidarEstadoMenusJQuery.ahora()
        );
    }

    @Then("descarga los archivos disponibles en el menú")
    public void descargaArchivos() {
        leonardo.attemptsTo(
                DescargarArchivosJQuery.ahora()
        );
    }
}
