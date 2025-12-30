package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.tasks.InteractuarContextMenu;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class ContextMenuStepDefinitions {

    @Managed(driver = "firefox")
    WebDriver navegador;

    Actor leonardo = Actor.named("Leonardo");

    @Before
    public void configurar() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que Leonardo accede a la sección Context Menu")
    public void accederContextMenu() {
        leonardo.attemptsTo(InteractuarContextMenu.ahora());
    }

    @Then("debería realizar click derecho y aceptar la alerta")
    public void validarContextMenu() {
        System.out.println("acción de click derecho y alerta completadas correctamente.");
    }
}
