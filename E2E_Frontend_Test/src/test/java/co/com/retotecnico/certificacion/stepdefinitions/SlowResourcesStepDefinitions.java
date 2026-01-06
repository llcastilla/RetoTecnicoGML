package co.com.retotecnico.certificacion.stepdefinitions;

import co.com.retotecnico.certificacion.questions.TituloSlowResources;
import co.com.retotecnico.certificacion.tasks.AbrirSlowResources;
import co.com.retotecnico.certificacion.tasks.IngresarSlowResources;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.WebDriver;


public class SlowResourcesStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver navegador;

    private final Actor leonardo = Actor.named("Leonardo");

    @Before
    public void prepararEscenario() {
        leonardo.can(BrowseTheWeb.with(navegador));
    }

    @Given("que Leonardo ingresa a la página principal de The Internet Slow")
    public void queLeonardoIngresaALaPaginaPrincipalDeTheInternet() {
        leonardo.wasAbleTo(AbrirSlowResources.paginaPrincipal());
    }

    @When("selecciona la opción Slow Resources")
    public void seleccionaLaOpcionSlowResources() {
        leonardo.attemptsTo(IngresarSlowResources.ahora());
    }

    @Then("debería visualizar la página de Slow Resources")
    public void deberiaVisualizarLaPaginaDeSlowResources() {
        leonardo.attemptsTo(
                Ensure.that(TituloSlowResources.es()).isEqualTo("Slow Resources")
        );
    }
}
