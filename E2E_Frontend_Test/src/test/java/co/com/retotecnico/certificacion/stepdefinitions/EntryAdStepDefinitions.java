package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.tasks.AbrirLaPagina;
import co.com.retotecnico.certificacion.tasks.CerrarEntryAd;
import co.com.retotecnico.certificacion.tasks.IngresarAEntryAd;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class EntryAdStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que el usuario ingresa al portal principal")
    public void ingresarAlPortal() {
        leonardo.wasAbleTo(AbrirLaPagina.principal());
    }

    @When("ingresa a la opción Entry Ad y cierra el anuncio emergente")
    public void cerrarEntryAd() {
        leonardo.attemptsTo(
                IngresarAEntryAd.ahora(),
                CerrarEntryAd.ahora()
        );
    }
}
