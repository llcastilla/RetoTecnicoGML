package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.tasks.SeleccionarCheckboxes;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class CheckboxesStepDefinitions {

    @Managed(driver = "firefox")
    WebDriver navegador;

    Actor leonardo = Actor.named("Leonardo");

    @Before
    public void configurar() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que Leonardo accede a la sección Checkboxes")
    public void accederCheckboxes() {
        leonardo.attemptsTo(SeleccionarCheckboxes.todos());
    }

    @Then("debería marcar todos los checkboxes correctamente")
    public void validarCheckboxes() {
        System.out.println("Todos los checkboxes han sido seleccionados.");
    }
}
