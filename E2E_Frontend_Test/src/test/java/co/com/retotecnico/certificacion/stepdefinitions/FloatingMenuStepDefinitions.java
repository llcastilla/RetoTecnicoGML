package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.MenuEsFlotante;
import co.com.retotecnico.certificacion.tasks.AbrirLaPagina;
import co.com.retotecnico.certificacion.tasks.HacerScroll;
import co.com.retotecnico.certificacion.tasks.IngresarAFloatingMenu;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

public class FloatingMenuStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("se ingresa al portal principal de The Internet")
    public void ingresarPortal() {
        leonardo.wasAbleTo(
                AbrirLaPagina.principal()
        );
    }

    @When("navega a Floating Menu y realiza scroll en la página")
    public void navegarYHacerScroll() {
        leonardo.attemptsTo(
                IngresarAFloatingMenu.ahora(),
                HacerScroll.vertical(500)
        );
    }

    @Then("el menú debería permanecer flotante")
    public void validarMenuFlotante() {
        leonardo.should(
                seeThat(
                        MenuEsFlotante.ahora(),
                        is(false)
                )
        );
    }


}
