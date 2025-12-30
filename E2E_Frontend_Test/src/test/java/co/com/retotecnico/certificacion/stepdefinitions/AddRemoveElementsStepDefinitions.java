package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.tasks.AbrirLaPagina;
import co.com.retotecnico.certificacion.tasks.AgregarYEliminarElemento;
import co.com.retotecnico.certificacion.tasks.IngresarAAddRemove;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementsStepDefinitions {

    @Managed(driver = "firefox")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void configurar() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que Leonardo abre el portal principal")
    public void abrirPortal() {
        leonardo.wasAbleTo(AbrirLaPagina.principal());
    }

    @When("ingresa a la sección Add Remove Elements")
    public void ingresarSeccion() {
        leonardo.attemptsTo(IngresarAAddRemove.ahora());
    }

    @Then("agrega y elimina un elemento")
    public void agregarYEliminar() {
        leonardo.attemptsTo(AgregarYEliminarElemento.ahora());
    }
}
