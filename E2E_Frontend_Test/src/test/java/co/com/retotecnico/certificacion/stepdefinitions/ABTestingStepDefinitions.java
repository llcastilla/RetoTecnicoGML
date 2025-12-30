package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.TituloPagina;
import co.com.retotecnico.certificacion.tasks.AbrirLaPagina;
import co.com.retotecnico.certificacion.tasks.IngresarALinkABTesting;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;


public class ABTestingStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que Leonardo ingresa al portal principal de The Internet")
    public void queLeonardoIngresaAlPortalPrincipalDeTheInternet() {
        leonardo.wasAbleTo(AbrirLaPagina.principal());
    }


    @When("selecciona la opción AB Testing")
    public void seleccionaLaOpciónABTesting() {
        leonardo.attemptsTo(IngresarALinkABTesting.ahora());

    }

    @Then("debería visualizar una página relacionada con AB Testing")
    public void deberíaVisualizarUnaPáginaRelacionadaConABTesting() {
        leonardo.should(
                seeThat(
                        TituloPagina.es(),
                        containsString("The Internet")
                )
        );
    }
}
